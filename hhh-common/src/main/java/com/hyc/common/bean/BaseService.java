package com.hyc.common.bean;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hyc.common.entity.BaseEntity;

public interface BaseService<M extends BaseMapper<T>,T extends BaseEntity> extends IService<T>{

    T defaultSaveOrUpdate(T t);

}
