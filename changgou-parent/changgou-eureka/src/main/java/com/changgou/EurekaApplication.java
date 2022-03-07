package com.changgou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhuhaibo
 * @date 2022/3/7 17:10
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {


    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
