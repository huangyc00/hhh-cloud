package com.hyc.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer  //启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterApplication.class,args);
    }

}
