package com.atguigu.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = (Book) context.getBean("book");
        System.out.println(book.toString());
    }
}
