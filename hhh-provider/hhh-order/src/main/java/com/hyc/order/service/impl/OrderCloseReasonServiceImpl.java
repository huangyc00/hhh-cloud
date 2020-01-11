package com.hyc.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hyc.common.bean.BaseServiceImpl;
import com.hyc.order.service.OrderCloseReasonService;
import com.order.model.entity.OrderCloseReason;
import com.order.model.mapper.OrderCloseReasonMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class OrderCloseReasonServiceImpl extends BaseServiceImpl<OrderCloseReasonMapper, OrderCloseReason> implements OrderCloseReasonService {


    @Override
    @Transactional
    public Boolean mergeList(List<OrderCloseReason> orderCloseReasonList) {
        //先删除孤子
        deleteListNotIn(orderCloseReasonList.stream().filter(ocr -> null != ocr.getId()).map(OrderCloseReason::getId).collect(Collectors.toList()));
        //保存或者更新
        int orderNo = 0;
        for (OrderCloseReason ocr : orderCloseReasonList) {
            ocr.setOrderNo(orderNo++);
        }
        List<OrderCloseReason> saveList = orderCloseReasonList.stream().filter(ocr -> null == ocr.getId()).collect(Collectors.toList());
        List<OrderCloseReason> updateList = orderCloseReasonList.stream().filter(ocr -> null != ocr.getId()).collect(Collectors.toList());
        this.saveList(saveList);
        this.updateList(updateList);
        return Boolean.TRUE;
    }

    @Override
    public List<OrderCloseReason> findListOrderByOrderNo() {
        QueryWrapper<OrderCloseReason> queryWrapper = Wrappers.query();
        queryWrapper.orderByAsc("order_no");
        return this.list(queryWrapper);
    }

    @Override
    public Boolean deleteListNotIn(List<String> ids) {
        QueryWrapper<OrderCloseReason> queryWrapper = Wrappers.query();
        queryWrapper.notIn(CollectionUtils.isNotEmpty(ids),"id",ids);
        return this.remove(queryWrapper);
    }

    @Override
    public Boolean saveList(List<OrderCloseReason> orderCloseReasonList) {
        if(CollectionUtils.isEmpty(orderCloseReasonList)){
            return false;
        }
        return this.saveBatch(orderCloseReasonList);
    }

    @Override
    public Boolean updateList(List<OrderCloseReason> orderCloseReasonList) {
        if(CollectionUtils.isEmpty(orderCloseReasonList)){
            return false;
        }
        return this.updateBatchById(orderCloseReasonList);
    }
}
