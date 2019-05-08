package com.jk.demo.service;


import com.jk.demo.pojo.JobBean;
import com.jk.demo.pojo.UserBean;

import java.util.HashMap;

public interface UserService {
    HashMap<String, Object> findUserList(Integer page, Integer rows, UserBean userBean);

    void delUser(Integer[] ids);

    UserBean findUserById(Integer id);

    void saveUser(UserBean userBean);

    void updateUser(Integer id, UserBean userBean);


    //职位分页查询

    HashMap<String, Object> findzhiwei(Integer pageSize, Integer start);

    JobBean findzhiweis(Integer id);

    void updatezhiwei(JobBean jobBean);

    void addzhiwei(JobBean jobBean);

    void delzhiwei(String id);
}
