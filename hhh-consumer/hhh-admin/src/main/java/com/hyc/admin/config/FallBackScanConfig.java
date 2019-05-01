package com.hyc.admin.config;

import com.hyc.user.api.fallback.UserFallBack;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author hyc
 * @description
 * @date 2019-05-01 15:53
 */
@Configuration
@ComponentScan(basePackages = "com.hyc.*.api.fallback")
public class FallBackScanConfig {

//    @Bean
//    public UserFallBack getUserFallBack(){
//        return new UserFallBack();
//    }
}
