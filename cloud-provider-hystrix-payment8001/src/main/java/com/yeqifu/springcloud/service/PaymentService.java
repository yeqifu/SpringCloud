package com.yeqifu.springcloud.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @Author: 落亦-
 * @Date: 2020/8/6 10:24
 */
@Service
public class PaymentService {

    /**
     * 调用正常
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   PaymentInfo_OK,id:  "+id;
    }

    /**
     * 等待三秒后正常调用
     * @param id
     * @return
     */
    public String paymentInfo_Timeout(Integer id){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int timeNumber=3;
        return "线程池："+Thread.currentThread().getName()+"   PaymentInfo_Timeout,id:   "+id+"\t"+"超时：  "+timeNumber+" 秒后调用";
    }

}
