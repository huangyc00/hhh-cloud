package com.member.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * 会员店铺收藏
 */
@Data
@TableName(value = "mem_member_collect_shop")
public class MemberCollectTenant extends BaseEntity {

    private String memberId;

    private String tenantId;

}
