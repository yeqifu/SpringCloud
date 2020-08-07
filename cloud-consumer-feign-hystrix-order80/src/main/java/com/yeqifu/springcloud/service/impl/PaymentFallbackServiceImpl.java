package com.yeqifu.springcloud.service.impl;

import com.yeqifu.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @Author: 落亦-
 * @Date: 2020/8/7 11:02
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "--------PaymentFallbackServiceImpl fall back-paymentInfo_OK,::>_<::";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "--------paymentFallbackService fall back-paymentInfo_TimeOut,::>_<::";
    }
}
