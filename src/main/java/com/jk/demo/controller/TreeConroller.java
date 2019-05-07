package com.jk.demo.controller;

import com.jk.demo.pojo.NavBean;
import com.jk.demo.service.TreeServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tree")
public class TreeConroller {

    @Autowired
    private TreeServcie treeServcie;

    @RequestMapping("queryNav")
    @ResponseBody
    public List<NavBean> queryNav(){
        return treeServcie.queryNav();
    }


}
