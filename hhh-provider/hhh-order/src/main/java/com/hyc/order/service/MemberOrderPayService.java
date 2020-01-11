package com.hyc.order.service;
import com.hyc.common.bean.BaseService;
import com.order.model.entity.MemberOrderPay;
import com.order.model.mapper.MemberOrderPayMapper;

import java.util.List;

public interface MemberOrderPayService extends BaseService<MemberOrderPayMapper, MemberOrderPay> {


    /**
     * 创建会员订单的支付单
     * @param memberId 会员id
     * @param payType 0-> 微信 1->支付宝
     * @param orderIdList
     * @return
     */
    MemberOrderPay createOrderPay(String memberId, Integer payType, List<String> orderIdList);

    MemberOrderPay findByOrderPaySn(String orderPaySn);

}
