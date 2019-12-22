package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.bean.TreeDTO;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 用户商品评论表
 */
@Data
@TableName(value = "pro_product_comment")
public class ProductComment extends TreeDTO {

    public interface CommentToMember {
    }

    public interface SubmitComment {
    }

    public interface TenantReply{}


    @NotNull(message = "评论内容不能为空", groups = {CommentToMember.class,TenantReply.class})
    private String content;

    //评论的图片,以分号隔开
    private String images;

    //描述符合分数,1非常差，2差，3一般，4好，5非常好
    @NotNull(message = "描述相符不能为空", groups = SubmitComment.class)
    private Integer factScore;

    //物流分数，1-5
    @NotNull(message = "物流服务不能为空", groups = SubmitComment.class)
    private Integer distributionScore;

    //服务态度分数，1-5
    @NotNull(message = "服务态度不能为空", groups = SubmitComment.class)
    private Integer attitudeScore;

    //关联的商品
    private String productId;

    private String productName;

    private String skuId;

    private String skuAttr;

    //订单号
    private String orderSn;

    //关联的订单项
    @NotNull(message = "关联的订单项不能为空", groups = SubmitComment.class)
    private String orderItemId;

    //评论的最开始的一条id
    private String rootId;

    //父级评论
    @NotNull(message = "父级的评论不能为空",groups = TenantReply.class)
    private String parentId;

    //评论人的id
    private String commentorId;

    //评论人昵称
    private String commentorNickname;

    //评论人类型，0会员，1店主
    private Integer commentorType;

    //评论类型，0为会员完成订单的评论，1为商家对会员的回复
    private Integer commentType;

    //订单所属的店铺id
    private String tenantId;

}
