package com.lwzyx.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/12/4.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String adminIndex(){
        return "home/index";
    }
}
