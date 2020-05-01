package edu.ayuan.ood.day06;

public class Person7 {
//    this 不能在static的方法下用
//    无参构造
    public Person7(){
//        以下是自己调用自己，不行❌
//        this();
//        以下是调用 public Person7(String name){这个构造器里 已经有this();还是等于调用自己，是不行的
//        this("name");

    }
    public Person7(int age){
//        this必须写在方法的第一行
//        不能自己调自己，不能出现构造器自己调用自己
        this.age = age;

    }

    public Person7(String name){
//        this()等于Person7()
//      this();等于    public Person7(){
        this();
        this.name = name;

    }

    public Person7(int age, String name) {
//        this.age  就是 int age;  age 是形参,加this是成员变量
//        this(1);调用的是public Person7(int age){ ，调用构造
        this(1);
        this.age = age;
        this.name = name;
    }

    //    以下名称叫：类成员变量
    int age;
    String name;

    public void setName(String name) {
//        加了this,清晰表示是调的当前类的方法
        this.name = name;

    }

    public void setName1(String name) {
//       this.setName(name) 就是调用setName的方法，等于  this.name = name;
        this.setName(name);
    }
    public void showInfo(){
        System.out.println("姓名："+this.name);
    }


}
