package com.yeqifu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: 落亦-
 * @Date: 2020/7/30 11:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T date;
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
