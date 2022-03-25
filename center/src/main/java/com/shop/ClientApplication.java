package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yanghd
 * @version 1.0
 * @date 2022/3/24 0:04
 */
@EnableEurekaClient
@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args){
        SpringApplication.run(ClientApplication.class, args);
    }
}
