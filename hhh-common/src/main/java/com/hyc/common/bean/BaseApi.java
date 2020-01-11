package com.hyc.common.bean;

import com.hyc.common.entity.BaseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.PostConstruct;

public interface BaseApi<T extends BaseEntity> {


}
