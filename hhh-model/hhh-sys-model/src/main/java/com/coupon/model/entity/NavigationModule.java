package com.coupon.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

@Data
@TableName(value = "sys_navigation_module")
public class NavigationModule extends BaseEntity {

    private String name;

    private Integer orderNo;

    //是否启用
    private Integer status;

    private String showPic;

    //数据类型,0分类
    private Integer type;

    private String associationId;

}
