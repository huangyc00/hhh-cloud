package com.hyc.api.member.dto;


import com.member.model.entity.CartItem;
import com.product.model.entity.Sku;
import lombok.Data;

@Data
public class CartItemDTO extends CartItem {

    private Sku sku;

}
