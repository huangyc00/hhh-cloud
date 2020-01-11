package com.hyc.api.order.fallback;

import com.hyc.api.order.api.OrderItemApi;

import com.order.model.entity.OrderItem;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class OrderItemFallBack implements OrderItemApi {


    @Override
    public ResponseEntity<OrderItem> test(String id) {
        throw new RuntimeException("订单服务不可用");
    }

    @Override
    public OrderItem findById(String id) {
        throw new RuntimeException("订单服务不可用");
    }

    @Override
    public OrderItem defaultSaveOrUpdate(OrderItem entity) {
        throw new RuntimeException("订单服务不可用");
    }

    @Override
    public Boolean save(OrderItem entity) {
        throw new RuntimeException("订单服务不可用");
    }

    @Override
    public Boolean deleteById(String id) {
        throw new RuntimeException("订单服务不可用");
    }

    @Override
    public OrderItem findHasFinishOrderItem(String id, String memberId) {
        throw new RuntimeException("订单服务不可用");
    }
}
