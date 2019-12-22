package com.coupon.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 优惠券模板
 */
@Data
@TableName(value = "coupon_coupon_template")
public class CouponTemplate extends BaseEntity{

    public interface CreateCouponTemplate{};
    public interface UpdateCouponTemplate{}

    @Override
    @NotNull(message = "id不能为空",groups = UpdateCouponTemplate.class)
    public String getId(){
        return super.getId();
    }

    //优惠券类型，0店铺优惠券，作用于店铺内的所有商品 1商品优惠券，作用于关联的商品
    @NotNull(message = "优惠券类型不能为空",groups = {CreateCouponTemplate.class,UpdateCouponTemplate.class})
    private Integer couponType;

    //优惠券名字
    @NotNull(message = "优惠券名字不能为空",groups = {CreateCouponTemplate.class,UpdateCouponTemplate.class})
    private String name;

    //使用时间的类型,0为固定有效期,1为可变有效期
    @NotNull(message = "使用时间的类型不能为空",groups = {CreateCouponTemplate.class,UpdateCouponTemplate.class})
    private Integer useTimeType;

    //起始时间,固定有限期类型的时候起作用
    private Date startTime;

    //结束时间,固定有限期类型的时候起作用
    private Date endTime;

    //有效的天数，使用的时间类型为可变有限期时起作用
    private Integer validDays;

    //打折类型，0代表满减,1为打折类型
    private Integer discountType;

    //减免的金额，满减类型使用,面额
    private BigDecimal discountAmount;

    //使用的门槛，满减类型使用
    private BigDecimal discountThreshold;

    //折扣比例,当打折类型为比例类型时才使用
    private BigDecimal discountRatio;

    //最大的发行量
    @NotNull(message = "发行量不能为空",groups = {CreateCouponTemplate.class,UpdateCouponTemplate.class})
    private Integer maxDistribution;

    //每人限领的数量
    @NotNull(message = "每人限领的数量不能为空",groups = {CreateCouponTemplate.class,UpdateCouponTemplate.class})
    private Integer limitGetNum;

    //状态，0开始，1结束
    private Integer status;

    private String tenantId;
}