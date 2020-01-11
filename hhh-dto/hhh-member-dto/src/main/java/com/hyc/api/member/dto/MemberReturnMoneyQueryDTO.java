package com.hyc.api.member.dto;

import com.member.model.entity.MemberReturnMoney;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class MemberReturnMoneyQueryDTO extends MemberReturnMoney {

    private String orderSn;

    private String memberNickname;

    private String memberMobile;

    private String productName;

    private Integer status;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDateFrom;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDateTo;

}
