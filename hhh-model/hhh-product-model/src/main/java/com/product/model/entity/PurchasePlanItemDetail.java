package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * 购买方案详细项
 */
@Data
@TableName(value = "pro_purchase_plan_item_detail")
public class PurchasePlanItemDetail extends BaseEntity{

    //关联的购买方案
    private String purchasePlanId;

    //关联的购买方案
    private String purchasePlanItemId;

    //关联的sku
    private String skuId;

    //数量
    private Integer quantity;

    //序号
    private Integer orderNo;
}
