package com.hyc.admin;


import com.hyc.common.annotation.EnableGlobalAdvice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.hyc.api.*"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = {"com.hyc.api.*.fallback", "com.hyc.admin"})
@EnableGlobalAdvice
public class MiniProApplication {


    public static void main(String[] args) {
        SpringApplication.run(MiniProApplication.class, args);
    }

}
