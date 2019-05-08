package com.jk.service;

import com.jk.pojo.House1;
import com.jk.pojo.Tenant;
import com.jk.util.ResultUtil;


public interface HouseService {
    void saveTenant(Tenant tenant);

    void saveHouse(House1 house);

    ResultUtil findHouse(Integer page, Integer rows, House1 house);
}
