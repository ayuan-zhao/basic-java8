package edu.ayuan.ood;

import org.apache.logging.log4j.core.util.JsonUtils;

public class Test4 {
    //    static    的方法只能访问static的变量；
    static int t = 0;

    public static void main(String[] args) {
        Test4 t4 = new Test4();
        t4.mOL(2);
        t4.mOL(2, 3);
        t4.mOL("OVERLOADING");


        t4.max(0, 1);
        t4.max(0.2, 1.9);
        t4.max(1.2, 1.6, 1.8);
//        System.out.println(t);
//
//        //实例化person类=创建person对象
//        int i = 0;
//        String s = "";
////        Person person;//Person类，声明一个person类型的，变量名叫person
//       // new Person();// 就是实例化Person类，new Person,P要大写，表示类，实例化
//        Person person = new Person();//声明一个person类型的，变量名叫person，实例化Person类并且给person赋值，赋值的值就是当前的实例
//        person.name="张三";//给person对象的name属性赋值（不是变量了）
//        person.showName();//对象的方法的调用
//        //实例化person对象之后，给person.name赋值"张三,然后打印
//        //person.getName();//有返回值的方法，在调用之后就会有一个值，这个值就是方法中return的那部分
//        int a = person.getAge();
//        System.out.println(a);//打印的就是这个方法的return值，int默认是0
//
//        person.age= 11;//给person对象的age属性赋值
//        int b = person.getAge();
//        System.out.println(b);
//        //有返回值的方法可以用变量来接受，
//        // 有返回值，这个代表一个值，代表return
//        //调用了Person类里的方法


//        实例化 一个 animal的对象，类名？
        Animal ani = new Animal();
        //要看之前定义时的参数
        ani.eat("mouse");

        ani.move("fly");
//        未来可能会学更复杂的类,我们会给这类创建对象，并且使用对象，对于对象的使用无外乎就两个地方
//        1.操作类的变量
//        2，调用类的方法
//
        Person1 p = new Person1();
//
//        p.name;这样可以，因为name是public的
//        p.age;这样不行，因为age是private的

//        类有一个，通过类实例化出来的对象，可以有多个，每个对象都是独立的，互不干扰

//        Person p1 = new Person();
//        Person p2 = new Person();
//        p1 .name ="zhangsan";
//        p2 .name = "lisi";
//        p1.showName();
//        p2.showName();
//
//        Student stu = new Student();
//        stu.name = "小明";
//        stu.age = 12;
//        stu.course = "语数外";
//        stu.interest = "唱跳rap";
//        stu.showInfo();

//        类是模版，对象是具体的人

//   方法的结果返回给调用者，由调用者处理
//    方法里可以调用方法，但是不能定义方法
//        同一个类中，所有的方法可以直接互相调用，不用new去实例化对象
//    Test4 t4 = new Test4();
////    return 的
//    int area = t4.getArea(2, 3);
//     System.out.println(area);
//}
//
//    public int getArea(int x, int y) {
////        return的值，赋给了area
//        return x * y;

//        把类实例化为一个对象
        Student s = new Student();
        s.showInfo();
//        改写：匿名对象
//        new Student().showInfo();
//        不给对象赋予变量,new的对象直接用的方式，就叫做匿名
//        new Person().shout();

////任何的类都可以作为一个参数来交给方法
//        public void move(String moveType,Student stu) {
////        方法内的局部变量int c =0;局部变量必须有初始化值
//            int c= 0;
////        int k;这样的变量用不了，不能在局部使用
//            System.out.println("此种动物移动方式是：" + moveType);


////        name是如何访问的 ，需要先new 一个Person2的对象，然后通过对象去访问对象里的一个属性
//        Person2 p2  = new Person2();
//        p2.name ="lucy";
//        p2.age = 11;
//        p2.sex =1;
//        p2.study();
////        p2.addAge(2);
////        或改写为
//        int a = p2.addAge(2);
////        执行了 age+=i=11+2=13//a=13,p.age=13
//        System.out.println("a"+a +"p2.age"+p2.age);

        double area = new Circle().area(2);
        System.out.println("半径为2的圆的面积是：" + area);
    }

//    写类就是写属性和方法
//    在不同的类中的访问机制，先要创建要访问类的对象，再用对象访问类中定义的成员
//    先new一个person2的对象，再访问其中的属性
//    Person p2 = new Person();
//      p1 .name ="zhangsan";


//   1.写类就是写属性和方法， 成员变量，和方法，
//    2.类的实例化，即创建类的对象，比如：Person p2 = new Person();
//   3. 通过"对象.属性"，"对象.方法"执行

//    先要new一个test的方法,写在main方法里
//public static void main(String[] args) {
//    Test4 t4 = new Test4();
//    t4.mOL(2);
//    t4.mOL(2,3);
//    t4.mOL("OVERLOADING");

    //没有返回值就可以设计成void的
    public void mOL(int i) {
        System.out.println(i * i * i);

    }

    public void mOL(int x, int y) {

    }

    public void mOL(String s) {
        System.out.println(s);

    }

    public void max(int x, int y) {
        if (x > y) {
            System.out.println("max number is" + x);
        } else {
            System.out.println("max number is" + y);
        }

    }

    public void max(double x, double y) {
        double res = 0;
        if (x > y) {
            res = x;
        } else {
            res = y;
        }
        System.out.println("max number is" + res);
    }

    public void max(double x, double y, double z) {
        double res = 0;
        res = (x > y) ? (x > z ? x : z) : (y > z ? y : z);

    }
}

