package com.jk.demo.service;


import com.alibaba.dubbo.config.annotation.Reference;

import com.jk.demo.pojo.LoginBean;
import com.jk.demo.pojo.NavBean;
import org.springframework.stereotype.Service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Service
public class TreeServcieImpl implements TreeServcie {
    @Reference
    private TreeService1 treeService1;


    @Override
    public List<NavBean> queryNav() {
        return treeService1.queryNav();
    }

    @Override
    public HashMap<String, Object> LoginUserS(LoginBean loginBean, HttpServletRequest request) {
        HashMap<String, Object> stringObjectHashMap = treeService1.LoginUser(loginBean);
        HttpSession session = request.getSession();
        session.setAttribute("user",stringObjectHashMap);
        System.out.println(session);
        return stringObjectHashMap;
    }
}
