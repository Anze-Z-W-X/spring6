package com.atguigu.spring6.iocxml.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDAO {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserDAO userDAO = (UserDAOImpl)context.getBean("userDAO");
        userDAO.run();

        UserDAO userDAO1 = (PersonDAOImpl)context.getBean("personDAO");
        userDAO1.run();
    }
}
