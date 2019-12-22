package com.coupon.model.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * 优惠券商品关系表
 */
@Data
@TableName(value = "coupon_coupon_template_product_rel")
public class CouponTemplateProductRel extends BaseEntity {

    private String couponTemplateId;

    private String productId;

}
