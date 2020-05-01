package edu.ayuan.ood.day06;

public class Person5 {
//    以下是构造,方法体里

    /**
     * 如果写明了构造，就会用你自己写的，而不是默认的
     */
//    public Person5(){
//        age = 1;
//        name ="张三";
//       test里new，是调用构造方法的过程Person5 p5 = new Person5(2,"lisi");写在test里
//    Person5 p5 = new Person5(2, "lisi");


    public Person5(int a, String n) {
        age = a;
        name = n;
    }

    public int age;
    public String name;
    public void showInfo(){
        System.out.println(age);
        System.out.println(name);
    }
}
