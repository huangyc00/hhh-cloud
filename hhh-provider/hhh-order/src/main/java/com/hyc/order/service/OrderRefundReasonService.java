package com.hyc.order.service;

import com.hyc.common.bean.BaseService;
import com.order.model.entity.OrderRefundReason;
import com.order.model.mapper.OrderRefundReasonMapper;

import java.util.List;

public interface OrderRefundReasonService extends BaseService<OrderRefundReasonMapper, OrderRefundReason> {

    Boolean mergeList(List<OrderRefundReason> orderRefundReasonList);

    List<OrderRefundReason>  findListOrderByOrderNo();

    Boolean deleteListNotIn(List<String> ids);

    Boolean saveList(List<OrderRefundReason> orderRefundReasonList);

    Boolean updateList(List<OrderRefundReason> orderRefundReasonList);
}
