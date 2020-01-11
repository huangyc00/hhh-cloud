package com.hyc.order.dto;

import com.order.model.entity.OrderRefundApply;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 商品退货信息dto
 */
@Data
public class OrderRefundApplyQueryDTO extends OrderRefundApply {

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDateFrom;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtDateTo;

    private String refundMemberName;

}