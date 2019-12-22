package com.coupon.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author hyc
 * @description 系统参数
 * @date 2019-06-10 10:10
 */
@Data
@TableName(value = "sys_system_param")
public class SystemParam extends BaseEntity {

    //小程序滑动图片的数量
    private Integer miniSlidePicNum;

    //oss域名
    private String ossDomain;

    //售后，退货，商家处理的有效时间,单位分钟
    private Integer teRefundCheckingTime;

    //售后，会员售后，寄回货物的有效时间
    private Integer memRefundSendGoodsTime;

    //售后，商家接受货物的有效时间
    private Integer teRefundGetGoodsTime;

    //售后，商家接收获取的有效时间,单位分钟
    private Integer teWaittingGetTime;

    //售后，被商家拒绝的售后单的有效存在时间,单位：分钟，如果超过这个时间，自动变成关闭状态（会员撤销状态）
    private Integer refuseRefundValidTime;


    //订单,待支付的有效时间，单位:分钟，超过这个时间，订单自动变为关闭状态
    private Integer waitPayValidTime;

    //订单,待收货订单的有效时间，单位：分钟,超过这个时间且没有进行售后（不是撤销状态的都算）活动的订单且超过此限定时间会变成自动收货
    private Integer waitReceiveValidTime;

    //订单,订单自动评价时间，订单未评价状态持续的有效时间,过了这个时间就进行自动评价操作,单位：分钟
    private Integer waitCommentValidTime;

    //订单,订单自动评价内容
    private String orderAutoCommentContent;

    //最低的最低转账的金额，如果小于或者等于这个金额则自动转账
    private BigDecimal autoTransferAccountMoney;

    //新会员过期天数
    private Integer newMemberExpreDays;

}
