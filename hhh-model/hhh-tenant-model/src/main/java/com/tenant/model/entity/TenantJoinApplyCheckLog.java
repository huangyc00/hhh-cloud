package com.tenant.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * 租户入驻申请
 */
@Data
@TableName(value = "tenant_tenant_join_apply_check_log")
public class TenantJoinApplyCheckLog extends BaseEntity{

    //审查的结果,0不通过,1通过
    private Integer checkResult;

    private String remark;

    //操作人id,关联后台管理员的id
    private String operatorId;

    //操作人的名字
    private String operatorName;

    private String tenantJoinApplyId;
}
