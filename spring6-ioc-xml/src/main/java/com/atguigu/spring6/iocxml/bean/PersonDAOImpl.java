package com.atguigu.spring6.iocxml.bean;

public class PersonDAOImpl implements UserDAO{
    @Override
    public void run() {
        System.out.println("Person run.....");
    }
}
