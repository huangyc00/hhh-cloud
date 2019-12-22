package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * @author hyc
 * @description
 * @date 2019-05-18 11:57
 */
@Data
@TableName(value = "pro_brand")
public class Brand extends BaseEntity {

    private String name;

    //首字母
    private String firstLetter;

    private Integer orderNo;

    //是否展示给客户看,否，1是
    private Integer showStatus;

    //品牌logo
    private String logo;

    //专区大图
    private String bigPic;

}
