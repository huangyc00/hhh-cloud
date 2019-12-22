package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author hyc
 * @description 商品审核记录
 * @date 2019-06-25 15:35
 */
@Data
@TableName(value = "pro_product_check_log")
public class ProductCheckLog extends BaseEntity {


    public interface CheckSuccess {
    }

    public interface CheckFail {
    }

    //审核关联的商品
    @NotNull(message = "商品id不能为空", groups = {CheckSuccess.class, CheckFail.class})
    private String productId;

    //0成功，1失败
    private Integer status;

    //审核备注
    private String remark;

    //操作人id
    private String operatorId;

    //操作人的名字
    private String operatorName;
}
