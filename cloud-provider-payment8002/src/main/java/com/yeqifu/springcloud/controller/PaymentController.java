package com.yeqifu.springcloud.controller;

import com.yeqifu.springcloud.constast.SysConstast;
import com.yeqifu.springcloud.entities.CommonResult;
import com.yeqifu.springcloud.entities.Payment;
import com.yeqifu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: 落亦-
 * @Date: 2020/7/29 20:56
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    /**
     * 插入一条记录
     * @param payment
     * @return
     */
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("******插入的结果："+result);
        if(result>0){
            return new CommonResult(SysConstast.SUCCESS,SysConstast.MESSAGE_SUCCESS+"端口为："+serverPort,payment);
        }else {
            return new CommonResult(SysConstast.ERROR,SysConstast.MESSAGE_ERROR,null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null){
            return new CommonResult(SysConstast.SUCCESS,SysConstast.MESSAGE_SUCCESS+"端口为："+serverPort,payment);
        }else {
            return new CommonResult(SysConstast.ERROR,SysConstast.MESSAGE_ERROR,null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

}
