package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 增值服务
 */
@Data
@TableName(value = "pro_value_added_service")
public class ValueAddedService extends BaseEntity {

    //服务名称
    private String name;

    //图标
    private String images;

    //服务类型,详见ValueAddedServiceType
    private Integer type;

    //值,用于增值
    private BigDecimal value;

    //启用状态，0不启用，1启用
    private Integer status;

    //序号
    private Integer orderNo;
}