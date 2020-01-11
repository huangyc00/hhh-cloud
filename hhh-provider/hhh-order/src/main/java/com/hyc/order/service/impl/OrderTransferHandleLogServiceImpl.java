package com.hyc.order.service.impl;

import com.hyc.common.bean.BaseServiceImpl;
import com.hyc.order.service.OrderTransferHandleLogService;
import com.order.model.entity.OrderTransferHandleLog;
import com.order.model.mapper.OrderTransferHandleLogMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderTransferHandleLogServiceImpl extends BaseServiceImpl<OrderTransferHandleLogMapper, OrderTransferHandleLog> implements OrderTransferHandleLogService {

}
