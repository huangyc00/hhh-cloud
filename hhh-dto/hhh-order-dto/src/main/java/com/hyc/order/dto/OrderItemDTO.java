package com.hyc.order.dto;


import com.order.model.entity.OrderItem;
import com.order.model.entity.OrderItemValueAddedService;
import com.order.model.entity.OrderRefundApply;
import com.product.model.entity.Sku;
import lombok.Data;

import java.util.List;

@Data
public class OrderItemDTO extends OrderItem {

    //关联的sku
    private Sku sku;

    private List<OrderItemValueAddedService> orderItemValueAddedServiceList;

    //关联的最新的
    private OrderRefundApply newestOrderRefundApply;

    //使用的优惠码的id
    private String couponCodeId;
}
