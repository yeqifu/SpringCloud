package com.yeqifu.springcloud.service;

import com.yeqifu.springcloud.entities.CommonResult;
import com.yeqifu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: 落亦-
 * @Date: 2020/8/5 19:00
 */
@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    /**
     * 根据Id获取payment
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentFeignById(@PathVariable("id") Long id);

    /**
     * 调用超时的方法
     * @return
     */
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
