package com.product.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.product.model.entity.ValueAddedService;

import java.util.List;

/**
 * 增值服务mapper
 */
public interface ValueAddedServiceMapper extends BaseMapper<ValueAddedService> {


    List<ValueAddedService> findListByProductId(String productId);
}
