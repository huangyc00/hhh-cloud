package com.member.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.member.model.entity.WechatOpenid;
import org.apache.ibatis.annotations.Param;

public interface WechatOpenidMapper extends BaseMapper<WechatOpenid> {

    int udpateMemberIdByAppidAndOpenId(@Param("memberId") String memberId, @Param("appid") String appid, @Param("openid") String openid);
}
