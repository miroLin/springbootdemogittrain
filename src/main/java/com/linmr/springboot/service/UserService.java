package com.linmr.springboot.service;

import com.linmr.springboot.entity.User;

import java.util.List;

/**
 * @author linmr
 * @version 1.0
 * @date 2020-3-18  16:33
 */
public interface UserService {
    /**
     * 界面登入
     * @param name 用户名
     * @param pwd 密码
     * @return 用户
     */
    User login(String name,String pwd);

    /**
     * 根据用户ID查找用户
     * @param userId 用户ID
     * @return 用户
     */
    User find(Integer userId);
    /**
     * 获取用户列表
     */
    List<User> getUserList();

    int addUser(User user);
}
