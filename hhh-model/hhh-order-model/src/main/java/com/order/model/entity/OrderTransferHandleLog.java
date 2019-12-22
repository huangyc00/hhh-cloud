package com.order.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 订单转账单，订单完成交易后（过了售后期生成,并且没有退款成功）生成该记录,可以进行后续认为或者调用第三方的api进行转账操作
 */
@Data
@TableName(value = "order_order_transfer_handle_log")
public class OrderTransferHandleLog extends BaseEntity{

    public interface ManualTransfer{}

    private String transferHandleSn;

    private BigDecimal transferAmount;

    //转账类型，详见TransferType
    private Integer transferType;

    //动作结果，0失败，1成功
    private Integer status;

    //记录创建人，其实出发动作的账号，为运营端账号
    private String creatorId;

    //操作人的名字
    private String creatorName;

    //凭证图片，以分号隔开
    private String proofPics;

    //备注
    private String remark;

    //关联的订单转账单记录
    @NotNull(message = "关联的订单转账单不能为空",groups = {ManualTransfer.class})
    private String orderTransferId;
}


