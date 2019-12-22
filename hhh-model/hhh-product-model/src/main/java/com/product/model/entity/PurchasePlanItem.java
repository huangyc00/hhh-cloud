package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * 购买方案详细项
 */
@Data
@TableName(value = "pro_purchase_plan_item")
public class PurchasePlanItem extends BaseEntity{

    //关联的购买方案
    private String purchasePlanId;

    //场景
    private String liveSceneId;

    //在整个方案中的序号
    private Integer orderNo;

}
