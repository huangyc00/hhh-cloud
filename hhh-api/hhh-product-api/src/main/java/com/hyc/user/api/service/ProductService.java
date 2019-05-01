package com.hyc.user.api.service;

import com.product.model.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "hhh-provider-product")
public interface ProductService {

    @GetMapping(value = "/api/product/{id}")
    Product findById(@PathVariable("id") String id);


}
