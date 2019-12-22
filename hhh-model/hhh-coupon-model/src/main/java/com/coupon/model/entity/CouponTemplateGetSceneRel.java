package com.coupon.model.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * 优惠券获取场景
 */
@Data
@TableName(value = "coupon_coupon_template_get_scene_rel")
public class CouponTemplateGetSceneRel extends BaseEntity {

    private String couponTemplateId;

    private String couponGetSceneId;

}
