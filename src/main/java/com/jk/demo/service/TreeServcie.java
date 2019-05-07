package com.jk.demo.service;

import com.jk.demo.pojo.LoginBean;
import com.jk.demo.pojo.NavBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

public interface TreeServcie {

    List<NavBean> queryNav();

    HashMap<String, Object> LoginUserS(LoginBean loginBean, HttpServletRequest request);

    HashMap<String, Object> sendCode(String code , HttpSession session);

    HashMap<String, Object> noteLogin(String code, String account, HttpSession session);
}
