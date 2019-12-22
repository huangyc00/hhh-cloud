package com.order.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * 用户订单
 */
@Data
@TableName(value = "order_member_order_pay")
public class MemberOrderPay extends BaseEntity {

    public interface CreateMemberOrder{}

    //    -------------------------会员订单相关信息----------------------

    //订单支付单号
    private String orderPaySn;

    //支付方式：0-> 微信 1->支付宝；
    private Integer payType;

    //支付状态,0支付取消，1支付成功
    private Integer payStatus;

    //"支付时间")
    private Date payTime;


//    -------------------------会员相关信息----------------------

    private String memberId;

    // 会员的名字
    private String memberName;

    //关联订单的id的集合，中间以;给开
    private String orderIdList;

}
