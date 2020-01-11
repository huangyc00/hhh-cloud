package com.hyc.order.service.impl;

import com.hyc.common.bean.BaseServiceImpl;
import com.hyc.order.service.OrderRefundLogService;
import com.order.model.entity.OrderRefundLog;
import com.order.model.mapper.OrderRefundLogMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderRefundLogServiceImpl extends BaseServiceImpl<OrderRefundLogMapper, OrderRefundLog> implements OrderRefundLogService {

}
