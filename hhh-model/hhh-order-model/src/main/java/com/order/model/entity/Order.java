package com.order.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author hyc
 * @description
 * @date 2019-05-24 17:54
 */
@Data
@TableName(value = "order_order")
public class Order extends BaseEntity {

    public interface CreateOrderList {
    }
    //    -------------------------订单（商户订单）相关信息----------------------

    //订单号
    private String orderSn;

    //订单总金额（不包括运费）,计算方式为订单项总额的累加，订单项单项总额为单价 * 数量
    private BigDecimal totalAmount;

    //应付金额（实际支付金额（包括运费的）,计算方式为订单的总金额 + 运费 - 各项的优惠价格
    private BigDecimal payAmount;

    //运费金额
    private BigDecimal freightAmount;

    //折扣扣掉的总金额金额，普通情况下是单项的折扣金额的相加,暂时不用
    private BigDecimal discountAmount;

    //优惠券优惠的价格
    private BigDecimal couponDiscountAmount;

    //支付方式：0-> 微信 1->支付宝；
    private Integer payType;

    //订单状态,详见OrderStatus
    private Integer status;

    //"支付时间")
    private Date payTime;

    //备注（买家留言）
    private String remark;

    //待支付情况下的订单过期时间
    private Date expireTime;

    //回调回来绑定的订单支付id(自己系统的，实体为MemberOrderPay)
    private String orderPayId;

    //回调回来绑定的订单支付号(自己系统的，实体为MemberOrderPay)
    private String orderPaySn;

    //是否需要物流,0否，1是，如果不需要，则洗面的寄货的物流信息的字段则不需要填写
    private Integer hasDelivery;

    //会员确定收货时间
    private Date getGoodsTime;

    //商家发货时间
    private Date sendGoodsTime;

    //订单完成时间，当订单的状态变为500时，更新此时间
    private Date finishTime;

    //订单关闭原因
    private String closeReason;

    //对接第三方系统返回的支付单号（第三方的支付单号）
    private String transactionId;

    //   ---------------------寄货的物流信息 ----------------------------------
    //配送单号
    private String deliveryNo;

    //配送公司
    private String deliveryCompany;

    //对应alicloud物流的type
    private String deliveryCompanyType;

    //配送方式，0快递
    private Integer deliveryWay;

    //国标收货地址第一级地址
    private String senderProvince;

    //国标收货地址第二级地址
    private String senderCity;

    //国标收货地址第三级地址
    private String senderCounty;

    private String senderAddressDetail;

    //联系人名字
    private String senderName;

    //联系手机号码
    private String senderMobile;

    //邮编
    private String senderPostal;

//    -------------------------会员相关信息----------------------

    private String memberId;

    // 会员的名字
    private String memberName;

    // 会员的昵称
    private String memberNickname;

    //会员的手机
    private String memberMobile;

    //会员是否删除，0否，1是，如果已经进行删除，则会员端就能不能看到此订单
    private Integer memHasDelete;

    //    -------------------------------收货信息---------------------------------
    //收货人电话
    @NotNull(message = "收货人电话不能为空", groups = CreateOrderList.class)
    private String receiverPhone;

    //收货人姓名
    @NotNull(message = "收货人姓名不能为空", groups = CreateOrderList.class)
    private String receiverName;

    //收货人邮编
    private String postalCode;

    //国标收货地址第一级地址
    private String provinceName;

    //国标收货地址第二级地址
    private String cityName;

    //国标收货地址第三级地址
    private String countyName;

    //详细收货地址信息
    @NotNull(message = "详细收货地址不能为空", groups = CreateOrderList.class)
    private String detailInfo;


    //------------------- 商家信息 ------------------
    //关联商户(店铺)
    @NotNull(message = "商户不能为空")
    private String tenantId;

    //店铺名称
    private String tenantShopName;

    //店铺logo
    private String tenantShopLogo;

    //买家留言
    private String tenantRemark;

    public BigDecimal getProductPayAmount(){
        if(null == this.freightAmount){
            return this.payAmount;
        }
        return this.payAmount.subtract(this.freightAmount);
    }
}
