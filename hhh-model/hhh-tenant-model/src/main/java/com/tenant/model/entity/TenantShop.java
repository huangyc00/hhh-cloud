package com.tenant.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@TableName(value = "tenant_tenant_shop")
public class TenantShop extends BaseEntity{
    public interface SaveTenantShop{}
    public interface UpdateTenantShop{};

    @NotNull(message = "店铺id不能为空",groups = {UpdateTenantShop.class})
    @Override
    public String getId() {
        return super.getId();
    }

    //店铺名称
    @NotNull(message = "店铺名称不能为空",groups = {SaveTenantShop.class,UpdateTenantShop.class})
    private String name;

    //经营地址
    @NotNull(message = "经营地址不能为空",groups = SaveTenantShop.class)
    private String address;

    //店铺的状态，0停用，1启用
    @NotNull(message = "店铺的状态不能为空",groups = {SaveTenantShop.class,UpdateTenantShop.class})
    private Integer status;

    //描述
    private String description;

    //主要货源id
    @NotNull(message = "货源不能为空",groups = {SaveTenantShop.class,UpdateTenantShop.class})
    private String goodsSourceId;

    //店铺图标
    @NotNull(message = "店铺图标不能为空",groups = {SaveTenantShop.class,UpdateTenantShop.class})
    private String logo;

    //店铺类型,0官方店,1个人店
    private Integer type;

    //主营业务
    private String sellCategoryId;

}
