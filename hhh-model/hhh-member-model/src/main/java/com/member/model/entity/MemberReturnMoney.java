package com.member.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 会员返现表
 */
@Data
@TableName(value = "mem_member_return_money")
public class MemberReturnMoney extends BaseEntity {

    //关联的订单
    private String orderId;

    //关联的订单号
    private String orderSn;

    //关联的订单项的id
    private String orderItemId;

    //关联的订单项号
    private String orderItemSn;

    //关联的会员
    private String memberId;

    //应该转账的金额
    private BigDecimal returnMoneyAmount;

    //最新的转账的状态,0待返现，1 返现成功，2返现失败
    private Integer status;

    private Date successTime;
}
