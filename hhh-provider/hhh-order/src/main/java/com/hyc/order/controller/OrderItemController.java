package com.hyc.order.controller;

import com.hyc.common.exception.BaseException;
import com.hyc.api.order.api.OrderItemApi;
import com.hyc.order.service.OrderItemService;
import com.order.model.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderItemController implements OrderItemApi{

    @Autowired
    OrderItemService orderItemService;

    @Override
    public ResponseEntity<OrderItem> test(String id) {
        if(id.equals("aaa")){
            throw new BaseException("出现故障了");
        }
        return ResponseEntity.ok()
                .header("aaa", "sssss")
                .body(orderItemService.getById(id));
    }

    @Override
    public OrderItem findById(@RequestParam String id) {
        if(null == id){
            throw new BaseException("id不能为空");
        }
        return orderItemService.getById(id);
    }

    @Override
    public OrderItem defaultSaveOrUpdate(OrderItem orderItem) {
        return null;
    }

    @Override
    public Boolean save(OrderItem entity) {
        return false;
    }

    @Override
    public Boolean deleteById(String id) {
        return null;
    }


    @Override
    public OrderItem findHasFinishOrderItem(String id, String memberId) {
        return null;
    }
}
