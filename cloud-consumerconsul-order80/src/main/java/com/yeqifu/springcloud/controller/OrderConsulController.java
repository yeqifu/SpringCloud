package com.yeqifu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: 落亦-
 * @Date: 2020/8/4 15:07
 */
@RestController
@Slf4j
public class OrderConsulController {

    public static final String INVOKE_URL="http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/payment/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return result;
    }

}
