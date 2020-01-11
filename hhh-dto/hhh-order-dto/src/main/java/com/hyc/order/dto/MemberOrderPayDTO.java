package com.hyc.order.dto;

import com.member.model.entity.Member;
import com.order.model.entity.MemberOrderPay;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
public class MemberOrderPayDTO extends MemberOrderPay {

    //商家的订单
    @Valid
    @NotNull(message = "商家订单不能为空",groups = MemberOrderPay.CreateMemberOrder.class)
    private List<OrderDTO> orderList;

    //关联的会员
    private Member member;

    //应付金额(每个订单支付金额的综合)
    private BigDecimal payAmount;

    //    -------------------------------收货信息---------------------------------
    //收货人电话
    @NotNull(message = "收货人电话不能为空",groups = CreateMemberOrder.class)
    private String receiverPhone;

    //收货人姓名
    @NotNull(message = "收货人姓名不能为空",groups = CreateMemberOrder.class)
    private String receiverName;

    //收货人邮编
    private String postalCode;

    //国标收货地址第一级地址
    @NotNull(message = "收货人一级地址（省或直辖市）不能为空",groups = CreateMemberOrder.class)
    private String provinceName;

    //国标收货地址第二级地址
    @NotNull(message = "收货人二级地址（市）不能为空",groups = CreateMemberOrder.class)
    private String cityName;

    //国标收货地址第三级地址
    @NotNull(message = "收货人三级地址不能为空",groups = CreateMemberOrder.class)
    private String countyName;

    //详细收货地址信息
    @NotNull(message = "详细收货地址信息不能为空",groups = CreateMemberOrder.class)
    private String detailInfo;

}
