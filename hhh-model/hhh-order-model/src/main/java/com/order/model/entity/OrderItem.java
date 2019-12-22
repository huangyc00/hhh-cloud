package com.order.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author hyc
 * @description
 * @date 2019-05-24 17:55
 */
@Data
@TableName(value = "order_order_item")
public class OrderItem extends BaseEntity {

//    --------------------  订单项的属性 ---------------------------------

    //订单id
    private String orderId;

    //订单项编号
    private String orderItemSn;

    //购买数量
    @Min(value = 1, message = "购买数量最小为1", groups = Order.CreateOrderList.class)
    private Integer quantity;

    //这个是序号，不是订单号
    private Integer orderNo;

    //订单项总金额
    private BigDecimal totalAmount;

    //订单项实际支付金额
    private BigDecimal payAmount;

    //优惠码减掉的价格
    private BigDecimal couponAmount;

    //折扣扣掉的金额,暂时没用
    private BigDecimal discountAmount;

    //是否完成评价,0否，1是
    private Integer finishComment;

    //订单项确定收货时的预订的自动评价的时间点
    private Date autoCommentTime;

    //可以退款的最晚时间（也是售后的最晚时间）
    private Date refundExpireTime;

    //  ---------------------  商品的快照属性 -------------------------------------
    //商品id
    private String productId;

    //商品编号
    private String productSn;

    //商品名称
    private String productName;

    //商品的展示图片,这个不一定和商品展示的图片一样
    private String productShowPic;

    private String memberId;

    //    ------------------- 品牌的快照属性 -------------------------------------------------
    //品牌id
    private String brandId;

    //品牌名称
    private String brandName;


    //   ------------------------------- sku的快照属性 -------------------------------------------------
    //商品sku的d
    @NotNull(message = "关联的sku不能为空", groups = Order.CreateOrderList.class)
    private String skuId;

    //商品sku条码
    private String skuCode;

    //"商品销售属性:[{'key':'颜色','value':'颜色'},{'key':'容量','value':'4G'}]")
    private String skuAttr;

    //加入是sku的单价
    private BigDecimal skuPrice;

    //sku展示的图片
    private String skuPic;

    //    ------------------------------- 商户的快照属性-----------------------------------------------
    // 店铺id
    private String tenantId;

    //店铺名称
    private String tenantName;

//////    --------------------------------  关联的返现表 ---------------------------------------------------

    //关联的返现的id
    private String productShareId;


}
