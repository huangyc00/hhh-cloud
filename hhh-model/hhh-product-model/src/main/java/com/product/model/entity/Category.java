package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.bean.TreeDTO;
import lombok.Data;


/**
 * 商品类别表
 */
@Data
@TableName(value = "pro_category")
public class Category extends TreeDTO {

    //上级分类
    private String parentId;

    //类别名称
    private String name;

    //树的等级
    private Integer levelNo;

    //类别下面商品的单位
    private String unit;

    //是否显示在导航栏：0->不显示；1->显示
    private Integer navStatus;

    //序号,递增排序
    private Integer orderNo;

    //图标
    private String icon;

    //描述
    private String description;

}