package com.jk.demo.dao;

import com.jk.demo.pojo.Tenant;
import com.jk.demo.pojo.ZdType;
import com.jk.demo.pojo.ZfType;
import com.jk.demo.pojo.ZjType;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

public interface MoneyDao {

    int queryCount();

    List<Tenant> queryshouzhang(@Param("start") int start, @Param("rows") Integer rows);

    @Select("select t.*, zt.name as zdname,zk.name as zkname,zk.fhao as fhname from t_tenant t LEFT JOIN t_zdtype zt ON  t.zdtype =zt.id LEFT JOIN t_zhuke zk ON  t.houseid =zk.id where t.id= #{id}")
    HashMap<String, Object> queryshouzhangById(Integer id);

    void addshouzhiliushui(Tenant tenant);

    @Select("select * from t_zjtype")
    List<ZjType> findzjtype();

   @Select("select * from t_zftype")
    List<ZfType> findzftype();

    @Select("select * from t_zdtype")
    List<ZdType> findzdtype();

}
