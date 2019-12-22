package com.coupon.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

@Data
@TableName(value = "sys_role_permission_rel")
public class RolePermissionRel extends BaseEntity {

    private String roleId;

    private String permissionId;


}
