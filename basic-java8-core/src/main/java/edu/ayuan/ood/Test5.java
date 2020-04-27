package edu.ayuan.ood;

public class Test5 {
    public static void main(String[] args) {
        Person3 p3 = new Person3();
        String[] ss = new String[]{"zhangsan", "11", "male"};
        p3.printinfo(ss);

//        输出值
//        zhangsan
//        11
//        male
        String[] ss1 = new String[]{"北京市xxx", "13333", "88888"};
        p3.printinfo(ss1);

//        方法二：
//        用java特有的...方式，来传递可变个数的参数，这种参数在使用时与数组的使用方式相同
//        public void printInfo1(String...args){
//            for (int i = 0; i <args.length ; i++) {
//                System.out.println(args[i]);
//            }
        p3.printInfo1("lisi", "23", "male");
        //定义一个数组info1，把数据传到数组info里
        String[] ss2 = new String[]{"北京市xxx", "13333", "88888"};
        p3.printInfo1(ss2);
        //可以什么也不填
        p3.printInfo1();
        //就算什么都不填也得填一个null，代表空
        //用数组的方式，如果没有参数，就要定义一个空数组或者是 null
        //...的形式，如果没有参数，可以不填
        p3.printinfo(null);
        /*实参：传进来的值（ss2），这个是实参
         String[] ss2 = new String[]{"北京市xxx", "13333", "88888"};
        p3.printInfo1(ss2);
        形参：方法定义里的形式参数
        public void test (int a , String b,int...i)

         */


    /*方法的参数传递
    java里方法的参数传递方式只有一种：值传递。即将实际参数值的副本（复制品）传入方法内，而参数本身不受影响


    JVM内存——引用对象
    栈：stack
    基础数据类型：int,char,byte,float...
    对象的引用
    （对象的地址）


    堆：heap
    所有的对象（包括自己定义的对象和字符串对象）

    方法区：method
    所有class和static变量

    引用对象：
    Person p = new Person ()
    真正p所代表的 new Person 对象，真正内容存在堆里了 （heap）
    p在栈（stack）中存的是一个地址，真正p内容在堆中的地址是多少（相当与二维数组的下标和元素）

    AG84300是p在栈中的地址，存的是Be9500这个数据在堆（heap）中的地址。
    BE9500是p中存放的内容


    int i = 1
    栈里存的值：1（存在栈中）
    地址：i AG84100

    基本数据类型，值是保存在栈中，引用对象，值保存在堆中，栈中存的是对象在堆中的地址



     */

    }
}
