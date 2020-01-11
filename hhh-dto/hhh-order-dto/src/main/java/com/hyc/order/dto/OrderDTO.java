package com.hyc.order.dto;

import com.coupon.model.entity.CouponCode;
import com.member.model.entity.Member;
import com.order.model.entity.Order;
import com.order.model.entity.OrderRefundApply;
import com.tenant.model.entity.TenantMaster;
import com.tenant.model.entity.TenantShop;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class OrderDTO extends Order {


    @Valid
    @NotNull(message = "关联的订单项不能为空",groups = Order.CreateOrderList.class)
    private List<OrderItemDTO> orderItemList;

    private TenantShop tenantShop;

    //关联的商家店主的信息
    private TenantMaster tenantMaster;

    //关联的退款申请
    private List<? extends OrderRefundApply> orderRefundApplieList;

    private Member member;

    @Size(max = 1,message = "店铺优惠券的数量最大为1",groups = Order.CreateOrderList.class)
    private List<CouponCode> couponCodeList;

}
