package com.yeqifu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: 落亦-
 * @Date: 2020/8/4 14:03
 */
@RestController
@Slf4j
public class PaymentConsulController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentConsul(){
        return "SpringCloud with Consul:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }

}
