package com.atguigu.spring6;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    private Logger logger = LoggerFactory.getLogger(TestUser.class);
    @Test
    public void test(){
        //加载spring的配置文件,进行对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("user");
        System.out.println("1"+user);
        System.out.print("2");
        user.add();

        //手动写日志
        logger.info("### 执行调用成功了!");
    }
}
