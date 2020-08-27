package com.yeqifu.springcloud.service;

import com.yeqifu.springcloud.entities.CommonResult;
import com.yeqifu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author: 落亦-
 * @Date: 2020/8/26 19:24
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回,-----PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
