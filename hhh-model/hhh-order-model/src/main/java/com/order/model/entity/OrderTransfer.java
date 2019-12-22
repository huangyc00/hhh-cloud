package com.order.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单转账单，订单完成交易后（过了售后期生成,并且没有退款成功）生成该记录,可以进行后续认为或者调用第三方的api进行转账操作
 */
@Data
@TableName(value = "order_order_transfer")
public class OrderTransfer extends BaseEntity {

    private String orderId;

    //收款的商户,实质也为订单的商户
    private String tenantId;

    //应该转账的金额
    private BigDecimal transferAmount;

    //最新的转账的状态,0待转账，1 转账成功，2转账失败
    private Integer status;

    //转账成功的时间
    private Date successTime;
}
