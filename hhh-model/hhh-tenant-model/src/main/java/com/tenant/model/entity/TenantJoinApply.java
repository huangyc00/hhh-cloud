package com.tenant.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 租户入驻申请
 */
@Data
@TableName(value = "tenant_tenant_join_apply")
public class TenantJoinApply extends BaseEntity{

    public interface SubmitApply{}

    //店铺名称
    @NotNull(message = "店铺名称不能为空",groups = SubmitApply.class)
    private String shopName;

    //店铺类型,0个人店
    @NotNull(message = "店铺类型不能为空",groups = SubmitApply.class)
    private Integer shopType;

    //经营地址
    private String shopAddress;

    //店铺简介
    @NotNull(message = "店铺简介不能为空",groups = SubmitApply.class)
    private String shopDescription;

    //店铺的logo
    @NotNull(message = "店铺logo不能为空",groups = SubmitApply.class)
    private String shopLogo;

    //主要货源
    @NotNull(message = "主要货源不能为空",groups = SubmitApply.class)
    private String goodsSourceId;

    //主营业务id
    @NotNull(message = "主营业务id不能为空",groups = SubmitApply.class)
    private String sellCategoryId;

    //主营业务名字
    @NotNull(message = "主营业务名字不能为空",groups = SubmitApply.class)
    private String sellCategoryName;

    //货源名字
    @NotNull(message = "货源名字不能为空",groups = SubmitApply.class)
    private String goodsSourceName;

    //商家的密码
    @NotNull(message = "商家密码不能为空",groups = SubmitApply.class)
    private String tenantPassword;

    //身份证正面（头像一侧）
    @NotNull(message = "身份证正面（头像一侧）不能为空",groups = SubmitApply.class)
    private String identityCartFront;

    //身份证反面（国徽一侧）
    @NotNull(message = "身份证反面（国徽一侧）不能为空",groups = SubmitApply.class)
    private String identityCartRear;

    @NotNull(message = "店主名字不能为空",groups = SubmitApply.class)
    private String masterName;

    @NotNull(message = "手机不能为空",groups = SubmitApply.class)
    private String masterMobile;

    //身份证号码
    @NotNull(message = "身份证号码不能为空",groups = SubmitApply.class)
    private String identityNo;

    //证件类型,0代表固定期限有效
    @NotNull(message = "证件期限类型不能为空",groups = SubmitApply.class)
    private Integer cartTimeType;

    //证件有限期
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date cartExpireTime;

    //脸照
    @NotNull(message = "脸照不能为空",groups = SubmitApply.class)
    private String faceImage;

    //状态，0待审核，1成功，2审核失败
    private Integer status;
}
