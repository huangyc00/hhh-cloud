package com.coupon.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 商品模块
 */
@Data
@TableName(value = "sys_product_module")
public class ProductModule extends BaseEntity {

    public interface SaveProductModule{};
    public interface UpdateProductModule{};

    @Override
    @NotNull(message = "id不能为空",groups = {UpdateProductModule.class})
    public String getId(){
        return super.getId();
    }

    //模块名称
    @NotNull(message = "模块名称不能为空",groups = {SaveProductModule.class,UpdateProductModule.class})
    private String name;

    //模块展示图片
    private String showPic;

    //展示的序号
    private Integer orderNo;

    //展示商品的数量
    private Integer showNum;

    //是否启用,0否，1是
    @NotNull(message = "是否启用不能为空",groups = {SaveProductModule.class,UpdateProductModule.class})
    private Integer status;


}
