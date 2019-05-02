package com.hyc.product.api.fallback;

import com.hyc.product.api.service.ProductService;
import com.product.model.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductFallBack implements ProductService {


    @Override
    public Product findById(String id) {
        return null;
    }

}
