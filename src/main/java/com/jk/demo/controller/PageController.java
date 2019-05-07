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

    @RequestMapping("findUserList")
    public String findUserList(){
        return "goodslist";
    }

    @RequestMapping("toUpdateUser")
    public String toUpdateUser() {
        return "updateUser";

    }

    @RequestMapping("toAddUser")
    public String toAddUser() {
        return "addUser";

    }


    @RequestMapping("findList")
    public String findList(){
        return "jobList";
    }

    @RequestMapping("zhifu")
    public String  zhifu(){
        return "zhifu";
    }
}
