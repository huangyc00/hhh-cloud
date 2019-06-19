package com.hyc.order.api.fallback;

import com.hyc.order.api.service.OrderService;
import com.order.model.entity.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author hyc
 * @description
 * @date 2019-06-18 11:41
 */
@Component
public class OrderFallBack implements OrderService {

    @Override
    public Order findById(@PathVariable("id") String id) {
        throw new RuntimeException("异常");
    }

}
