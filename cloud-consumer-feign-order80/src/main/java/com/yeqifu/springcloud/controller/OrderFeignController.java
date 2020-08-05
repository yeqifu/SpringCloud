package com.yeqifu.springcloud.controller;

import com.yeqifu.springcloud.entities.CommonResult;
import com.yeqifu.springcloud.entities.Payment;
import com.yeqifu.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: 落亦-
 * @Date: 2020/8/5 19:09
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentFeignById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentFeignById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //openfeign-ribbon,客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }

}
