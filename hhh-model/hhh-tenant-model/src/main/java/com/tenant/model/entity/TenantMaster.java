package com.tenant.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 租户店主,也是商家店主
 */
@Data
@TableName(value = "tenant_tenant_master")
public class TenantMaster extends BaseEntity{
    //登录
    public interface Login{}
    public interface UpdateInfo{}
    public interface UpdatePassword{}

    @NotNull(message = "店铺名称不能为空",groups = {TenantShop.UpdateTenantShop.class})
    @Override
    public String getId() {
        return super.getId();
    }

    //姓名
    private String name;

    //昵称
    private String nickname;

    //手机号码
    @NotNull(message = "手机号码不能为空",groups = {TenantShop.SaveTenantShop.class,TenantShop.UpdateTenantShop.class,Login.class})
    private String mobile;

//    @NotNull(message = "账号不能为空",groups = {Login.class})
    private String userName;

    //密码
    @NotNull(message = "密码不能为空",groups = {Login.class})
    private String password;

    //邮箱
    private String email;

    //头像
    private String headUrl;

    //是否启用，0否，1是
    private Integer status = 0;

    //微信号
    private String wechatCode;

    //关联的店铺id(租户id)
    private String tenantId;

    //是否是主账号,0否，1是，注意：同一个租户应该只有一个是主账号
    private Integer primaryAccount;


    //身份证正面（头像一侧）
    private String identityCartFront;

    //身份证反面（国徽一侧）
    private String identityCartRear;

    //身份证号码
    private String identityNo;

    //证件期限类型，证件类型,0代表固定期限有效
    private Integer cartTimeType;

    //证件有限期
    private Date cartExpireTime;

    //脸照
    private String faceImage;

}
