package com.linmr.springboot.mapper;

import com.linmr.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author linmr
 * @version 1.0
 * @date 2020-3-18  16:18
 */
@Mapper
@Repository
public interface UserDao {

    /**
     * 用户密码登入
     * @param username 用户名
     * @param password 密码
     * @return 登入界面
     */
    @Select("select * from user where username = #{username} and password = #{password}")
    User login(@Param("username") String username, @Param("password") String password);

    /**
     * 根据用户id查找用户
     * @param id 用户ID
     * @return 用户
     */
    @Select("select * from user where id = #{id}")
    User find(Integer id);

    /**
     * 检索所有用户
     * @return 用户列表
     */
    List<User> listUsers();
}
