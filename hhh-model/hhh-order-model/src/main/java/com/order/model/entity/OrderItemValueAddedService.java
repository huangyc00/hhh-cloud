package com.order.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author hyc
 * @description
 * @date 2019-05-24 17:55
 */
@Data
@TableName(value = "order_order_item_value_added_service")
public class OrderItemValueAddedService extends BaseEntity {

    private String orderItemId;

    //服务的id
    private String serviceId;

    //服务名称
    private String serviceName;

    //图标
    private String serviceImages;

    //服务类型,详见ValueAddedServiceType
    private Integer serviceType;

    //值
    private BigDecimal serviceValue;

}
