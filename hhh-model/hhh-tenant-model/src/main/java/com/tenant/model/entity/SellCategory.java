package com.tenant.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * 经营类目
 */
@Data
@TableName(value = "tenant_sell_category")
public class SellCategory extends BaseEntity {

    private String name;

    private String content;

}
