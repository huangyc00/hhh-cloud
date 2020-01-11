package com.hyc.api.order.api;

import com.order.model.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hhh-provider-order")
public interface OrderApi {
    

    @GetMapping(value = "/order/findById")
    Order findById(@RequestParam String id);

    @PostMapping(value = "/order/defaultSaveOrUpdate")
    Order defaultSaveOrUpdate(@RequestBody Order entity);


    @PostMapping(value = "/order/save")
    Boolean save(@RequestBody Order entity);


    @PostMapping(value = "/order/deleteById")
    Boolean deleteById(String id);


}
