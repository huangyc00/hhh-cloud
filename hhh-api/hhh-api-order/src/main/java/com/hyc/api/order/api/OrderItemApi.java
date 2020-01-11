package com.hyc.api.order.api;

import com.hyc.api.order.fallback.OrderItemFallBack;
import com.order.model.entity.OrderItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hhh-provider-order" ,fallback = OrderItemFallBack.class)
public interface OrderItemApi {

    @GetMapping(value = "/orderItem/test")
    ResponseEntity<OrderItem> test(@RequestParam String id);

    @GetMapping(value = "/orderItem/findById")
    OrderItem findById(@RequestParam String id);

    @PostMapping(value = "/orderItem/defaultSaveOrUpdate")
    OrderItem defaultSaveOrUpdate(@RequestBody OrderItem entity);


    @PostMapping(value = "/orderItem/save")
    Boolean save(@RequestBody OrderItem entity);


    @PostMapping(value = "/orderItem/deleteById")
    Boolean deleteById(@RequestParam String id);


    @GetMapping(value = "/orderItem/findHasFinishOrderItem")
    OrderItem findHasFinishOrderItem(@RequestParam String id,@RequestParam String memberId);

}
