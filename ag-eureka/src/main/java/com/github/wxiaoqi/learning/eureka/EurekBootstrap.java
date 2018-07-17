package com.github.wxiaoqi.learning.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author XX
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(EurekBootstrap.class,args);
    }
}
