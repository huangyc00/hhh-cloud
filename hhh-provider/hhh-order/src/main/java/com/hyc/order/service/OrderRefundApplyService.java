package com.hyc.order.service;


import com.hyc.common.bean.BaseService;
import com.order.model.entity.OrderRefundApply;
import com.order.model.entity.OrderRefundDelivery;
import com.order.model.mapper.OrderRefundApplyMapper;

import java.math.BigDecimal;
import java.util.List;

public interface OrderRefundApplyService extends BaseService<OrderRefundApplyMapper, OrderRefundApply> {
    /**
     * 会员提交退款申请
     *
     * @param receiverObj
     * @return
     */
    OrderRefundApply submitRefundMoney(OrderRefundApply receiverObj);

    OrderRefundApply sendRefundAddress(OrderRefundDelivery orderRefundDelivery);

    OrderRefundApply tenantAgreeRefund(String refundApplyId, String tenantMasterId, String tenantMasterName);

    List<OrderRefundApply> findTenantCheckExpireList();

    List<OrderRefundApply> findMemSendGoodsExpireList();

    List<OrderRefundApply> findTenantWaittingGetExpireList();

    List<OrderRefundApply> findRefuseRefundExpireList();

    BigDecimal findMaxRefundMoney(String orderItemId);

    BigDecimal findHasRefundAmountByOrderId(String orderId);

    BigDecimal findOverRefundAmount(String orderId);

    OrderRefundApply memCancleRefund(String id, String memberId);

    OrderRefundApply confirmGetGoods(String id, String tenantMasterId);

    OrderRefundApply findPaySuccessByOrderItemId(String orderItemId);

    /**
     * 查询退款中的退款单
     *
     * @param orderId
     * @return
     */
    List<OrderRefundApply> findRefundingListByOrderId(String orderId);

    OrderRefundApply findByOrderItemIdAndStatus(String orderItemId, Integer status);
}
