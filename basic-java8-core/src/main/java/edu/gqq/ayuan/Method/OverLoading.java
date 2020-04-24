package edu.gqq.ayuan.Method;

public class OverLoading {
    public static void main(String[] args) {
        System.out.println(sum(10.3F,20));//int可以直接转换为float，所有，当函数调用一个为int,一个为float的时候，调用float的方法
        //要加F,要不就变成double型来，double型不能直接转换为int
        System.out.println(10.23);
        //见名知意
        //方法的功能相同，参数列表不同的情况，为了见名知意，java允许他们起一样的名字，函数的重载 overloading
        //名字可以一样，但是参数得不一样
        //jvm会根据不同的参数调用不同的方法————方法重载，
        //只要参数1.参数个数不同，2.参数类型不同
        //特点：
        //与返回值类型无关！！只看方法名和参数列表
        //在调用时，虚拟机通过对参数列表的不同来区分同名方法
        //int可以直接转换为float，所有，当函数调用一个为int,一个为float的时候，调用float的方法


    }
    public static int sum(int a, int b,int c) {
        return a+b+c;
    }
    public static float sum(float a, float b) {//类型要一致啊亲
        System.out.println("float");
        return a + b;
    }
}

