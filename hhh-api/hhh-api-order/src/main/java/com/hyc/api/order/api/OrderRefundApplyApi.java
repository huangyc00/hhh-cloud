package com.hyc.api.order.api;

import com.order.model.entity.OrderRefundApply;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hhh-provider-order")
public interface OrderRefundApplyApi {


    @GetMapping(value = "/orderRefundApply/findById")
    OrderRefundApply findById(@RequestParam String id);

    @PostMapping(value = "/orderRefundApply/defaultSaveOrUpdate")
    OrderRefundApply defaultSaveOrUpdate(@RequestBody OrderRefundApply entity);


    @PostMapping(value = "/orderRefundApply/save")
    Boolean save(@RequestBody OrderRefundApply entity);


    @PostMapping(value = "/orderRefundApply/deleteById")
    Boolean deleteById(@RequestParam String id);

    @GetMapping(value = "/orderRefundApply/findByOrderItemId")
    OrderRefundApply findByOrderItemId(@RequestParam String orderItemId);
}
