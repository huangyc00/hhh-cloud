package com.hyc.order;

import com.hyc.common.annotation.EnableGlobalAdvice;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hyc
 * @description
 * @date 2019-06-18 11:45
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(value = "com.order.model.mapper")
@EnableGlobalAdvice
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}
