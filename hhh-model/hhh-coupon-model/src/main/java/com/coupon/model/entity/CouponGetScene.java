package com.coupon.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;


/**
 * 优惠券获取场景
 */
@Data
@TableName(value = "coupon_coupon_get_scene")
public class CouponGetScene extends BaseEntity {

    private String name;

    //领取场景类型,0店铺商品详情展示领取，1注册新用户领取，2分享领取
    private Integer type;

    //商户使用类型,0只适用官方，1只适用非官方，2全都可以用
    private Integer tenantSuitType;

}
