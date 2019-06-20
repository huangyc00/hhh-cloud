package com.hyc.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import zipkin.server.internal.EnableZipkinServer;
import zipkin.storage.mysql.MySQLStorage;

import javax.sql.DataSource;

/**
 * @author hyc
 * @description
 * @date 2019-06-20 10:57
 */
@EnableZipkinServer
@SpringBootApplication
public class ZipkinServer {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServer.class, args);
    }


    @Bean
    public MySQLStorage mySQLStorage(DataSource datasource) {
        return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
    }
}
