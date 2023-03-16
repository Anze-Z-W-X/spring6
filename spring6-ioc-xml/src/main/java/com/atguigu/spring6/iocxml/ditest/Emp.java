package com.atguigu.spring6.iocxml.ditest;

import java.util.Arrays;

public class Emp {
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    private String ename;
    private Integer age;

    private String[] loves;
    public void work(){
        System.out.println(ename+"emp work..."+age+"\n"+Arrays.toString(loves));
        dept.info();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
