package com.member.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 返现处理日志表
 */
@Data
@TableName(value = "mem_return_money_handle_log")
public class ReturnMoneyHandleLog extends BaseEntity {

    //人工返现
    public interface ManualReturnMoney{};

    //返现操作编号
    private String returnMoneyHandleSn;

    //返现金额
    private BigDecimal returnMoneyAmount;

    //关联的会员
    private String memberId;

    //关联的会员返现表
    @NotNull(message = "关联的返现表不能为空",groups = {ManualReturnMoney.class})
    private String memberReturnMoneyId;

    //返现类型（和转账类型公用），详见TransferType
    private Integer type;

    //动作结果，0失败，1成功
    private Integer status;

    //凭证图片，以分号隔开
    private String proofPics;

    //备注
    private String remark;

    //记录创建人，其实出发动作的账号，为运营端账号
    private String creatorId;

    //操作人的名字
    private String creatorName;


}
