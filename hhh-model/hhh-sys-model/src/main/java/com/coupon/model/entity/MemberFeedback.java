package com.coupon.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * @author hyc
 * @description 会员反馈
 * @date 2019-06-27 10:33
 */
@Deprecated
@Data
@TableName(value = "sys_member_feedback")
public class MemberFeedback extends BaseEntity {

    private String memberId;

    private String content;

    private String remark;


}
