package com.hyc.common.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TreeDTO extends BaseEntity {

    @TableField(exist = false)
    private String name;

    @TableField(exist = false)
    private String parentId;

    @TableField(exist = false)
    private String parentName;

    @TableField(exist = false)
    private Integer orderNo = 0;

    @TableField(exist = false)
    private Integer levelNo = 0;

    @TableField(exist = false)
    private List<? extends TreeDTO> children = new ArrayList();


}
