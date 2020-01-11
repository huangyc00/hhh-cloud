package com.product.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.product.model.entity.AttributeValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttributeValueMapper extends BaseMapper<AttributeValue> {


    List<AttributeValue> findListBySkuId(@Param("skuId") String skuId);

    Integer deleteListBySkuIdAndNotIn(@Param("skuId") String skuId, @Param("attributeValueList") List<AttributeValue> attributeValueList);
}
