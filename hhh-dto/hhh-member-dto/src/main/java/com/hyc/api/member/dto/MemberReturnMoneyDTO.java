package com.hyc.api.member.dto;

import com.member.model.entity.Member;
import com.member.model.entity.MemberReturnMoney;
import com.member.model.entity.ReturnMoneyHandleLog;
import com.order.model.entity.Order;
import com.order.model.entity.OrderItem;
import lombok.Data;

import java.util.List;

@Data
public class MemberReturnMoneyDTO extends MemberReturnMoney {

    private Order order;

    private OrderItem orderItem;

    private Member member;

    private List<ReturnMoneyHandleLog> returnMoneyHandleLogList;

}
