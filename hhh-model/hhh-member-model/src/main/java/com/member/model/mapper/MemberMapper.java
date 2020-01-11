package com.member.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.member.model.entity.Member;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper extends BaseMapper<Member> {

    Member findTest(@Param("id") String id);

    Integer changeNewMemberToOld(@Param("member") Member member);
}
