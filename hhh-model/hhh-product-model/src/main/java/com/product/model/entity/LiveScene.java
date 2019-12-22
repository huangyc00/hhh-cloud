package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * @author hyc
 * @description 生活场景(生活场地)
 * @date 2019-06-10 10:55
 */
@Data
@TableName(value = "pro_live_scene")
public class LiveScene extends BaseEntity {

    //场景名称
    private String name;

    //启用状态,0不启用，1启用
    private Integer status;

    //排序序号
    private Integer orderNo;

    //描述
    private String description;
}
