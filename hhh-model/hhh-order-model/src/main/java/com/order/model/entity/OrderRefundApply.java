package com.order.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品退货信息表
 */
@Data
@TableName(value = "order_order_refund_apply")
public class OrderRefundApply extends BaseEntity {

    public interface SubmitRefundMoney{}

    //退款单号
    private String refundNo;

    //关联的订单的id
    private String orderId;

    //订单编号
    private String orderSn;

    //子订单的id
    @NotNull(message = "订单项id不能为空",groups = {SubmitRefundMoney.class})
    private String orderItemId;

    //子订单编号
    private String orderItemSn;

    //退货商品id
    private String productId;

    //退款的商品名称
    private String productName;

    //退款商品展示的图片
    private String productShowPic;

    //"商品销售属性:[{'key':'颜色','value':'颜色'},{'key':'容量','value':'4G'}]")
    private String skuAttr;

    private String skuPic;

    private String refundMemberId;

    private String refundNickName;

    //退款单状态,详见RefundStatus这个类
    private Integer status;

    //是否收到货物，0否，1是
    @NotNull(message = "是否收到货物不能为空",groups = {SubmitRefundMoney.class})
    private Integer hasGetGoods;

    //退款申请类型，0仅退款，1退货退款
    @NotNull(message = "退款申请类型不能为空",groups = {SubmitRefundMoney.class})
    private Integer type;

    //退款原因
    @NotNull(message = "退款原因不能为空",groups = {SubmitRefundMoney.class})
    private String reason;

    //凭证图片，以分号隔开,会员提交的凭证，证明商品有问题
    private String proofPics;

    //退货说明
    private String remark;

    // 租户id
    private String tenantId;

    //订单项实际支付金额
    private BigDecimal payAmount;

    //退款金额
    @NotNull(message = "退款金额不能为空",groups = {SubmitRefundMoney.class})
    private BigDecimal returnAmount;

    //商家评审的超时时间
    private Date tenantCheckExpireTime;

    //拒绝退款状态的过期时间点，如果处于拒绝状态并且过了这个点，则自动转变为撤销状态
    private Date refuseRefundExpireTime;

    //会员发货的超时时间，如果当前的退款状态为会员待寄货，且超过此时间,则自动变为撤销状态
    private Date memSendExpireTime;

    //卖家等待收货的过期时间点,如果过了这个点就自动同意汇款,注:此属性切勿乱设置，一般比实际接收快递的最长时间长
    private Date tenantWaittingGetExpireTime;


}