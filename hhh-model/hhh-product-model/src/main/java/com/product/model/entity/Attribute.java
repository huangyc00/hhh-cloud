package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;


@Data
@TableName(value = "pro_attribute")
public class Attribute extends BaseEntity {

    public interface SaveAttribute{}
    public interface UpdateAttribute{}

    @NotNull(message = "属性的id不能为空",groups = {Product.SaveProduct.class,Product.UpdateProduct.class})
    @NotNull(message = "属性的id不能为空",groups = {UpdateAttribute.class})
    @Override
    public String getId() {
        return super.getId();
    }

    //属性名称不能为空
    @NotNull(message = "属性名称不能为空",groups = {Product.SaveProduct.class,Product.UpdateProduct.class})
    @NotNull(message = "属性名称不能为空",groups = {SaveAttribute.class,UpdateAttribute.class})
    private String name;

    //是否支持手动新增；0->不支持；1->支持
    @NotNull(message = "手动新增类型不能为空",groups = {SaveAttribute.class,UpdateAttribute.class})
    private Integer addStatus;

    //是否支持添加图片;0不支持，1支持
    private Integer addImage;

    //属性的类型；0->规格；1->参数
    @NotNull(message = "属性的类型不能为空",groups = {SaveAttribute.class,UpdateAttribute.class})
    private Integer type;

    //属性选择类型：0->唯一；1->单选；2->多选
    private Integer selectType;

    //备注
    private String remark;
}