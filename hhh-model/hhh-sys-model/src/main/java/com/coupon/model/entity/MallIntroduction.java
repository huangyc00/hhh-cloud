package com.coupon.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author hyc
 * @description 商城简介
 * @date 2019-06-27 09:54
 */
@Data
@TableName(value = "sys_mall_introduction")
public class MallIntroduction extends BaseEntity {

    public interface Update{}


    @NotNull(message = "id不能为空",groups = Update.class)
    @Override
    public String getId(){
        return super.getId();
    }

    private String content;

}
