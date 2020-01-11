package com.product.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.product.model.entity.Attribute;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttributeMapper extends BaseMapper<Attribute> {

    List<Attribute> findListByTypeAndProductId(@Param("type") Integer type, @Param("productId") String productId);

}
