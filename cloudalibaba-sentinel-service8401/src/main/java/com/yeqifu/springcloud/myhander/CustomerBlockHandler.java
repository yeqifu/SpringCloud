package com.yeqifu.springcloud.myhander;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yeqifu.springcloud.entities.CommonResult;

/**
 * @Author: 落亦-
 * @Date: 2020/8/25 13:00
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(444,"兜底的方法---------1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(444,"兜底的方法---------2");
    }

}
