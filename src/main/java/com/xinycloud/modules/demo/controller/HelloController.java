package com.xinycloud.modules.demo.controller;

import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.objects.XStringForChars;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xiny
 * @Date: 2020/1/5 0005 03:36
 * @Description:
 */
@RestController
public class HelloController {

    /**
     * @Author xiny
     * @Description 
     * @Date 2020/1/5 0005 0:12
     * @Param 
     * @return 字符串
     **/
    @RequestMapping("/hello")
    public String SayHello() {
        return "Hello World!";
    }

    @RequestMapping("/exception")
    public String exception() {
        int a = 2 / 0;
        return String.valueOf(a);
    }


    

}
