package com.jk.demo.service.impl;


import com.alibaba.dubbo.config.annotation.Reference;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jk.demo.pojo.LoginBean;
import com.jk.demo.pojo.NavBean;
import com.jk.demo.service.TreeServcie;
import com.jk.demo.service.TreeService1;
import com.jk.demo.utlis.ConstanConf;
import com.jk.demo.utlis.HttpClientUtil;
import com.jk.demo.utlis.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Service
public class TreeServcieImpl implements TreeServcie {
    @Reference
    private TreeService1 treeService1;
    @Autowired
    private RedisTemplate redisTemplate;
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

    @Override
    public HashMap<String, Object> sendCode(HttpSession session,String account) {
        HashMap<String, Object> result = new HashMap<>();
        HashMap<String, Object> params = new HashMap<>();
       redisTemplate.opsForValue().set(ConstanConf.Time,account+UUID.randomUUID().toString(),1,TimeUnit.DAYS);
        Object days =  redisTemplate.opsForValue().get(ConstanConf.Time);
        if (days.toString().length()>3){
            result.put("code", 3);
            result.put("msg","请在明天发送");
            return result;
        }
        Object object = redisTemplate.opsForValue().get(ConstanConf.SMS_LOHIN_CODE+"sss");
        if (object!=null) {
            result.put("code", 2);
            result.put("msg","请在一分钟后发送");
            return result;
        }
        params.put("accountSid",ConstanConf.ACCOUNTSID);
        params.put("to",account);
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
       params.put("timestamp", timestamp);
        String sig = Md5Util.getMd532(ConstanConf.ACCOUNTSID+ConstanConf.AUTH_TOKEN+timestamp);
        params.put("sig", sig);
        params.put("templateid",ConstanConf.TEMPLATEID);
        Integer random=(int) (Math.random()*899999+100000);
        System.out.println(random);
        redisTemplate.opsForValue().set(ConstanConf.SMS_LOHIN_CODE+"sss",random,ConstanConf.SMS_CODE_TIME, TimeUnit.MINUTES);
        session.setAttribute("sss", random);
        params.put("param", random);
        String post = HttpClientUtil.post(ConstanConf.SMS_URL,params);
        JSONObject jsonObject = JSON.parseObject(post);
        String respCode = jsonObject.getString("respCode");
        System.out.println(respCode);
        if (ConstanConf.SMS_SUCCESS.equals(respCode)) {
            redisTemplate.opsForValue().set(ConstanConf.SMS_LOHIN_Lock+"sss", "1",ConstanConf.SMS_CODE_TIME_LOCKE,TimeUnit.MINUTES);
            result.put("code", 0);
            result.put("msg","发送成功");
            return result;
        }else {
            result.put("code", 1);
            result.put("msg","发送失败");
            return result;
        }

    }

    @Override
    public HashMap<String, Object> noteLogin(String code, String account, HttpSession session) {
        Object sss = session.getAttribute("sss");
        redisTemplate.opsForValue().set(sss,sss);
        HashMap<String, Object> stringObjectHashMap = treeService1.noteLogin(code, account);
        session.setAttribute("user",stringObjectHashMap);
        return stringObjectHashMap;
    }
}
