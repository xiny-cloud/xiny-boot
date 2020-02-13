package com.xinycloud.modules.demo.controller;

import com.xinycloud.modules.demo.entity.User;
import com.xinycloud.modules.demo.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: xiny
 * @Date: 2020/1/5 0005 03:36
 * @Description:
 */
@RestController
public class HelloController {

    @Resource
    private UserMapper userMapper;

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
    @RequestMapping("/getUser")
    public User getUserById(String id) {
        return userMapper.getById(id);
    }


    

}
