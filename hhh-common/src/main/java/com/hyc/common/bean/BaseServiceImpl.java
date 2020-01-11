package com.hyc.common.bean;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hyc.common.entity.BaseEntity;

import java.util.Date;
import java.util.UUID;

public abstract class BaseServiceImpl<M extends BaseMapper<T>,T extends BaseEntity> extends ServiceImpl<M, T> implements BaseService<M , T>{

    @Override
    public T defaultSaveOrUpdate(T t){
        T obj = this.getById(t.getId());
        if(null == obj){
            if(null == t.getId()){
                t.setId(UUID.randomUUID().toString());
            }
            t.setCreateDate(new Date());
        }
        this.saveOrUpdate(t);
        return this.getById(t.getId());
    }

}
