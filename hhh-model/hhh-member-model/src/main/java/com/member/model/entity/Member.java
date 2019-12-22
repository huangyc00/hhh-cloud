package com.member.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@TableName(value = "mem_member")
public class Member extends BaseEntity {

    public interface Login{};

    private String name;

    private String nickName;

    private String userName;

    private String password;

    private String mobile;

    //头像
    private String avatarUrl;

    //绑定的微信id
    @NotNull(message = "unionid不能为空",groups = Login.class)
    private String unionid;

    private Integer gender;

    //是否是新用户,0否，1是,注册过后30天变成不是新用户，30天这个可以在系统设置里面配置
    private Integer isNewMember;


}
