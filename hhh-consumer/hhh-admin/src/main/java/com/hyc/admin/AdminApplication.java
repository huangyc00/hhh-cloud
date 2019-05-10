package com.hyc.admin;


import com.hyc.admin.listener.TestTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(TestTopic.class)
@EnableDiscoveryClient(autoRegister = false)
@EnableFeignClients(basePackages = {"com.hyc.*.api"})
@SpringBootApplication
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
