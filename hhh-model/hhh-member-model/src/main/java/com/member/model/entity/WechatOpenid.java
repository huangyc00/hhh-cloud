package com.member.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;


@Data
@TableName(value = "mem_wechat_openid")
public class WechatOpenid extends BaseEntity {

    private String openid;

    private String appid;

    private String unionid;

    private String memberId;

    //关联的商家的id
    private String tenantMasterId;
}
