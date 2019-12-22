package com.order.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author hyc
 * @description 转账表
 * @date 2019-06-03 18:08
 */
@Data
@TableName(value = "order_transfer_account")
public class TransferAccount extends BaseEntity {

    //返现总金额
    private BigDecimal amount;

    //返现的方式,0为人工返现，1为微信 5为支付宝
    private Integer type;

    //返现金额的操作人
    private String operator;

    //返现的收款人id
    private String receiverId;

    //关联的行为类型,可以理解为为何转账,0为针对分享而进行转账
    private Integer behaviorType;

    //关联的行为id
    private String behaviorId;

    //备注
    private String remark;


}
