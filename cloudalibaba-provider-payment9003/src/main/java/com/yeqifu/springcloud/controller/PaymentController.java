package com.yeqifu.springcloud.controller;

import com.yeqifu.springcloud.entities.CommonResult;
import com.yeqifu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Author: 落亦-
 * @Date: 2020/8/25 19:24
 */
@RestController
public class PaymentController {

    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1L,new Payment(1L,"23k2j34kjhkj234j2h3g4lh2lkjhl"));
        hashMap.put(1L,new Payment(2L,"bbbkbbbb4kjhkj234j2h3g4lh2lkjhl"));
        hashMap.put(1L,new Payment(3L,"vvvvvvvvvvjhkjj2h3g4lh2lkjhl"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id")Long id){
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult<>(200,"from mysql,serverPort:"+serverPort,payment);
        return result;
    }

}
