package com.hyc.order.api.service;

import com.order.model.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author hyc
 * @description
 * @date 2019-06-18 11:39
 */
@FeignClient(value = "hhh-provider-order" )
public interface OrderService {

    @GetMapping(value = "/api/com.hyc.order/{id}")
    Order findById(@PathVariable("id") String id);

}
