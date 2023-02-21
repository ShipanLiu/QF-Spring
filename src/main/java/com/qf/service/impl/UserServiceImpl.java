package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao myUserDao;

//    至于你如何 要 为上面的myUserDao 赋值,  因为 Spring 用的是 set 方法， 所以 你需要 定义一个set 方法，
    // 千万 要注意 method 的 命名 ：   set + 属性名  （驼峰）
    public void setMyUserDao(UserDao userDao) {
        this.myUserDao = userDao;
    }


    @Override
    public void findUserById() {
        System.out.println("UserServiceImpl is called");

        myUserDao.findUserById();
    }
}
