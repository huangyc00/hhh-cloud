package com.coupon.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.bean.TreeDTO;
import lombok.Data;

@Data
@TableName(value = "sys_permission")
public class Permission  extends TreeDTO {

    //名称
    private String name;

    //图标
    private String icon;

    //权限类型：0->菜单；1->按钮（接口绑定权限）
    private Integer type;

    //前端资源路径
    private String uri;

    //启用状态；0->禁用；1->启用
    private Integer status;

    //权限的上一级
    private String parentId;

    //序号
    private Integer orderNo;

}
