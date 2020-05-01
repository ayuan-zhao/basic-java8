package edu.ayuan.ood.day06;
//如果是使用同一个包下的类，import可以省略

import edu.ayuan.ood.day06.Person;

public class Test {
    public static void main(String[] args) {
//        对于同一个包下的使用同一个包下的类
//        Person p = new Person();
////      这样的情况，程序是对的，能执行，但是不符合正常逻辑
////        p.age = -100;
////        像这种情况，是把类的属性开放出来，让调用者随意使用，这样会有问题
////        p.printAge();
//        p.setAge(12);
//        p.printAge();

//public class Person4 {调用的是它
////    public Person4(){}默认的，不写也行
//        Person4 p4 =new Person4();
//        p4.getAge();
//        Person5 p5 = new Person5(2,"lisi");
//        p5.showInfo();

//        Person06 p6 = new Person06();
////        初始化的时候就赋值，这样后面就有默认的了
//        Person06 p6 = new Person06(12,"arya");
//        System.out.println(p6.age);
//        System.out.println(p6.name);
//
//        Point po = new Point (1,2,3);
//        po.setPoint(6,8,10);


//        overloading，
// new Person06(1);
// new Person06(1,true);



    Person8 p8 = new Person8();

    p8.setName("张三");
    p8.setAge(20);
    p8.setSex(0);
        System.out.println(p8.getName()+p8.getSex()+p8.getAge());
    }
}

//new对象的时候给不同属性赋不同的值
