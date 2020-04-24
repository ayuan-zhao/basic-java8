package edu.ayuan.ood;

public class Person1 {
//    局部变量只能在局部使用
//    public String name,直接初始化的值是null
    public String name ="zhangsan";
//    可以在本类的方法内使用，不能做类的外部使用
    private int age;

//可以在外部和内部使用
    public void showAge(){
        System.out.println(age);
    }

    //该属性只能由该类的方法访问
//    private
    //该属性可以被该类以外的方法访问
//    public
//    修饰符，用来修饰变量，用来指明变量是一个公有的还是私有的，私有的类变量不能通过  对象.属性  的方式调用

    private int age1;//声明private 变量age
    public String name1 = "Lila";//声明public变量name



    //在方法体外，类体内的声明的变量称为成员变量。
    //在方法体内部声明的变量称为局部变量。

//    实例变量，（不以static修饰）在实例化之后才能使用的，在类实例化为对象之后，才可以使用


//    类变量（以static修饰）
//可以直接使用，不需要类实例化成对象就可以使用
//直接就可以通过类名.属性的方式直接调用
    public static String sex = "男";


    //
}
