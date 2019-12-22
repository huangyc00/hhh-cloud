package com.order.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 售后状态改变日志记录表
 */
@Data
@TableName(value = "order_refund_status_change_log")
public class RefundStatusChangeLog extends BaseEntity {

    public interface ManualRefund{}

    public class OperatorType {
        public final static int MEMBER = 0;
        public final static int TENANT = 1;
        public final static int SYSTEM = 2;
        public final static int ADMIN = 3;
    }

    //处理人id
    private String operatorId;

    //处理人类型,0会员，1商家，2系统，3管理员
    private Integer operatorType;

    //操作人名字
    private String operatorName;

    //处理内容
    private String handleContent;

    //凭证图片，以分号隔开
    private String proofPics;

    //备注(说明)
    private String remark;

    //原因
    private String  reason;

    //处理的过期时间
    private Date expireTime;

    //参考RefundStatus这个类
    private Integer refundStatus;

    //关联的退款单
    @NotNull(message = "关联的退款单不能为空",groups = ManualRefund.class)
    private String refundApplyId;

}