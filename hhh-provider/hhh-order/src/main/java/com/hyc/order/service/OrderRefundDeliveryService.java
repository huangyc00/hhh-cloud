package com.hyc.order.service;

import com.hyc.common.bean.BaseService;
import com.order.model.entity.OrderRefundDelivery;
import com.order.model.mapper.OrderRefundDeliveryMapper;

public interface OrderRefundDeliveryService extends BaseService<OrderRefundDeliveryMapper, OrderRefundDelivery> {

    OrderRefundDelivery findByRefundApplyIdAndMemberId(String refundApplyId, String memberId);

    OrderRefundDelivery findByIdAndMemberId(String id, String memberId);

    OrderRefundDelivery submitRefundDelivery(OrderRefundDelivery recObj);
}
