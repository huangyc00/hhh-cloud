package com.hyc.elastic.controller;

import com.hyc.elastic.dao.CustomerRepository;
import com.hyc.elastic.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AbstractPageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.ScrolledPage;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @GetMapping(value = "/findByFirstName")
    public List<Customer> findByFirstName(String firstName){
        return customerRepository.findByFirstName(firstName);
    }

    @PostMapping(value = "/save")
    public Customer save(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }


    @GetMapping(value = "/findPage")
    public Page<Customer> findPage(Integer page, Integer size){
        Pageable pageable = PageRequest.of(page,size);
        return customerRepository.findAll(pageable);
    }

    @GetMapping(value = "/scroll")
    public void scroll(){
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withIndices("es-customer")
                .withTypes("customer")
                .withPageable(PageRequest.of(0, 10))
                .build();

        Page<Customer> scroll = elasticsearchTemplate.startScroll(1000, searchQuery, Customer.class);

        String scrollId = ((ScrolledPage) scroll).getScrollId();
        List<Customer> sampleEntities = new ArrayList<>();
        while (scroll.hasContent()) {
            sampleEntities.addAll(scroll.getContent());
            scrollId = ((ScrolledPage) scroll).getScrollId();
            scroll = elasticsearchTemplate.continueScroll(scrollId, 1000, Customer.class);
        }
        elasticsearchTemplate.clearScroll(scrollId);
    }
}
