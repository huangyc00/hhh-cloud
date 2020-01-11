package com.hyc.api.order.fallback;

import com.hyc.api.order.api.OrderApi;
import com.order.model.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderFallBack implements OrderApi {


    @Override
    public Order findById(String id) {
        return null;
    }

    @Override
    public Order defaultSaveOrUpdate(Order order) {
        return null;
    }

    @Override
    public Boolean save(Order entity) {
        return null;
    }

    @Override
    public Boolean deleteById(String id) {
        return null;
    }
}
