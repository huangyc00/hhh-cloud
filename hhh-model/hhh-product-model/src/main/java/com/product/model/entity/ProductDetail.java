package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * @author hyc
 * @description
 * @date 2019-06-11 14:36
 */
@Data
@TableName(value = "pro_product_detail")
public class ProductDetail extends BaseEntity {

    //关联的商品id
    private String productId;

    //商品的详情
    @NotNull(message = "详情不能为空",groups = {Product.SaveProduct.class,Product.UpdateProduct.class})
    @Length(message = "长度不能超过2000",max = 2000,groups = {Product.SaveProduct.class,Product.UpdateProduct.class})
    private String detail;

}
