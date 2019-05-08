package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("show")
    public  String addtenant(){
        return "addtenant";
    }

    @RequestMapping("addHouse")
    public  String addHouse(){
        return "house";
    }

    @RequestMapping("queryHouse")
    public  String queryHouse(){
        return "queryHouse";
    }

}
