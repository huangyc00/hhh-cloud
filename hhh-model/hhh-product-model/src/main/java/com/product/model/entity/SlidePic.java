package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 轮播图片
 */
@Data
@TableName(value = "pro_slide_pic")
public class SlidePic extends BaseEntity {

    public interface Save{}
    public interface Update{}

    @Override
    @NotNull(message = "id不能为空",groups = {Update.class})
    public String getId(){
        return super.getId();
    }

    //展示图片的url
    @NotNull(message = "展示图不能为空",groups = {Save.class,Update.class})
    private String picUrl;

    //序号
    @NotNull(message = "序号不能为空",groups = {Save.class,Update.class})
    private Integer orderNo;

    //关联的商品id
    @NotNull(message = "关联的商品id不能为空",groups = {Save.class,Update.class})
    private String productId;

    //启用状态，0为不启用，1为启用
    @NotNull(message = "启用状态不能为空",groups = {Save.class,Update.class})
    private Integer status = 0;
}