package com.coupon.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

@Data
@TableName(value = "sys_product_share_rule")
public class ProductShareRule extends BaseEntity {

    //规则的具体内容
    private String content;

    //规则分享的标题
    private String title;

}
