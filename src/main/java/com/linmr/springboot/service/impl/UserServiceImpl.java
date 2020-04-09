package com.linmr.springboot.service.impl;

import com.linmr.springboot.entity.User;
import com.linmr.springboot.mapper.UserDao;
import com.linmr.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author linmr
 * @version 1.0
 * @date 2020-3-18  16:35
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public User login(String name, String pwd) {
        return userDao.login(name, pwd);
    }

    @Override
    public User find(Integer userId) {
        return userDao.find(userId);
    }

    @Override
    public List<User> getUserList() {
        return userDao.listUsers();
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
