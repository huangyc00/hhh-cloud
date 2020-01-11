package com.hyc.order.service.impl;

import com.hyc.common.bean.BaseServiceImpl;

import com.hyc.order.service.OrderRefundDeliveryService;
import com.order.model.entity.OrderRefundDelivery;
import com.order.model.mapper.OrderRefundDeliveryMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderRefundDeliveryServiceImpl extends BaseServiceImpl<OrderRefundDeliveryMapper, OrderRefundDelivery> implements OrderRefundDeliveryService {


    @Override
    public OrderRefundDelivery findByRefundApplyIdAndMemberId(String refundApplyId, String memberId) {
        return null;
    }

    @Override
    public OrderRefundDelivery findByIdAndMemberId(String id, String memberId) {
        return null;
    }

    @Override
    public OrderRefundDelivery submitRefundDelivery(OrderRefundDelivery recObj) {
        return null;
    }
}
