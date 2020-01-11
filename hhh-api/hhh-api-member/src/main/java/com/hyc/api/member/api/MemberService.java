package com.hyc.api.member.api;

import com.hyc.common.bean.BaseService;
import com.member.model.entity.Member;
import com.member.model.mapper.MemberMapper;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "hhh-member-service")
public interface MemberService extends BaseService<MemberMapper, Member> {

}
