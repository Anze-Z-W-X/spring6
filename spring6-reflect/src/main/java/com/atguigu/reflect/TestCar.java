package com.atguigu.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestCar {
    //1.获取Class 对象的方式
    @Test
    public void test1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.类名.class
        Class clazz1=Car.class;
        //2.对象.getClass()
        Class clazz2 = new Car().getClass();
        //3.Class.forname("全路径")
        Class clazz3 = Class.forName("com.atguigu.reflect.Car");

        //实例化
        Car car = (Car)clazz3.getDeclaredConstructor().newInstance();
        System.out.println(car);
    }
    //2.获取构造方法
        @Test
        public void test2(){
            Class clazz = Car.class;
            Constructor[] constructors = clazz.getConstructors();
            for (Constructor c:constructors){
                System.out.println("参数名称:"+c.getName()+"\n参数数量:"+c.getParameterCount());
            }
        }
    //3.获取属性

    //4.通过反射获取方法
}
