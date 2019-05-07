package com.jk.demo.controller;

import com.jk.demo.pojo.LoginBean;
import com.jk.demo.pojo.NavBean;
import com.jk.demo.service.TreeServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("tree")
public class TreeConroller {

    @Autowired
    private TreeServcie treeServcie;

    @RequestMapping("queryNav")
    @ResponseBody
    public List<NavBean> queryNav(){

        return treeServcie.queryNav();
    }

    @RequestMapping("login")
    @ResponseBody
    public HashMap<String,Object> loginUser(LoginBean loginBean, HttpServletRequest request){
        return treeServcie.LoginUserS(loginBean,request);
    }


}
