package com.jk.demo.controller;

import com.jk.demo.pojo.Tenant;
import com.jk.demo.pojo.ZdType;
import com.jk.demo.pojo.ZfType;
import com.jk.demo.pojo.ZjType;
import com.jk.demo.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("money")
public class MoneyController {

    @Autowired
    private MoneyService moneyService;

    @RequestMapping("queryshouzhang")
    @ResponseBody
    public HashMap<String, Object> queryshouzhang(Integer page, Integer rows) {
        return moneyService.queryshouzhang(page, rows);
    }

    @RequestMapping("queryshouzhangById")
    @ResponseBody
    public HashMap<String, Object> queryshouzhangById(Integer id) {
        return moneyService.queryshouzhangById(id);
    }

    @RequestMapping("addshouzhiliushui")
    @ResponseBody
    public Boolean addshouzhiliushui(Tenant tenant) {
        try {
            moneyService.addshouzhiliushui(tenant);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //初始化资金
    @RequestMapping("findzjtype")
    @ResponseBody
    public List<ZjType> findzjtype(){
        List<ZjType> queryZj = moneyService.findzjtype();
        return queryZj;
    }

   //初始化资金
    @RequestMapping("findzftype")
    @ResponseBody
    public List<ZfType> findzftype(){
        List<ZfType> queryZf = moneyService.findzftype();
        return queryZf;
    }
    //初始化资金
    @RequestMapping("findzdtype")
    @ResponseBody
    public List<ZdType> findzdtype(){
        List<ZdType> queryZd = moneyService.findzdtype();
        return queryZd;
    }
}
