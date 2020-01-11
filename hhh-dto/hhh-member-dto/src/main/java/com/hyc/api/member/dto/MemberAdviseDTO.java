package com.hyc.api.member.dto;

import com.member.model.entity.Member;
import com.member.model.entity.MemberAdvise;
import lombok.Data;

@Data
public class MemberAdviseDTO extends MemberAdvise {

    private Member member;

    //会员的昵称
    private String memberNickname;

}
