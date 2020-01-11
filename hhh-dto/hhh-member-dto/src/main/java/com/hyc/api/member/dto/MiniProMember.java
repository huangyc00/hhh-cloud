package com.hyc.api.member.dto;

import com.member.model.entity.Member;
import lombok.Data;

@Data
public class MiniProMember extends Member {

    private String appid;

    private String openid;

    private String unionid;

    private String sessionKey;

}
