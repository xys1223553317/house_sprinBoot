package com.jk.controller;

import com.jk.pojo.House1;
import com.jk.pojo.Tenant;
import com.jk.service.HouseService;
import com.jk.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
public class HouseController {

    @Autowired
    private HouseService houseService;

    @RequestMapping("saveTenant")
    public boolean saveTenant(Tenant tenant) {
        try {
            houseService.saveTenant(tenant);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @RequestMapping("saveHouse")
    public boolean saveHouse(House1 house) {
        try {
            houseService.saveHouse(house);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @RequestMapping("findHouse")
    public ResultUtil findHouse(Integer page, Integer rows, House1 house){
        return houseService.findHouse(page,rows,house);
    }


}
