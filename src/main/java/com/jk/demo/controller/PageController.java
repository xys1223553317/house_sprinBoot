package com.jk.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("show")
    public String show(){
        return "show";
    }

    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("phoneLogin")
    public String phoneLogin(){
        return "phonelogin";
    }
    @RequestMapping("totenant")
    public String totenant(){
        return "tenantlist";
    }
    @RequestMapping("tolandlord")
    public String tolandlord(){
        return "landlord";
    }
    @RequestMapping("opentenant")
    public String opentenant(){
        return "opentenant";
    }
}
