package com.hyc.api.order.api;

import com.order.model.entity.Order;
import com.order.model.entity.OrderItemValueAddedService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "hhh-provider-order")
public interface OrderItemValueAddedServiceApi {


    @GetMapping(value = "/order/findById")
    OrderItemValueAddedService findById(@RequestParam String id);

    @PostMapping(value = "/order/defaultSaveOrUpdate")
    OrderItemValueAddedService defaultSaveOrUpdate(@RequestBody OrderItemValueAddedService entity);


    @PostMapping(value = "/order/save")
    Boolean save(@RequestBody OrderItemValueAddedService entity);


    @PostMapping(value = "/order/deleteById")
    Boolean deleteById(String id);

    @GetMapping(value = "/order/findListByOrderItemIdAndServiceType")
    List<OrderItemValueAddedService> findListByOrderItemIdAndServiceType(@RequestParam String orderItemId,@RequestParam Integer serviceType);
}
