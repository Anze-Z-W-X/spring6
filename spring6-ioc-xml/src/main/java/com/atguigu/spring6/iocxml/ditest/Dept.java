package com.atguigu.spring6.iocxml.ditest;

import java.util.List;

public class Dept {
    private String dnmae;

    private List<Emp> empList;

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public void setDnmae(String dnmae) {
        this.dnmae = dnmae;
    }

    public void info(){
        System.out.println("部门名称:"+dnmae);
        for(Emp emp:empList){
            System.out.println(emp.getEname());
        }
    }
}
