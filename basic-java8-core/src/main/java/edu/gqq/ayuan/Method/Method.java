package edu.gqq.ayuan.Method;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据");
        int b = sc.nextInt();

//        int result = method1(a, b);//这个就是接住，定义一个int型，
//        System.out.println(result);
//
//        //
//        result = method1(a, b );
//

        boolean flag = compare(a, b);//调用的类型要和定义的一致，直接写实参，
        System.out.println(flag);


    }


    /*需求：两个数中的最大值
    两个明确；
    返回值类型：int
    参数列表：int a,int b

     */
    public static int method1(int a, int b) {
       /* if (a > b) {
            // System.out.println(a);
            return a;
        } else {
            //System.out.println(b);
            return b;
        }*/
        //用三元改进,上下两种写法都可以
        int c = ((a > b) ? a : b);
        return c;
//        再或者 return((a>b)?a:b)
    }

    //比较两个数是都相等是一个boolean类型
    public static boolean compare(int a, int b) {
//        if(a==b) {
//            return true;
//        }else{
//            return false;
//        }
//    }
//        三元改进：
        boolean flag = ((a == b) ? true : false);
        return flag;

//        改进版：
//        return（（a==b）?true:false）;
//         最终版：
//        return
    }

    public static int method1(int a, int b, int c) {
//        if (a > b) {
//            if (a > c) {
//                return a;
//            } else {
//                return c;
//            }
//        } else {
//            if (b > c){
//                return b;
//            } else {
//            return c;
//        }
//    }
        //用三元运算符改
//        if(a>b) {
//            return (a > c ? a : c);
//        }else {
//            return (b > c ? b : c);
//        }
        //继续改进
//        return (a>b)?(a>c?a:c):(b>c?b:c);
        int temp = (a > b) ? a : b;
        int max = ((temp > c)) ? temp : c;
        return max;


    }

}


