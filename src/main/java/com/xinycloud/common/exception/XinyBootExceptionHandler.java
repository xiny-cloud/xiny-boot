package com.xinycloud.common.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Auther: xiny
 * @Date: 2020/1/5 0005 02:48
 * @Description: SpringBoot全局异常捕获
 */
@RestControllerAdvice
public class XinyBootExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public String ExceptionHandler(Exception e) {
        return "SpringBoot全局异常捕获 - 出现异常了";
    }
}
