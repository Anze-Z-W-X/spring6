package com.atguigu.spring6.iocxml.di;

public class Book {
    private String bname;
    private String author;

    private String others;

    public void setOthers(String others) {
        this.others = others;
    }

    public Book(){}

    public Book(String bname,String author,String others){
        this.bname=bname;
        this.author=author;
        this.others=others;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString(){
        return "bname="+bname+"\nauthor="+author+"\nothers="+others;
    }
}
