package com.hyc.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hyc.common.bean.BaseServiceImpl;
import com.hyc.order.service.OrderItemValueAddedServiceService;
import com.order.model.entity.OrderItemValueAddedService;
import com.order.model.mapper.OrderItemValueAddedServiceMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OrderItemValueAddedServiceServiceImpl extends BaseServiceImpl<OrderItemValueAddedServiceMapper, OrderItemValueAddedService> implements OrderItemValueAddedServiceService {

    @Override
    public List<OrderItemValueAddedService> findListByOrderItemId(String orderItemId) {
        QueryWrapper<OrderItemValueAddedService> queryWrapper = Wrappers.query();
        queryWrapper.eq(true,"order_item_id",orderItemId);
        return this.list(queryWrapper);
    }

    @Override
    public List<OrderItemValueAddedService> findListByOrderItemIdAndServiceType(String orderItemId, Integer serviceType) {
        QueryWrapper<OrderItemValueAddedService> queryWrapper = Wrappers.query();
        queryWrapper.eq(true,"order_item_id",orderItemId);
        queryWrapper.eq(true,"service_type",serviceType);
        return this.list(queryWrapper);
    }


}
