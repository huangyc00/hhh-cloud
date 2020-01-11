package com.hyc.order.dto;

import com.order.model.entity.MemberOrderPay;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class MemberOrderPayQueryDTO extends MemberOrderPay {

    private String memberNickname;

    private String orderSn;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date payTimeFrom;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date payTimeTo;

}
