package com.hyc.api.member.dto;

import com.member.model.entity.WechatOpenid;
import lombok.Data;

@Data
public class WechatOpenidDTO extends WechatOpenid {

    private String sessionKey;

}
