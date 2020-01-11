package com.hyc.order.service.impl;

import com.hyc.common.bean.BaseServiceImpl;
import com.hyc.order.service.OrderTransferService;
import com.order.model.entity.OrderTransfer;
import com.order.model.entity.OrderTransferHandleLog;
import com.order.model.mapper.OrderTransferMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class OrderTransferServiceImpl extends BaseServiceImpl<OrderTransferMapper, OrderTransfer> implements OrderTransferService {


    @Override
    public OrderTransfer manualTransfer(OrderTransferHandleLog recObj) {
        return null;
    }
}
