package com.tenant.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * 租户店主,也是商家店主
 */
@Data
@TableName(value = "tenant_tenant_delivery_address")
public class TenantDeliveryAddress extends BaseEntity {

    //联系人名字
    private String contactName;

    //联系手机号码
    private String contactMobile;

    //邮编
    private String postalCode;

    //国标收货地址第一级地址
    private String provinceName;

    //国标收货地址第二级地址
    private String cityName;

    //国标收货地址第三级地址
    private String countyName;

    //详细收货地址信息
    private String detailInfo;

    //发货是否默认，0否，1是
    private Integer sendIsDefault;

    //收货是否默认，0否，1是
    private Integer getIsDefault;

    //关联的租户的id
    private String tenantId;
}
