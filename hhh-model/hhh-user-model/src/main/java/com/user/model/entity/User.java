package com.user.model.entity;

import com.hyc.common.entity.BaseEntity;
import lombok.Data;

@Data
public class User extends BaseEntity {

    private String name;

    private String username;

    private String productId;

    private String orderId;
}
