package com.member.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author hyc
 * @description 购物车
 * @date 2019-05-24 18:24
 */
@Data
@TableName(value = "mem_cart_item")
public class CartItem extends BaseEntity {

    public interface UpdateQuantity{};
    public interface AddToCart{};

    @NotNull(message = "id不能为空",groups = UpdateQuantity.class)
    @Override
    public String getId(){
        return super.getId();
    }

    //关联的sku
    @NotNull(message = "关联sku的id不能为空",groups = AddToCart.class)
    private String skuId;

    //关联的会员
    private String memberId;

    //购买数量
    @Min(value = 1,message = "最小值大于0",groups = UpdateQuantity.class)
    private Integer quantity;

    //商品分享的id
    private String productShareId;
}
