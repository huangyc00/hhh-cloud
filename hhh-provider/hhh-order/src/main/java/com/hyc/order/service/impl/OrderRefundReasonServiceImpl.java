package com.hyc.order.service.impl;

import com.hyc.common.bean.BaseServiceImpl;
import com.hyc.order.service.OrderRefundReasonService;
import com.order.model.entity.OrderRefundReason;
import com.order.model.mapper.OrderRefundReasonMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class OrderRefundReasonServiceImpl extends BaseServiceImpl<OrderRefundReasonMapper, OrderRefundReason> implements OrderRefundReasonService {


    @Override
    public Boolean mergeList(List<OrderRefundReason> orderRefundReasonList) {
        return null;
    }

    @Override
    public List<OrderRefundReason> findListOrderByOrderNo() {
        return null;
    }

    @Override
    public Boolean deleteListNotIn(List<String> ids) {
        return null;
    }

    @Override
    public Boolean saveList(List<OrderRefundReason> orderRefundReasonList) {
        return null;
    }

    @Override
    public Boolean updateList(List<OrderRefundReason> orderRefundReasonList) {
        return null;
    }
}
