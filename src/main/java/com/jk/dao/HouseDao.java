package com.jk.dao;

import com.jk.pojo.House1;
import com.jk.pojo.Tenant;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

public interface HouseDao {
    @Insert("Insert into tenant_house(tenantName,phone,idName,urgencyPhone,urPhone) values(#{tenantName},#{phone},#{idName},#{urgencyPhone},#{urPhone})")
    void saveTenant(Tenant tenant);

    @Insert("Insert into c_house(name,tese,staut,price,img,ctName,car,metro) values(#{name},#{tese},#{staut},#{price},#{img},#{ctName},#{car},#{metro})")
    void saveHouse(House1 house);

    @Select("select count(1) from c_house ")
    int findUserTotal(HashMap<String, Object> hashMap);


    List<House1> findUserPage(HashMap<String, Object> hashMap);
}
