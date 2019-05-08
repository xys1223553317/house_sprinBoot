package com.jk.demo.service;



import com.jk.demo.dao.MoneyDao;
import com.jk.demo.pojo.Tenant;
import com.jk.demo.pojo.ZdType;
import com.jk.demo.pojo.ZfType;
import com.jk.demo.pojo.ZjType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    private MoneyDao moneyDao;

    //查看收账支账
    @Override
    public HashMap<String, Object> queryshouzhang(Integer page, Integer rows,String fhorfkf,Integer fhorfkfId) {
        HashMap<String, Object> hashMap = new HashMap<>();

        int total=moneyDao.queryCount(fhorfkf,fhorfkfId);
        int start=(page-1)*rows;
        List<Tenant> queryGoods = moneyDao.queryshouzhang(start,rows,fhorfkf,fhorfkfId);
        hashMap.put("total", total);
        hashMap.put("rows", queryGoods);
        return hashMap;
    }

   //查看收支流水
    @Override
    public HashMap<String, Object> queryshouzhiliushui(Integer page, Integer rows,Tenant tenant) {
        HashMap<String, Object> hashMap = new HashMap<>();

        int total=moneyDao.queryliushuiCount(tenant);
        int start=(page-1)*rows;
        List<Tenant> queryGoods = moneyDao.queryshouzhiliushui(start,rows,tenant);
        hashMap.put("total", total);
        hashMap.put("rows", queryGoods);
        return hashMap;
    }
    @Override
    public HashMap<String, Object> queryshouzhangById(Integer id) {

        return moneyDao.queryshouzhangById(id);
    }

    @Override
    public HashMap<String, Object> queryliushuiById(Integer id) {
        return moneyDao.queryliushuiById(id);
    }



    @Override
    public void addshouzhiliushui(Tenant tenant) {
        moneyDao.addshouzhiliushui(tenant);
    }

    @Override
    public List<ZjType> findzjtype() {
        return moneyDao.findzjtype();
    }

    @Override
    public List<ZfType> findzftype() {
        return moneyDao.findzftype();
    }

    @Override
    public List<ZdType> findzdtype() {
        return moneyDao.findzdtype();
    }



}
