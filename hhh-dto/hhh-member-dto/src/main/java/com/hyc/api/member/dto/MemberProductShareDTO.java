package com.hyc.api.member.dto;

import com.member.model.entity.Member;
import com.member.model.entity.MemberProductShare;
import com.order.model.entity.OrderItem;
import lombok.Data;

@Data
public class MemberProductShareDTO extends MemberProductShare {

    //关联的订单项
    private OrderItem orderItem;

    //关联的会员
    private Member member;
}
