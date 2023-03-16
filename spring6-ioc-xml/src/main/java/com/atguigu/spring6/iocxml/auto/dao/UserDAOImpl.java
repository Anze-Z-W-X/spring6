package com.atguigu.spring6.iocxml.auto.dao;

public class UserDAOImpl implements UserDAO{
    @Override
    public void addUserDAO() {
        System.out.println("UserDAO的方法执行了!");
    }
}
