package com.hyc.product.api.fallback;

import com.hyc.product.api.service.ProductService;
import com.product.model.entity.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class ProductFallBack implements ProductService {


    @Override
    public Product findById(@PathVariable("id") String id) {
        throw new RuntimeException("运行时异常");
    }

}
