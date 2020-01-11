package com.hyc.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable{

    private String id;

    private Date createDate;

    private Date updateDate;

    //逻辑删除标志,0没被删除,1被删除
    private Integer deleteFlag;

}
