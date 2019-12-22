package com.coupon.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@TableName(value = "sys_admin")
public class Admin extends BaseEntity {

    public interface SaveAdmin{}
    public interface UpdateAdmin{}
    public interface Login{}
    public interface UpdatePassword{}
    public interface UpdateBasicInfo{}

    @NotNull(message = "id不能为空",groups = {Admin.UpdateAdmin.class})
    @Override
    public String getId(){return super.getId();}

    @NotNull(message = "用户名不能为空",groups = {SaveAdmin.class,Login.class})
    private String userName;

    @NotNull(message = "密码不能为空",groups = {SaveAdmin.class,Login.class})
    private String password;

    private String name;

    //帐号启用状态：0->禁用；1->启用
    @NotNull(message = "帐号启用状态不能为空",groups = {SaveAdmin.class})
    private Integer status;

    @NotNull(message = "手机不能为空",groups = {SaveAdmin.class,UpdatePassword.class,UpdateBasicInfo.class})
    private String mobile;

    //性别,0男，1女，2未知
    private Integer gender;

    //邮箱
    private String email;

    //地址
    private String address;

    //头像
    private String headUrl;


}
