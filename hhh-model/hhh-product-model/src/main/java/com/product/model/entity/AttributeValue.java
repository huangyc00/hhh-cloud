package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@TableName(value = "pro_attribute_value")
public class AttributeValue extends BaseEntity {

    public interface SaveNoReferId{}

    @NotNull(message = "属性id不能为空",groups = AttributeValue.SaveNoReferId.class)
    private String attributeId;

    //手动添加规格或参数的值
    @NotNull(message = "属性值不能为空",groups = {Product.SaveProduct.class,AttributeValue.SaveNoReferId.class})
    private String value;

    //商家id
    private String tenantId;

//    //关联的商品
//    private String productId;

    //直接引用的id
    @NotNull(message = "引用的属性值id不能为空",groups = {Product.SaveProduct.class,Product.UpdateProduct.class})
    private String referId;

    //是否可以被创建的商家进行搜索,0否，1是
    private Integer searchAble;

    //按照规格的序号
    private Integer attOrderNo;

    private String imageUrl;


}