package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * @author hyc
 * @description sku属性值关联表
 * @date 2019-05-18 12:10
 */
@Data
@TableName(value = "pro_sku_attribute_value_rel")
public class SkuAttributeValueRel extends BaseEntity{

    private String skuId;

    private String attributeId;

    private String attributeValueId;

    private Integer orderNo;

    private String tenantId;
}
