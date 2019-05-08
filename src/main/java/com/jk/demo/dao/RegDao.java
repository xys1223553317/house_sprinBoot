package com.jk.demo.dao;

import com.jk.demo.pojo.LoginBean;

public interface RegDao {
    Boolean saveUser(LoginBean loginBean);

    int findCount(String account);
}
