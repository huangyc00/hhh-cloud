package com.hyc.user.api.entity;

import com.hyc.common.entity.BaseEntity;
import lombok.Data;

@Data
public class User extends BaseEntity {

    private String name;

    private String username;

}
