package com.hyc.order.service.impl;

import com.hyc.common.bean.BaseServiceImpl;
import com.hyc.order.service.RefundStatusChangeLogService;
import com.order.model.entity.RefundStatusChangeLog;
import com.order.model.mapper.RefundStatusChangeLogMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
public class RefundStatusChangeLogServiceImpl extends BaseServiceImpl<RefundStatusChangeLogMapper, RefundStatusChangeLog> implements RefundStatusChangeLogService {


    @Override
    public void logByRefundApplyId(String refundApplyId, String operatorId, Integer operatorType, String remark, String reason, String proofPics) {

    }
}
