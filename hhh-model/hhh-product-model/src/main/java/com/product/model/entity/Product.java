package com.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hyc.common.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName(value = "pro_product")
public class Product extends BaseEntity {

    public interface SaveProduct {
    }

    public interface UpdateProduct {
    }

    @Override
    @NotNull(message = "商品id不能为空", groups = {UpdateProduct.class})
    public String getId() {
        return super.getId();
    }

    //商品的牌子
    @NotNull(message = "品牌id不能为空", groups = {SaveProduct.class, UpdateProduct.class})
    private String brandId;

    //商品所属的分类
    @NotNull(message = "分类id不能为空", groups = {SaveProduct.class, UpdateProduct.class})
    private String categoryId;

    //商品名称
    @NotNull(message = "名称不能为空", groups = {SaveProduct.class, UpdateProduct.class})
    private String name;

    //商品标题
    @NotNull(message = "标题不能为空", groups = {SaveProduct.class, UpdateProduct.class})
    private String title;

    //商品展示的图片
    private String showPic;

    //商品号
    @NotNull(message = "商品编号不能为空", groups = {SaveProduct.class, UpdateProduct.class})
    private String productSn;

    //上架状态：0->下架；1->上架
    @Deprecated
    private Integer publishStatus;

    //审核状态：0->未审核 1 ->审核中 2 ->审核不通过 99 ->审核通过
    private Integer checkStatus;

    //最新过审的时间
    private Date passDate;

    //最新的推送时间
    private Date submitDate;

    //展示排序
    private Integer orderNo;

    //单位
    @NotNull(message = "计量单位不能为空", groups = {SaveProduct.class, UpdateProduct.class})
    private String unit;

    // 商家id
    private String tenantId;

    //累计销量
    private Integer sellNum;

    //json字符串形式的参数保存,如{"颜色":"红色"}
    private String parameterJsonStr;

    //运费金额
    private BigDecimal freightAmount;
}