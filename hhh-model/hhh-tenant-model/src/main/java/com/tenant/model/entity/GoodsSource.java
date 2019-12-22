package com.tenant.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * @author hyc
 * @description 货源
 * @date 2019-06-26 18:24
 */
@Data
@TableName(value = "tenant_goods_source")
public class GoodsSource extends BaseEntity {

    private String name;

}
