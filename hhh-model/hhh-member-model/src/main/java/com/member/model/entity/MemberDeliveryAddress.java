package com.member.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@TableName(value = "mem_member_delivery_address")
public class MemberDeliveryAddress extends BaseEntity {

    public interface SaveDeliveryAddress{}
    public interface UpdateDeliveryAddress{}

    @NotNull(message = "id不能为空",groups = UpdateDeliveryAddress.class)
    @Override
    public String getId(){
        return super.getId();
    }

    //关联的会员id
    private String memberId;

    //收货人姓名
    @NotNull(message = "收货人姓名不能为空",groups = {SaveDeliveryAddress.class,UpdateDeliveryAddress.class})
    private String receiveName;

    //邮编
    private String postalCode;

    //国标收货地址第一级地址
    @NotNull(message = "国标收货地址第一级地址不能为空",groups = {SaveDeliveryAddress.class,UpdateDeliveryAddress.class})
    private String provinceName;

    //国标收货地址第二级地址
    @NotNull(message = "国标收货地址第二级地址不能为空",groups = {SaveDeliveryAddress.class,UpdateDeliveryAddress.class})
    private String cityName;

    //国标收货地址第三级地址
    @NotNull(message = "国标收货地址第三级地址不能为空",groups = {SaveDeliveryAddress.class,UpdateDeliveryAddress.class})
    private String countyName;

    //详细收货地址信息
    @NotNull(message = "详细收货地址信息不能为空",groups = {SaveDeliveryAddress.class,UpdateDeliveryAddress.class})
    private String detailInfo;

    //收货人手机号码
    @NotNull(message = "手机号码不能为空",groups = {SaveDeliveryAddress.class,UpdateDeliveryAddress.class})
    private String telNumber;

    //是否是默认，0否，1是
    @NotNull(message = "是否是默认不能为空",groups = {SaveDeliveryAddress.class,UpdateDeliveryAddress.class})
    private Integer isDefault;
}
