package com.hyc.order.service.impl;

import com.hyc.common.bean.BaseServiceImpl;
import com.hyc.order.service.OrderItemService;
import com.order.model.entity.OrderItem;
import com.order.model.mapper.OrderItemMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@Service
@ResponseBody
public class OrderItemServiceImpl extends BaseServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {


    @Override
    public List<OrderItem> findListByOrderId(String orderId) {
        return null;
    }

    @Override
    public Integer reduceSkuStockList(List<OrderItem> saveList) {
        return null;
    }

    @Override
    public List<OrderItem> findListByIdsAndOrderId(List<String> ids, String orderId) {
        return null;
    }

    @Override
    public BigDecimal sumOrderDiscountAmount(String orderId) {
        return null;
    }

    @Override
    public Integer findNotFinishCommentNum(String orderId, String memberId) {
        return null;
    }

    @Override
    public OrderItem findByIdAndMemberId(String id, String memberId) {
        return null;
    }

    @Override
    public List<OrderItem> findCanCommentList() {
        return null;
    }
}
