package com.jk.demo.service.impl;

import com.jk.demo.pojo.LandlordBean;
import com.jk.demo.pojo.TenantBean;
import com.jk.demo.dao.TenantDao;
import com.jk.demo.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class TenantServiceImpl implements TenantService {
    @Autowired
    TenantDao tenantDao;
    @Override
    public HashMap<String, Object> findtenantlist(Integer page, Integer rows, TenantBean tenantBean) {
        HashMap<String, Object> hashMap = new HashMap<>();
        int total=tenantDao.findtenantcount(tenantBean);
        int start=(page-1)*rows;
        List<TenantBean> findtenant = tenantDao.findtenantlist(start,rows,tenantBean);
        hashMap.put("total", total);
        hashMap.put("rows", findtenant);
        return hashMap;
    }

    @Override
    public HashMap<String, Object> findlandlordlist(Integer page, Integer rows, LandlordBean landlordBean) {
        HashMap<String, Object> hashMap = new HashMap<>();
        int total=tenantDao.findlandlordcount(landlordBean);
        int start=(page-1)*rows;
        List<LandlordBean> findlandlord = tenantDao.findlandlordlist(start,rows,landlordBean);
        hashMap.put("total", total);
        hashMap.put("rows", findlandlord);
        return hashMap;
    }

    @Override
    public TenantBean cktenant(Integer id) {
        return tenantDao.cktenant(id);
    }

    @Override
    public LandlordBean cklandlord(Integer id) {
        return tenantDao.cklandlord(id);
    }

    @Override
    public LandlordBean huixianlandlord(Integer id) {
        return tenantDao.huixianlandlord(id);
    }

    @Override
    public boolean updatelandlordlist(LandlordBean landlordBean) {
        return tenantDao.updatelandlordlist(landlordBean);
    }
}
