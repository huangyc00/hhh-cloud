package com.hyc.order.service;


import com.hyc.common.bean.BaseService;
import com.order.model.entity.OrderItem;
import com.order.model.mapper.OrderItemMapper;

import java.math.BigDecimal;
import java.util.List;

public interface OrderItemService extends BaseService<OrderItemMapper, OrderItem> {


    List<OrderItem> findListByOrderId(String orderId);

    Integer reduceSkuStockList(List<OrderItem> saveList);

    List<OrderItem> findListByIdsAndOrderId(List<String> ids, String orderId);

    BigDecimal sumOrderDiscountAmount(String orderId);

    Integer findNotFinishCommentNum(String orderId, String memberId);

    OrderItem findByIdAndMemberId(String id, String memberId);

    List<OrderItem> findCanCommentList();
}
