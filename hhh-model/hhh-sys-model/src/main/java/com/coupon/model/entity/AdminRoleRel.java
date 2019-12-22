package com.coupon.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

@Data
@TableName(value = "sys_admin_role_rel")
public class AdminRoleRel extends BaseEntity{

    private String adminId;

    private String roleId;
}
