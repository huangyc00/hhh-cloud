package com.product.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.product.model.entity.Category;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper extends BaseMapper<Category> {

    int updateLevelNo(@Param("parentId") String parentId, @Param("levelNo") Integer levelNo);

    Integer updateFullById(@Param("category") Category category);
}
