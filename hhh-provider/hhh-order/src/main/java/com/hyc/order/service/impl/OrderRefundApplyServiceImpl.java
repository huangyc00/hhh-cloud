package com.hyc.order.service.impl;

import com.hyc.common.bean.BaseServiceImpl;
import com.hyc.order.service.OrderRefundApplyService;
import com.order.model.entity.OrderRefundApply;
import com.order.model.entity.OrderRefundDelivery;
import com.order.model.mapper.OrderRefundApplyMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class OrderRefundApplyServiceImpl extends BaseServiceImpl<OrderRefundApplyMapper, OrderRefundApply> implements OrderRefundApplyService {

    @Override
    public OrderRefundApply submitRefundMoney(OrderRefundApply receiverObj) {
        return null;
    }

    @Override
    public OrderRefundApply sendRefundAddress(OrderRefundDelivery orderRefundDelivery) {
        return null;
    }

    @Override
    public OrderRefundApply tenantAgreeRefund(String refundApplyId, String tenantMasterId, String tenantMasterName) {
        return null;
    }

    @Override
    public List<OrderRefundApply> findTenantCheckExpireList() {
        return null;
    }

    @Override
    public List<OrderRefundApply> findMemSendGoodsExpireList() {
        return null;
    }

    @Override
    public List<OrderRefundApply> findTenantWaittingGetExpireList() {
        return null;
    }

    @Override
    public List<OrderRefundApply> findRefuseRefundExpireList() {
        return null;
    }

    @Override
    public BigDecimal findMaxRefundMoney(String orderItemId) {
        return null;
    }

    @Override
    public BigDecimal findHasRefundAmountByOrderId(String orderId) {
        return null;
    }

    @Override
    public BigDecimal findOverRefundAmount(String orderId) {
        return null;
    }

    @Override
    public OrderRefundApply memCancleRefund(String id, String memberId) {
        return null;
    }

    @Override
    public OrderRefundApply confirmGetGoods(String id, String tenantMasterId) {
        return null;
    }

    @Override
    public OrderRefundApply findPaySuccessByOrderItemId(String orderItemId) {
        return null;
    }

    @Override
    public List<OrderRefundApply> findRefundingListByOrderId(String orderId) {
        return null;
    }

    @Override
    public OrderRefundApply findByOrderItemIdAndStatus(String orderItemId, Integer status) {
        return null;
    }
}
