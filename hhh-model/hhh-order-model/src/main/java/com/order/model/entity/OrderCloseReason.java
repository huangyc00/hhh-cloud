package com.order.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * @author hyc
 * @description
 * @date 2019-05-24 17:54
 */
@Data
@TableName(value = "order_order_close_reason")
public class OrderCloseReason extends BaseEntity {

    private String reason;

    //序号
    private Integer orderNo;

}
