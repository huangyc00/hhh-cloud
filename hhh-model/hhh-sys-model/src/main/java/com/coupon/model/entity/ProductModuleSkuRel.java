package com.coupon.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * 商品模块
 */
@Data
@TableName(value = "sys_product_module_sku_rel")
public class ProductModuleSkuRel extends BaseEntity {

    private String productModuleId;

    private String skuId;

    private Integer orderNo;
}
