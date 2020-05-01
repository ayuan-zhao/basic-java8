package edu.ayuan.ood.day06;

public class Person06 {
    //    两个形参，赋值给 age和name
    public Person06(int a, String n) {
//         public Person06() {
//        age = 18;
        age = a;
//        name = "ayuan";
        name = n;
    }

    public int age;
    public String name;

//    构造器重载,方便调用，创建出不同需要的对象，提供了了多个模版

    public Person06(int a) {

    }

    public Person06(int a, boolean b) {

    }


}

