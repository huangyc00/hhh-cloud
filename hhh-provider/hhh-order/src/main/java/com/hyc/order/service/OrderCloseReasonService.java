package com.hyc.order.service;

import com.hyc.common.bean.BaseService;
import com.order.model.entity.OrderCloseReason;
import com.order.model.mapper.OrderCloseReasonMapper;

import java.util.List;

public interface OrderCloseReasonService extends BaseService<OrderCloseReasonMapper, OrderCloseReason> {

    Boolean mergeList(List<OrderCloseReason> orderCloseReasonList);

    List<OrderCloseReason> findListOrderByOrderNo();

    Boolean deleteListNotIn(List<String> ids);

    Boolean saveList(List<OrderCloseReason> orderCloseReasonList);

    Boolean updateList(List<OrderCloseReason> orderCloseReasonList);

}
