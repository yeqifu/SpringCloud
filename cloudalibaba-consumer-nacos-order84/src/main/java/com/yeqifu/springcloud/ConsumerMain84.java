package com.yeqifu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: 落亦-
 * @Date: 2020/8/25 20:25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerMain84 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain84.class,args);
    }
}
