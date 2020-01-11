package com.hyc.order.service;


import com.hyc.common.bean.BaseService;
import com.order.model.entity.OrderItemValueAddedService;
import com.order.model.mapper.OrderItemValueAddedServiceMapper;

import java.util.List;

public interface OrderItemValueAddedServiceService extends BaseService<OrderItemValueAddedServiceMapper, OrderItemValueAddedService> {

    List<OrderItemValueAddedService> findListByOrderItemId(String orderItemId);

    List<OrderItemValueAddedService> findListByOrderItemIdAndServiceType(String orderItemId, Integer serviceType);
}
