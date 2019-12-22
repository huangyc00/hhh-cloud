package com.coupon.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@TableName(value = "sys_role")
public class Role extends BaseEntity {

    public interface SaveRole{}
    public interface UpdateRole{}

    @NotNull(message = "角色id不能为空",groups = {Role.UpdateRole.class})
    @Override
    public String getId(){return super.getId();}

    @NotNull(message = "角色名称不能为空",groups = {Role.SaveRole.class,Role.UpdateRole.class})
    private String name;

    //描述
    private String description;

    //启用状态：0->禁用；1->启用
    @NotNull(message = "启用状态不能为空",groups = {Role.SaveRole.class,Role.UpdateRole.class})
    private Integer status;


}
