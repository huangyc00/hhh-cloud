package com.hyc.user.api.fallback;

import com.hyc.user.api.entity.Product;
import com.hyc.user.api.service.ProductService;

public class ProductFallBack implements ProductService {


    @Override
    public Product findById(String id) {
        return null;
    }

}
