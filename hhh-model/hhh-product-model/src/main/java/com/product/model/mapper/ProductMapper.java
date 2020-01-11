package com.product.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.product.model.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProductMapper extends BaseMapper<Product> {


    BigDecimal findMaxFreightAmount(@Param("ids") List<String> ids);

    BigDecimal findMaxFreightAmountBySkuIdList(@Param("skuIdList") List<String> skuIdList);

    Integer autoAddSellNum(@Param("orderIdList") List<String> orderIdList);

    List<? extends Product> findListByCouponTemplateId(String couponTemplateId);
}
