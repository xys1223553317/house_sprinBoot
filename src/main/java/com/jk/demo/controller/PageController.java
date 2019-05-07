package com.jk.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("test")

    public String test(){

        return "test";
    }
    @RequestMapping("show")
    public String show(){
        return "show";
    }

    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }
}
