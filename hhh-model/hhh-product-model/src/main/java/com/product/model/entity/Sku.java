package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author hyc
 * @description sku
 * @date 2019-05-18 12:03
 */
@Data
@TableName(value = "pro_sku")
public class Sku extends BaseEntity {

    private String productId;

    //sku编号
    @NotNull(message = "sku编号不能为空",groups = {Product.SaveProduct.class,Product.UpdateProduct.class})
    private String code;

    //sku价格
    @NotNull(message = "价格不能为空",groups = {Product.SaveProduct.class,Product.UpdateProduct.class})
    private BigDecimal price;

    //库存数量
    @NotNull(message = "sku数量不能为空",groups = {Product.SaveProduct.class,Product.UpdateProduct.class})
    private Integer stock;

    //预警库存
    private Integer lowStock;

    //展示图片
    private String pic;

    //租户id,同时也是店铺id
    private  String tenantId;
}
