package com.hyc.admin.ao;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.hyc.api.order.api.OrderApi;
import com.hyc.api.order.api.OrderItemValueAddedServiceApi;
import com.hyc.api.order.api.OrderRefundApplyApi;
import com.hyc.common.exception.BaseException;
import com.hyc.api.order.api.OrderItemApi;
import com.hyc.order.dto.OrderItemDTO;
import com.order.model.entity.Order;
import com.order.model.entity.OrderItem;
import com.order.model.entity.OrderItemValueAddedService;
import com.order.model.entity.OrderRefundApply;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemAO {

    @Autowired
    OrderItemApi orderItemApi;

    @Autowired
    OrderApi orderApi;

    @Autowired
    OrderItemValueAddedServiceApi orderItemValueAddedServiceService;

    @Autowired
    OrderRefundApplyApi orderRefundApplyService;

    public OrderItemDTO findShareEnabled(String orderItemId,String memberId) {
        OrderItem orderItem = orderItemApi.findById(orderItemId);
        List<OrderItemValueAddedService> valueAddedServiceList = orderItemValueAddedServiceService.findListByOrderItemIdAndServiceType(orderItemId,200);
        if(null == orderItem){
            throw new BaseException("订单项不存在");
        }
        if(CollectionUtils.isEmpty(valueAddedServiceList)){
            throw new BaseException("订单项没有对应的增值服务,不能进行分享");
        }
        Order order = orderApi.findById(orderItem.getOrderId());
        OrderRefundApply orderRefundApply = orderRefundApplyService.findByOrderItemId(orderItem.getId());
        if(null == order){
            throw new BaseException("订单不存在");
        }
        if(400 != order.getStatus() || 500 != order.getStatus()){
            throw new BaseException("当前订单的状态不能用于分享");
        }
        if(null != orderRefundApply && 10 == orderRefundApply.getStatus()){
            throw new BaseException("卖家已经同意退款，不能进行分享");
        }
        if(null != orderRefundApply && 20 == orderRefundApply.getStatus()){
            throw new BaseException("已经成功退款了，不能再分享");
        }
        OrderItemDTO result = new OrderItemDTO();
        BeanUtils.copyProperties(orderItem,result);
        result.setOrderItemValueAddedServiceList(valueAddedServiceList);
        result.setNewestOrderRefundApply(orderRefundApply);
        return result;
    }

}
