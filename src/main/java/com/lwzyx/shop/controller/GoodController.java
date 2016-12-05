package com.lwzyx.shop.controller;

import com.lwzyx.shop.model.Good;
import com.lwzyx.shop.service.IGoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/12/3.
 */
@Controller
@RequestMapping("/good")
public class GoodController {
    private IGoodService goodService;
    @Resource
    public void setGoodService(IGoodService goodService) {
        this.goodService = goodService;
    }
    @RequestMapping(value = "/list",params = "json")
    @ResponseBody
    public List<Good> list(Model model,String param){
        System.out.println("11111111");
        List<Good> goods = goodService.findGoods();
        System.out.println("2222"+goods);
        model.addAttribute("goods",goods);
        return goods;
    }

}
