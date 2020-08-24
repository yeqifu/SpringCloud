package com.yeqifu.springcloud.controller;

import ch.qos.logback.core.util.TimeUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author: 落亦-
 * @Date: 2020/8/17 15:23
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        /*try {
            TimeUnit.MILLISECONDS.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        log.info(Thread.currentThread().getName()+"\t"+"....testA");
        return "--------testA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "--------testB";
    }

    @GetMapping("/testD")
    public String testD(){
        //休眠1秒
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("testD 测试RT");
        return "----testD";
    }

    @GetMapping("/testE")
    public String testE(){
        int age=10/0;
        log.info("testE 测试异常比例");
        return "-----testE";
    }

    @GetMapping("/testF")
    public String testF(){
        int age=10/0;
        log.info("testF 测试异常数");
        return "-----testF";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2){
        return "---------testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException exception){
        return "-----------deal_testHotKey,::>_<::";
    }

}
