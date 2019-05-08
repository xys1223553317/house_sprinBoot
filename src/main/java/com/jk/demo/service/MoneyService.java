package com.jk.demo.service;


import com.jk.demo.pojo.Tenant;
import com.jk.demo.pojo.ZdType;
import com.jk.demo.pojo.ZfType;
import com.jk.demo.pojo.ZjType;

import java.util.HashMap;
import java.util.List;

public interface MoneyService {

    HashMap<String, Object> queryshouzhang(Integer page, Integer rows);


    HashMap<String, Object> queryshouzhangById(Integer id);

   void addshouzhiliushui(Tenant tenant);

    List<ZjType> findzjtype();

   List<ZfType> findzftype();

    List<ZdType> findzdtype();
}
