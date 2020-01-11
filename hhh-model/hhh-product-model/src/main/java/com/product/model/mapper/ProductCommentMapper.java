package com.product.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.product.model.entity.ProductComment;

import java.math.BigDecimal;

public interface ProductCommentMapper extends BaseMapper<ProductComment> {

    BigDecimal findApplauseRate(String productId);
}
