package com.yeqifu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: 落亦-
 * @Date: 2020/8/6 18:14
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignHystrixMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignHystrixMain80.class,args);
    }

}
