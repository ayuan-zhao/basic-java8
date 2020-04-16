package edu.gqq.ayuan;

import org.apache.logging.log4j.core.util.JsonUtils;

public class Day4 {
    public static void main(String[] args) {
        //break
//        int i = 9;
//        switch (i) {
//            case 1:
//                break;//中止case

//        return1();
//        return2();
//        return3();
//        break1();
//        break2();
//        arrayTest1();
          length1();
          length2();
    }

//        continue跳过某个循环语句块的一次执行，出现在多层嵌套的循环体语句中，可以通过标签指明要跳过的是哪一层的循环


    //return：并非专门用于结束循环的，它的功能时结束一个方法，函数。当一个方法执行到一个return语句时，这个方法将被结束。
    //return写到哪，下面的代码就不执行了
    private static void return1() {
        for (int d = 0; d < 9; d++) {
            return;
            //System.out.println(d);
        }
    }

    private static void return2() {
        for (int e = 0; e < 9; e++) {
            if (e == 7) ;
            {
                return;//这块看起来和使用break感觉一样，但是实际上，return是把整个方法结束了，而break只是终止当前的循环
            }
            //System.out.println(e);
        }
    }

    private static void return3() {
        for (int f = 0; f < 2; f++) {
            for (int g = 0; g < 2; g++) {
                if (g == 1) {
                    return;//没有输出，因为停止了这个函数方法
                    //break;//有输出，因为只停止本层循环
                }
                System.out.println(g);
            }
        }
    }


    public static void break1() {
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 9; b++) {
                if (b > 6) {
                    break;//当i大于6的时候终止循环,终止的循环是当前所在的循环，小循环，继续进行上一层循环
                }
                System.out.println();
            }
            break;//写在哪个循环里就中止哪个循环，sout之后执行这个break，并且没有写条件，所以整个大循环只执行一次
        }
    }

    public static void break2() {
        for (int c = 0; c < 9; c++) {
            if (c % 2 == 0) {
                continue;//结束当前这次循环，直接进入下一次循环，如果c取余数，只输出1，3，5，7,continue当前循环下面的代码不执行
                //直接进入下一次
//                System.out.println(c);
            }

        }
    }
//            int i = 0;
//            int k = 1;
//            int m = 2;
    //想把多个的数据放在一个变量里？使用数组，就存放多个数据的集合
    //例如，存放多个int类型的数据
    //int[]ii;//声明了一个int的数组；数据类型+中括号+变量名称
    //

    // int[] ii = new int[4];//  声明一个能放4个int类型数据的数组
    //  int[] ii0 = new int[]{1, 2, 3, 4};//声明一个存放了1，2，3，4这四个数的数组

    //  String[] strs = new String[]{"c", "a", "b"};//数组内的元素（数组内的数据）都有一个引用的引用下标
    //这个下标是个数字，这个数字是从零开始，c is 0;a is 1;b is 2;
    //变量名称+中括号+数字2// str[1],这个是a,这是引用
    // 数组内元素的方法
    //数组的长度
    // System.out.println("strs数组的长度是" + strs.length);

    //数组元素的默认初始化
    //int[] ii = new int[2]//使用动态初始化的时候，数组的元素会有默认值，数字类型的默认值是0，
    //对象的默认值是null
    //  System.out.println(ii[0]);//默认0
    //int ii = new int [4];
    //ii[0]=2;
    // System.out.println(ii[0]);
    //ii[0]=2
//        int[][]ii = new int [][]{
//                {1,2},//第0个元素
//                {3,4}第1个元素
    //System.out.println(ii[1][0]);//4
//
//        int[][]ii0 = new int[2][3]；//第一维部分的长度是2，第二维也就是第一维的每个元素长度是3。
    //2行3列，横着存2个数，竖下来存3个数
    //{
    //{1,23,4},
    //{2,4,6}
    //}
    // int [][]ii1 =new int [2][1]

    //int [][] ii1 = new int [2][];//只定义第一维的长度，第二维不定义

    //int [][]arr =new int [3][2];
    //定义了名称为arr的二维数组
//    二维数组中有3个一维数组
    //每一个一维数组中有两个元素
    //一维数组的名称分别为arr[0]arr[1]arr[2]
    //给第一个一维数组1脚标位赋值为78的写法是 arr[0][1]=78;

    //格式2（动态初始化）int [][] arr = new int [3][];
    //二维数组中有3个一维数组
    //每一个一维数组都是默认初始值null(注意，区分与格式1)
    //arr[0]=new int[3];arr [1]=new int [1]; arr[2]=new int [2];

    //System.out.println(ii[1][0]);
    //特殊写法 int[]x,y[];//x是一维数组，y是二维数组

    //先要知道arr的长度
    public static void arrayTest1() {
        int[][] arr = new int[][]{
                {3, 8, 2},
                {2, 7},
                {9, 0, 1, 6}
        };
//        int[][] arr2 = new int[3][];
//        int[] arr31 = new int[]{1, 2, 3};
//        int[] arr32 = new int[arr31.length];

    public static void Length1() {
            //先要知道arr的长度
            int[][] arr5 = new int[][];
            int len = arr5.length;//数组的一维的长度
            int res = 0;
            for (int i = 0; i < len; i++) {
                int[] arr0 = arr5[i];
                int llen = arr0.length;//二维数组的长度
                for (int j = 0; j < llen; j++) {
                    System.out.println(arr0[j]);
                    res += arr0[j];
                }
            }
            System.out.println(res);
        }
    }
        //另一种写法，简单
    public static void length2() {
            int res1 = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    res1 += arr[i][j];
                }
            }
        }
        int[] arr4 = new int[]{4, 2, 7, 1, 3, 5};
        //最大值
        int max = arr4[0];//假设arr2[0]是最大值
        for (int i = 0; i < arr2.length; i++) {
            if (max < arr4[i]) {//一维数组，arr2[i]是下标，是具体的数
                max = arr4[i];//max只存目前最大值,擂台循环，把目前最大的值赋值给max
            }
        }
        System.out.println("max:" + max);

        int res2 = 0;
        for (int i = 0; i < arr4.length; i++) {
            res2 += arr4[i];
        }
        System.out.println("sum:" + res2);
        System.out.println("average:" + (res2 / arr2.length));


        //复制，定义一个和原来数组一样长度的数组

        int[] copy = new int[arr2.length];//声明了一个与arr长度一致的数组
        for (int i = 0; i < arr2.length; i++) {//
            copy[i] = arr2[i];//  遍历arr,把arr的每一个元素，按照顺序拿出来,给copy的每一个元素赋值，在这里的i就是copy和arr的元素下标

        }
    }
}
