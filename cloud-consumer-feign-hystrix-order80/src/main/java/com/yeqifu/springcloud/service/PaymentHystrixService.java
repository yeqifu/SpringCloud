package com.yeqifu.springcloud.service;

import com.yeqifu.springcloud.service.impl.PaymentFallbackServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: 落亦-
 * @Date: 2020/8/6 18:32
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallbackServiceImpl.class)
public interface PaymentHystrixService {

    /**
     * 正常的方法
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/hystrix/ok/{id}")
    String paymentInfo_OK(@PathVariable("id") Integer id);

    /**
     * 调用超时的方法
     * @return
     */
    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    String paymentInfo_Timeout(@PathVariable("id") Integer id);

}
