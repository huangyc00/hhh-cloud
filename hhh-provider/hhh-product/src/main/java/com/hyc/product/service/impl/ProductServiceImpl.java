package com.hyc.product.service.impl;

import com.hyc.api.product.service.ProductService;
import com.product.model.entity.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hyc
 * @description
 * @date 2019-06-18 11:28
 */
@RestController
public class ProductServiceImpl implements ProductService {



    @Override
    public Product findById(@PathVariable("id") String id) {
        Product product = new Product();
        product.setId(id);
        return product;
    }

}
