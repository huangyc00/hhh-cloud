package com.order.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 商家退货申请单申请的处理日志表,需要商家进行操作,在商家审核这个状态到下一个状态转变的时候产生
 */
@Data
@TableName(value = "order_order_refund_log")
public class OrderRefundLog extends BaseEntity {

    public interface RefuseRefund{}

    //关联的退款单
    @NotNull(message = "关联的退款单不能为空",groups = RefuseRefund.class)
    private String refundApplyId;

    //原因
    @NotNull(message = "拒绝原因不能为空",groups = RefuseRefund.class)
    private String reason;

    //说明
    private String explanation;

    //凭证图片，以分号隔开
    private String proofPics;

    //处理结果的状态，0拒绝，1同意
    private Integer handleStatus;

    //处理的店主id
    private String handlerId;

    //处理的店主的名字
    private String handlerName;

}
