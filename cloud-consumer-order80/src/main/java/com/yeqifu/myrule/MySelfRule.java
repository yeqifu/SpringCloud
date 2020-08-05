package com.yeqifu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 落亦-
 * @Date: 2020/8/5 11:28
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //定义为随机
        return new RandomRule();
    }

}
