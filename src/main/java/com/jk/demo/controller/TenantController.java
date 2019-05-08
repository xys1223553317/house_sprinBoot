package com.jk.demo.controller;

import com.jk.demo.pojo.LandlordBean;
import com.jk.demo.pojo.TenantBean;
import com.jk.demo.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("tenant")
public class TenantController {
    @Autowired
    TenantService tenantService;
    //租客查询
    @RequestMapping("findtenantlist")
    @ResponseBody
    public HashMap<String,Object> findtenantlist(Integer page, Integer rows, TenantBean tenantBean){
        return tenantService.findtenantlist(page,rows,tenantBean);
    }
    //房东查询
    @RequestMapping("findlandlordlist")
    @ResponseBody
    public HashMap<String,Object> findlandlordlist(Integer page, Integer rows,LandlordBean landlordBean){
       return tenantService.findlandlordlist(page,rows,landlordBean);
    }
}
