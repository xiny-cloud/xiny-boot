package com.xinycloud.modules.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: xiny
 * @Date: 2020/1/5 0005 03:36
 * @Description:
 */
@Controller
public class HtmlController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("name","Xiny");
        return "index";
    }
}
