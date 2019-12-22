package com.order.model.entity;

import com.hyc.common.entity.BaseEntity;
import lombok.Data;

@Data
public class ReceiverAddress extends BaseEntity {

    //收货人的id
    private String receiverId;

    //收发货人姓名
    private String receiverName;

    //收货人电话
    private String receiverPhone;

    //省/直辖市
    private String province;

    //市
    private String city;

    //区
    private String region;

    //详细地址
    private String detailAddress;

    //是否默认收货地址：0->否；1->是
    private Integer receiveStatus;

    // 店铺id
    private String tenantId;
}