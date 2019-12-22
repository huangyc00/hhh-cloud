package com.coupon.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 优惠券码
 */
@Data
@TableName(value = "coupon_coupon_code")
public class CouponCode extends BaseEntity {

    public static Integer USE_STATUS_UNUSE = 0;
    public static Integer USE_STATUS_USEING = 1;
    public static Integer USE_STATUS_FINISH = 2;
    public static Integer USE_STATUS_EXPIRE = 99;

    //优惠码
    private String code;

    //领取的会员
    private String memberId;

    //发行的租户
    private String tenantId;

    //关联的优惠券的模板
    private String templateId;

    //优惠券类型，0店铺优惠券，作用于店铺内的所有商品 1商品优惠券，作用于关联的商品
    private Integer couponType;

    //过期时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date expireTime;

    //使用时间的类型,0为固定有效期,1为可变有效期
    private Integer useTimeType;

    //减免的金额，满减类型使用,面额
    private BigDecimal discountAmount;

    //使用的门槛，满减类型使用
    private BigDecimal discountThreshold;

    //使用状态,0未使用(未使用并且在过期之前)，1使用中（订单支付过程），2.已使用（使用完成） 99，已过期（未使用并且已经过了过期时间）
    private Integer useStatus;

    //会员删除标识，0没删除，1删除
    private Integer memberDeleteFlag;

    //作用的订单
    private String orderId;

    //领取的场景的id
    private String getSceneId;

    //使用时间,订单付款时间
    private Date useTime;

    //作用的订单项，商品优惠券会有该值
    private String orderItemId;

    //作用的商品id，商品优惠券会有该值
    private String productId;

    //作用的skuId，商品优惠券会有该值
    private String skuId;
}
