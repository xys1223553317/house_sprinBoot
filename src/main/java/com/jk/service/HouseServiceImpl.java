package com.jk.service;

import com.jk.dao.HouseDao;
import com.jk.pojo.House1;
import com.jk.pojo.Tenant;
import com.jk.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class HouseServiceImpl implements HouseService{

    @Autowired
    private HouseDao houseDao;

    @Override
    public void saveTenant(Tenant tenant) {
        houseDao.saveTenant(tenant);
    }

    @Override
    public void saveHouse(House1 house) {
        houseDao.saveHouse(house);
    }

    @Override
    public ResultUtil findHouse(Integer page, Integer rows, House1 house) {
        ResultUtil resultUtil = new ResultUtil();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("house", house);
        //查询条数
        int count = houseDao.findUserTotal(hashMap);
        resultUtil.setTotal(count);
        //查询分页List
        hashMap.put("startIndex",(page-1)*rows);
        hashMap.put("endIndex", rows);
        List<House1> books =  houseDao.findUserPage(hashMap);
        resultUtil.setRows(books);
        return resultUtil;
    }
}
