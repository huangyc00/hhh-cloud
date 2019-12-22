package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * @author hyc
 * @description 商品属性关联表
 * @date 2019-05-18 12:09
 */
@Data
@TableName(value = "pro_product_attribute_rel")
public class ProductAttributeRel extends BaseEntity {

    private String productId;

    private String attributeId;

    private Integer orderNo;

    //属性的类型；0->规格；1->参数
    private Integer type;
}
