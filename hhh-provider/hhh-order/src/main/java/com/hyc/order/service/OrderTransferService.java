package com.hyc.order.service;

import com.hyc.common.bean.BaseService;
import com.order.model.entity.OrderTransfer;
import com.order.model.entity.OrderTransferHandleLog;
import com.order.model.mapper.OrderTransferMapper;

public interface OrderTransferService extends BaseService<OrderTransferMapper, OrderTransfer> {


    OrderTransfer manualTransfer(OrderTransferHandleLog recObj);
}
