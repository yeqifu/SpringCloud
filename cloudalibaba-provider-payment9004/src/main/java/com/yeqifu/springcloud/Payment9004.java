package com.yeqifu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: 落亦-
 * @Date: 2020/8/25 19:34
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9004 {

    public static void main(String[] args) {
        SpringApplication.run(Payment9004.class,args);
    }

}
