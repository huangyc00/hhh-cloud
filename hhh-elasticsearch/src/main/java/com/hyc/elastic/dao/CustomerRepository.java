package com.hyc.elastic.dao;

import com.hyc.elastic.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepository  extends ElasticsearchRepository<Customer, String> {

    public List<Customer> findByFirstName(String firstName);
    public Page<Customer> findByLastName(String lastName, Pageable page);
    public List<Customer> findByFirstNameAndLastName(String firstName,String lastName);

}
