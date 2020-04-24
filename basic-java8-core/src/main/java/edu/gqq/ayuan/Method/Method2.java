package edu.gqq.ayuan.Method;

import java.util.Scanner;//已扫描的

public class Method2 {
    public static void main(String[]args){
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数");
        int m = sc.nextInt();
        System.out.println("请输入列数");
        int n = sc.nextInt();
        star(m,n);
        //void类型的方法调用


//        方法一：单独调用 可以
//        star(8, 9);
//        方法二：输出调用 此处不可以使用void
//        System.out.println(3，4);」
//
//      方法三：赋值调用
        //非法的表达式
        //void v = star(3,4);
    }
        //A方法不调用，不执行
        //B方法与方法是平级，不能嵌套定义
        //C.方法定义的时候参数之间用逗号隔开
        //D.方法调用的时候不用在传递数据类型sum(33,55);sum(x,y)
        //E.如果方法有明确的返回值，一定要有return带回一个值
        //F.每个case,都需要有return,大于，小于，各种情况都要有return
        //**********************
        //需求6行7列
//        for(int x = 0;x <6 ; x++){
//            for(int y = 0;y< 7;y++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //如果需求继续改变，应该考虑使用方法改进。
    //写一个什么样子的方法呢？写一个 m行，n列的代码
   /* public static void star(int m,int n){
    for(int x = 0;x <m ; x++){
            for(int y = 0;y< n;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/


    public static void star(int m,int n){
        for(int x = 0;x <m ; x++){
            for(int y = 0;y< n;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

   /* 两个明确：
       返回值类型：这个时候没有明确的返回值，不写东西还不行，所以，记住，这里是void
       参数类型：int m,int n


       voidl类型返回值的方法调用；
       单独调用(对)
       输出调用（错）
       赋值调用（错）


     */
}

