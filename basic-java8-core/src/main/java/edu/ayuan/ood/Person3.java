package edu.ayuan.ood;

import org.apache.logging.log4j.core.util.JsonUtils;

public class Person3 {
    /**
     * 方法1用数组的方式传递可变个数的参数
     *  //如果没有参数，就要定义一个空数组或者是 null
     * @param args
     */
    //我们能够打印的信息都有来源于方法的参数也就是形参的传递
//    public void printinfo(String name,int age) {
//   当给方法传递不同的参数的情况下，不知道要给方法传递多少个参数（姓名，性别，年龄，身份证号码）
//    可以通过定义一个数组的方式,可以用for进行迭代输出
//如果一个方法有多个形参，...可变参数需要写在所有形参的后面
//    用数组的方式来传递可变个数的参数
    public void printinfo(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);

        }
    }

    /**
     * 用java特有的...方式，来传递可变个数的参数，这种参数在使用时与数组的使用方式相同，可变参数
     * 声明方法：方法名（参数类型名...参数名）
     *...的形式，如果没有参数，可以不填
     * 可以传递零到多个参数
     * @param args
     */
//    使用时也是迭代打印
    public void printInfo1(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }
    //参数个数0--多个
    //如果一个方法有多个形参，...可变参数需要写在所有形参的后面

    /**
     * 参数个数0--多个
     * 如果一个方法有多个形参，...可变参数需要写在所有形参的后面
     *  public void test (int a , String b,int...i) {这样的放置方式是对的
     * @param a
     * @param b
     * @param i 可变参数 一个方法只有一个，并且需要放在形参的最后
     */
    public void test (int a , String b,int...i) {


    }
}