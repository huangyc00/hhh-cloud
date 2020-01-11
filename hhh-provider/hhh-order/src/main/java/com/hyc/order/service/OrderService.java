package com.hyc.order.service;

import com.hyc.common.bean.BaseService;
import com.order.model.entity.Order;
import com.order.model.mapper.OrderMapper;

import java.util.List;

public interface OrderService extends BaseService<OrderMapper, Order> {

    Order findByIdAndMemberId(String id, String memberId);

    List<Order> findByIds(List<String> ids);

    Integer updateStatus(String orderId, String memberId, Integer status);

    Boolean cancleOrder(String orderId);

    Integer updateFromWaitComment(String orderId, String memberId);

    /**
     * 更新订单的orderPayId
     *
     * @param orderPayId
     * @param ids
     * @return
     */
    Integer updateOrderPayById(String orderPayId, List<String> ids);


    Order findByIdAndTenantId(String id, String tenantId);


    /**
     * 会员确定收货
     *
     * @param orderId  关联的订单id
     * @param memberId 会员的id
     * @return
     */
    Boolean confirmGetGoods(String orderId, String memberId);

    /**
     * 商家关闭订单
     *
     * @param orderId     订单的id
     * @param orderId     关联的商户的id
     * @param closeReason 订单关闭原因
     * @return
     */
    Order tenantCloseOrder(String orderId, String tenantId, String closeReason);

    /**
     * 查询系统内可以自动取消的订单
     *
     * @return
     */
    List<Order> findCanclableOrderList();

    /**
     * 查询可以自动变成下一个状态的未收货的订单
     *
     * @return
     */
    List<Order> findCanChangeWaitRecOrderList();

    Order findByOrderItemId(String orderItemId);

    Boolean refundToBeClose(String orderId);

    Boolean closeRefundOrder(String orderId);
}
