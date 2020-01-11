package com.hyc.api.member.dto;

import com.member.model.entity.MemberProductShare;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class MemberProductShareQueryDTO extends MemberProductShare {

    private String memberNickname;

    private String memberMobile;

    private String tenantShopName;

    private String productName;

    //搜索创建时间的开始日期
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDateFrom;

    //搜索创建时间的结束日期
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDateTo;


}
