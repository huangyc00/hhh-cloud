package com.product.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.product.model.entity.SlidePic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SlidePicMapper extends BaseMapper<SlidePic> {

    List<SlidePic> findShowList(Integer showNum);
}
