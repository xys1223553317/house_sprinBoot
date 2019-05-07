package com.jk.demo.dao;

import com.jk.demo.pojo.JobBean;
import com.jk.demo.pojo.UserBean;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    //查询总条数
    @Select("select count(*) from t_user")
    int findUserTotal(UserBean userBean);

    List<UserBean> findUserPage(@Param("start") int start, @Param("rows")Integer rows, @Param("userBean")UserBean userBean);


    void delUser(Integer[] ids);

    UserBean findUserById(Integer id);

    void saveUser(UserBean userBean);

    void updateUser(@Param("id") Integer id,@Param("userBean")UserBean userBean);



    //查询职位总条数

    @Select("select count(*) from t_job")
    long findzhiweicount();

    @Select("select * from t_job Limit #{start},#{pageSize}")
    List<JobBean> findzhiwei(@Param("pageSize") Integer pageSize,@Param("start")Integer start);

    @Select("select * from t_job where pid =#{id}")
    JobBean findzhiweis(@Param("id")Integer id);

    void addzhiwei(JobBean jobBean);

    void updatezhiwei(JobBean jobBean);

    @Delete("delete from t_job where pid=#{id}")
    void delzhiwei(@Param("id")String id);
}
