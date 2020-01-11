package com.hyc.order.service.impl;

import com.hyc.common.bean.BaseServiceImpl;
import com.hyc.order.service.MemberOrderPayService;
import com.order.model.entity.MemberOrderPay;
import com.order.model.mapper.MemberOrderPayMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MemberOrderPayServiceImpl extends BaseServiceImpl<MemberOrderPayMapper, MemberOrderPay> implements MemberOrderPayService {


    @Override
    public MemberOrderPay createOrderPay(String memberId, Integer payType, List<String> orderIdList) {
        return null;
    }

    @Override
    public MemberOrderPay findByOrderPaySn(String orderPaySn) {
        return null;
    }
}
