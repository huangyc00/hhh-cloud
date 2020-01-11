package com.hyc.order.service;

import com.hyc.common.bean.BaseService;
import com.order.model.entity.RefundStatusChangeLog;
import com.order.model.mapper.RefundStatusChangeLogMapper;

public interface RefundStatusChangeLogService extends BaseService<RefundStatusChangeLogMapper, RefundStatusChangeLog> {

    void logByRefundApplyId(String refundApplyId, String operatorId, Integer operatorType, String remark, String reason, String proofPics);

}
