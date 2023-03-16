package com.atguigu.spring6.iocxml.auto.service;

import com.atguigu.spring6.iocxml.auto.dao.UserDAO;

public class UserServiceImpl implements UserService{

    UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void addUserService() {
        System.out.println("UserService方法执行了!");
        userDAO.addUserDAO();
    }
}
