package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * 购买方案
 */
@Data
@TableName(value = "pro_purchase_plan")
public class PurchasePlan extends BaseEntity{

    //方案名称
    private String name;

    //方案描述
    private String description;

    //启用状态，0不启用，1启用
    private Integer status;

    //方案展示名称
    private String showPic;

}
