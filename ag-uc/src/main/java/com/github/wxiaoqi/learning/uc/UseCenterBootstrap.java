package com.github.wxiaoqi.learning.uc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan("com.github.wxiaoqi.learning.uc.mapper")
@EnableTransactionManagement
public class UseCenterBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(UseCenterBootstrap.class, args);
    }
}
