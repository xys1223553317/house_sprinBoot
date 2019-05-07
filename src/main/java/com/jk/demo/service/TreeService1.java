package com.jk.demo.service;

import com.jk.demo.pojo.LoginBean;
import com.jk.demo.pojo.NavBean;

import java.util.HashMap;
import java.util.List;

public interface TreeService1 {

    List<NavBean> queryNav();

    HashMap<String,Object> LoginUser(LoginBean loginBean);
}
