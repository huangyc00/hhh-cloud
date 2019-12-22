package com.order.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 退货物流单物流
 */
@Data
@TableName(value = "order_order_refund_delivery")
public class OrderRefundDelivery extends BaseEntity {

    public interface SendRefundAddress{}
    public interface SubmitRefundDelivery{}


    @NotNull(message = "退货物流单的id不能为空",groups = SubmitRefundDelivery.class)
    @Override
    public String getId(){
        return super.getId();
    }

    //关联的退款申请单的id
    @NotNull(message = "关联的退款申请单不能为空",groups = SendRefundAddress.class)
    private String refundApplyId;

    //收货人姓名
    @NotNull(message = "收货人姓名不能为空",groups = SendRefundAddress.class)
    private String receiverName;

    //收货人电话
    @NotNull(message = "收货人电话不能为空",groups = SendRefundAddress.class)
    private String receiverPhone;

    //省/直辖市
    @NotNull(message = "国标一级收货地址不能为空",groups = SendRefundAddress.class)
    private String province;

    //市
    @NotNull(message = "国标二级收货地址不能为空",groups = SendRefundAddress.class)
    private String city;

    //区
    @NotNull(message = "国标三级收货地址不能为空",groups = SendRefundAddress.class)
    private String region;

    //详细地址
    @NotNull(message = "详细地址不能为空",groups = SendRefundAddress.class)
    private String detailAddress;

    //收货的商家
    private String tenantId;

    //卖家留言
    private String tenantPs;

    //创建人的店主的id
    private String createMasterId;

    //关联的会员
    private String memberId;



    //--------------- 退货人填的退货信息 ----------------

    //配送单号
    @NotNull(message = "物流单号不能为空",groups = SubmitRefundDelivery.class)
    private String deliveryNo;

    //配送公司
    private  String deliveryCompany;

    //对应alicloud物流的type
    private String deliveryCompanyType;

    //物流凭证，分号(;)隔开
    private String deliveryProofPics;

    //退货信息的联系电话
    @NotNull(message = "联系电话不能为空",groups = SubmitRefundDelivery.class)
    private String deliveryContactMobile;

    //退货说明
    private String returnPolicy;

    //退货过时时间点
    private Date deliveryExpireTime;
}

