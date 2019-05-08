package com.jk.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "test";
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
    @RequestMapping("openlandlord")
    public String openlandlord(){
        return "openlandlord";
    }
    @RequestMapping("addlandlord")
    public String addlandlord(){
        return "addlandlord";
    }
}
