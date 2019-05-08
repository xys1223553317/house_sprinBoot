package com.jk.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @RequestMapping("toshouzhang")
    public String toshouzhang(){
        return "daishou";
    }

    @RequestMapping("tozhizhang")
    public String tozhizhang(){
        return "daizhi";
    }

    //代收更多
    @RequestMapping("togengduo")
    public String togengduo(){
        return "gengduo";
    }
    //流水更多
    @RequestMapping("toliushuigengduo")
    public String toliushuigengduo(){
        return "liushuigengduo";
    }
    @RequestMapping("shouzhiliushui")
    public String shouzhiliushui(){
        return "shouzhiliushui";
    }

    @RequestMapping("toaddshouzhiliushui")
    public String toaddshouzhiliushui(){
        return "addshouzhiliushui";
    }

    @RequestMapping("toquerenshoukuan")
    public String toquerenshoukuan(Integer id, Model model){
        model.addAttribute("id",id);
        return "querenshoukuan";
    }
}
