package com.jk.demo.dao;

import com.jk.demo.pojo.LandlordBean;
import com.jk.demo.pojo.TenantBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TenantDao {
    int findtenantcount(@Param("tenantBean")TenantBean tenantBean);

    List<TenantBean> findtenantlist(@Param("start")int start,@Param("rows") Integer rows,@Param("tenantBean")TenantBean tenantBean);

    int findlandlordcount(@Param("landlordBean")LandlordBean landlordBean);

    List<LandlordBean> findlandlordlist(@Param("start")int start,@Param("rows")Integer rows,@Param("landlordBean")LandlordBean landlordBean);

}
