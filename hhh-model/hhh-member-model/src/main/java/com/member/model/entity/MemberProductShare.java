package com.member.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

/**
 * @author hyc
 * @description 会员分享商品表
 * @date 2019-06-03 17:51
 */
@Data
@TableName(value = "mem_member_product_share")
public class MemberProductShare extends BaseEntity{

    //所属的用户
    private String memberId;

    //订单id,标识是从哪个订单分享出来的
    private String orderId;

    //订单项目id，哪个订单项分享出来的
    private String orderItemId;


}
