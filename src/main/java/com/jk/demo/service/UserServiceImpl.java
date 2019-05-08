package com.jk.demo.service;

import com.jk.demo.dao.UserDao;

import com.jk.demo.pojo.JobBean;
import com.jk.demo.pojo.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public HashMap<String, Object> findUserList(Integer page, Integer rows,UserBean userBean) {
        HashMap<String, Object> hashMap = new HashMap<>();
        //查询总条数
        int total = userDao.findUserTotal(userBean);
        //分页
        int start = (page-1)*rows;
        List<UserBean> list = userDao.findUserPage(start,rows,userBean);
        hashMap.put("total", total);
        hashMap.put("rows", list);
        return hashMap;
    }

    @Override
    public void delUser(Integer[] ids) {
        userDao.delUser(ids);
    }

    @Override
    public UserBean findUserById(Integer id) {
        return userDao.findUserById(id);
    }

    @Override
    public void saveUser(UserBean userBean) {
        userDao.saveUser(userBean);
    }



    @Override
    public void updateUser(Integer id, UserBean userBean) {
     userDao.updateUser(id,userBean);
    }



    //职位分页查询
    @Override
    public HashMap<String, Object> findzhiwei(Integer pageSize, Integer start) {
        HashMap<String, Object>map=new HashMap();
        long count=userDao.findzhiweicount();
        List<JobBean>list=userDao.findzhiwei(pageSize,start);
        for (JobBean postbean : list) {
            postbean.setPdate(new Date());
        }

        map.put("total",count);
        map.put("rows",list);
        return map;
    }

    @Override
    public JobBean findzhiweis(Integer id) {

        return userDao.findzhiweis(id);
    }

    @Override
    public void addzhiwei(JobBean jobBean) {
        userDao.addzhiwei(jobBean);
    }

    @Override
    public void updatezhiwei(JobBean jobBean) {
        userDao.updatezhiwei(jobBean);
    }

    @Override
    public void delzhiwei(String id) {
        userDao.delzhiwei(id);
    }

}
