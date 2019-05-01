package com.hyc.user.api.fallback;

import com.hyc.user.api.service.ProductService;
import com.product.model.entity.Product;

public class ProductFallBack implements ProductService {


    @Override
    public Product findById(String id) {
        return null;
    }

}
