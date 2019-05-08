package com.jk.demo.service;

import com.jk.demo.pojo.LandlordBean;
import com.jk.demo.pojo.TenantBean;

import java.util.HashMap;

public interface TenantService {

    HashMap<String, Object> findtenantlist(Integer page, Integer rows, TenantBean tenantBean);

    HashMap<String, Object> findlandlordlist(Integer page, Integer rows, LandlordBean landlordBean);

    TenantBean cktenant(Integer id);

    LandlordBean cklandlord(Integer id);
}
