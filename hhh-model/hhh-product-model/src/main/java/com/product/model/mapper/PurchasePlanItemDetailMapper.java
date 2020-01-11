package com.product.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.product.model.entity.PurchasePlanItemDetail;

public interface PurchasePlanItemDetailMapper extends BaseMapper<PurchasePlanItemDetail> {

    int findSumQuantity(String purchasePlanId);

}
