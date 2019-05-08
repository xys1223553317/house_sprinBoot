package com.jk.demo.controller;


import com.jk.demo.pojo.JobBean;
import com.jk.demo.pojo.UserBean;
import com.jk.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;

@Controller

public class UserController {

    @Autowired
    UserService userService;

    //商品查询展示
    @RequestMapping("findUserList")
    @ResponseBody
    public HashMap<String, Object> findUserList(Integer page, Integer rows, UserBean userBean) {
        return userService.findUserList(page, rows,userBean);
    }

    //删除
    @RequestMapping("delUser")
    @ResponseBody
    public Boolean delUser(Integer[] ids) {
        try {
            userService.delUser(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //修改回显

    @RequestMapping("findUserById")
    @ResponseBody
    public UserBean findUserById(Integer id){
        UserBean bean = userService.findUserById(id);
        return bean;
    }

    //新增
    @RequestMapping("saveUser")
    @ResponseBody
    public void saveUser(UserBean userBean){
        userService.saveUser(userBean);
    }


    //修改
    @RequestMapping("updateUser")
    @ResponseBody
    public void updateUser(Integer id,UserBean userBean){
        userService.updateUser(id,userBean);

    }




    //职位查询展示



    @RequestMapping("findzhiwei")
    @ResponseBody
    public HashMap<String,Object> findzhiwei(Integer pageSize,Integer start){

        HashMap<String,Object> map= userService.findzhiwei(pageSize,start);

        return map;
    }

    @RequestMapping("findzhiweis")
    public String  findzhiweis(Integer id, Model model){
        JobBean jobBean=  userService.findzhiweis(id);
        model.addAttribute("c",jobBean);
        return "zhifu";
    }

    @RequestMapping("addzhiwei")
    @ResponseBody
    public void addzhiwei(JobBean jobBean){
        if(jobBean.getPid()!=""){
            userService.updatezhiwei(jobBean);

        }else{
            jobBean.setPdate(new Date());
            userService.addzhiwei(jobBean);
        }
    }
    @RequestMapping("delzhiwei")
    @ResponseBody
    public void delzhiwei(String id){
        userService.delzhiwei(id);
    }
}
