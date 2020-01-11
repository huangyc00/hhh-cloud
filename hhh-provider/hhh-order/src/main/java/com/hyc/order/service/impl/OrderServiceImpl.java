package com.hyc.order.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hyc.common.bean.BaseServiceImpl;
import com.hyc.order.service.OrderService;
import com.order.model.entity.Order;
import com.order.model.mapper.OrderMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class OrderServiceImpl extends BaseServiceImpl<OrderMapper, Order> implements OrderService {

    @Override
    public Order findByIdAndMemberId(String id, String memberId) {
        return null;
    }

    @Override
    public List<Order> findByIds(List<String> ids) {
        return null;
    }

    @Override
    public Integer updateStatus(String orderId, String memberId, Integer status) {
        return null;
    }

    @Override
    public Boolean cancleOrder(String orderId) {
        return null;
    }

    @Override
    public Integer updateFromWaitComment(String orderId, String memberId) {
        return null;
    }

    @Override
    public Integer updateOrderPayById(String orderPayId, List<String> ids) {
        return null;
    }

    @Override
    public Order findByIdAndTenantId(String id, String tenantId) {
        return null;
    }

    @Override
    public Boolean confirmGetGoods(String orderId, String memberId) {
        return null;
    }

    @Override
    public Order tenantCloseOrder(String orderId, String tenantId, String closeReason) {
        return null;
    }

    @Override
    public List<Order> findCanclableOrderList() {
        return null;
    }

    @Override
    public List<Order> findCanChangeWaitRecOrderList() {
        return null;
    }

    @Override
    public Order findByOrderItemId(String orderItemId) {
        return null;
    }

    @Override
    public Boolean refundToBeClose(String orderId) {
        return null;
    }

    @Override
    public Boolean closeRefundOrder(String orderId) {
        return null;
    }
}


