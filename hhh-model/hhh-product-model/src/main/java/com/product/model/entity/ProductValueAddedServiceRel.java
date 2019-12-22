package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;


/**
 * 商品增值服务关联表
 */
@Data
@TableName(value = "pro_product_value_added_service_rel")
public class ProductValueAddedServiceRel extends BaseEntity {

    //商品的id
    private String productId;

    //增值服务
    private String valueAddedServiceId;


}