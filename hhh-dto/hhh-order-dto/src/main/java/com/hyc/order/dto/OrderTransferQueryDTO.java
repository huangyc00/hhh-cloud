package com.hyc.order.dto;

import com.order.model.entity.OrderTransfer;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class OrderTransferQueryDTO extends OrderTransfer {

    private String orderSn;

    private String tenantShopName;

    private String tenantMasterMobile;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDateFrom;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDateTo;
}
