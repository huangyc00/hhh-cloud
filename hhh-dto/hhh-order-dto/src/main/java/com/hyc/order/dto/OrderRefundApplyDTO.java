package com.hyc.order.dto;

import com.member.model.entity.Member;
import com.order.model.entity.OrderRefundApply;
import com.order.model.entity.OrderRefundLog;
import com.order.model.entity.RefundStatusChangeLog;
import com.tenant.model.entity.TenantMaster;
import com.tenant.model.entity.TenantShop;
import lombok.Data;

import java.util.List;

/**
 * 商品退货信息dto
 */
@Data
public class OrderRefundApplyDTO extends OrderRefundApply {

    private Member refundMember;

    private TenantShop tenantShop;

    //关联的商家的联系人
    private TenantMaster tenantMaster;

    List<RefundStatusChangeLog> refundStatusChangeLogList;

    private List<OrderRefundLog> orderRefundLogList;
}