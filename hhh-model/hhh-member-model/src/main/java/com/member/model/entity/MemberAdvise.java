package com.member.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * 会员意见反馈
 */
@Data
@TableName(value = "mem_member_advise")
public class MemberAdvise extends BaseEntity {

    private String memberId;

    private String content;

}
