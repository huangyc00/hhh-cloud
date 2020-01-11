package com.hyc.order.dto;

import com.order.model.entity.Order;
import com.order.model.entity.OrderTransfer;
import com.order.model.entity.OrderTransferHandleLog;
import com.tenant.model.entity.TenantMaster;
import com.tenant.model.entity.TenantShop;
import lombok.Data;

import java.util.List;

@Data
public class OrderTransferDTO extends OrderTransfer {

    //关联的订单
    private Order order;

    //关联的店铺
    private TenantShop tenantShop;

    //店主
    private TenantMaster tenantMaster;


    private List<OrderTransferHandleLog> orderTransferHandleLogList;
}
