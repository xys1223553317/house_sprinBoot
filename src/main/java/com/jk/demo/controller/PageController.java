package com.jk.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("page")
public class PageController {


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
