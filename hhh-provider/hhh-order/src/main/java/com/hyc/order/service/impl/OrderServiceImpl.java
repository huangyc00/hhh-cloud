package com.hyc.order.service.impl;

import com.hyc.order.api.service.OrderService;
import com.order.model.entity.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hyc
 * @description
 * @date 2019-06-18 11:54
 */
@RestController
public class OrderServiceImpl implements OrderService {


    @Override
    public Order findById(@PathVariable("id") String id) {
        Order order = new Order();
        order.setId(id);
        order.setName("order");
        return order;
    }
}
