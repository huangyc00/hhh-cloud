package com.hyc.order.dto;

import com.order.model.entity.Order;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class OrderQueryDTO extends Order {

    //商品名称
    private String productName;

    //商品编号
    private String productSn;

    //搜索的下单时间的开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDateFrom;

    //搜索的下单时间的结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDateTo;

}
