package edu.gqq.ayuan.array;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
//        arrayLength();
//        arrayLength2()search;
//        arrayMax();
//        arraycopy();
        reverse();
    }
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
//                {4，2}//第1个元素
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
    public static void arrayLength() {//静态赋值是花括号，动态赋值是分号
        int[][] arr = new int[][]{
                {3, 8, 2},
                {2, 7},
                {9, 0, 1, 6}
        };
        int len = arr.length;//数组的一维的长度
        int res = 0;
        for (int i = 0; i < len; i++) {
            int[] arr0 = arr[i];//一维长度，赋值给arr0
            int llen = arr0.length;//二维数组的长度
            for (int j = 0; j < llen; j++) {
                System.out.println(arr0[j]);//挨个输出
                res += arr0[j];


            }
        }
        System.out.println(res);
    }

    //另一种写法，简单
    public static void arrayLength2() {//静态赋值是花括号，动态赋值是分号
        int[][] arr = new int[][]{
                {3, 8, 2},
                {2, 7},
                {9, 0, 1, 6}
        };
        int res1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                res1 += arr[i][j];
                //第一遍用for循环把二维数组表示成了arr.length个一维数组
            }
        }
    }

    public static void arrayMax() {//   求数组里的最大值
        int[] arr0 = new int[]{4, 2, 7, 1, 3, 5};
        int max = arr0[0];//假设arr2[0]是最大值
        for (int i = 0; i < arr0.length; i++) {
            if (max < arr0[i]) {//一维数组，[i]是下标，arro[i]是具体的数
                max = arr0[i];//max只存目前最大值,擂台循环，把目前最大的值赋值给max
            }
        }
        System.out.println("max:" + max);
    }

    public static void arraySum() {
        int[] arr = new int[]{4, 2, 7, 1, 3, 5};
        int res2 = 0;
        for (int i = 0; i < arr.length; i++) {
            res2 += arr[i];
        }
        System.out.println("sum:" + res2);
        System.out.println("average:" + (res2 / arr.length));
    }


    //复制，定义一个和原来数组一样长度的数组
    public static void arraycopy() {
        int[] arr = new int[]{4, 2, 7, 1, 3, 5};//copy数组得和arr数组长度一致
        int[] copy = new int[arr.length];//声明了一个与arr长度一致的数组
        for (int i = 0; i < arr.length; i++) {//复制
            copy[i] = arr[i];//  遍历arr,把arr的每一个元素，按照顺序拿出来,给copy的每一个元素赋值，在这里的i就是copy和arr的元素下标

            System.out.println(copy);
        }
    }

    public static void reverse() {
        int[] arr = new int[]{4, 2, 7, 1, 3, 12};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //考虑再声明一个数组temp,这个数组的长度与arr长度一致，我们倒着循环arr,正着给temp赋值
        //arr[5]=temp[0];arr[4]= temp[1];arr[3]= temp[2];arr[2]= temp[3];arr[1]=temp[]4;arr[0]= temp[5]
        //temp是arr的倒序数组；再把temp赋值给arr (arr= temp)
        //倒着循环的代码
        //for (int i = 9; i >= 0; i--)
        //一个数组的最后一个元素的下标，等于数组的长度-1，元素的下标从0开始
        int[] temp = new int[arr.length];
        //System.out.println(i);//987654321
        int k = 0;//这个是temp的元素下标
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[k] = arr[i];//第一次循环，temp[0]=arr[5],或者写成temp[k++]
            //这个赋值是赋值了一个数组
            k++;//a[c]=b[d] c++,d--,这样就颠倒过来了
        }

        for (int i = 0; i < temp.length; i++) {//或者=temp.lengh-1；
            System.out.print(temp[i] + " ");
        }
        System.out.println();

//        System.out.println(temp[k]);//!!!这样写是错误的，因为最后k还会++一次,会超出范围!!
        //输出要在循环外输出，否则更像是在打log
        temp[3] = 17;
        temp[0] = 222;
//        temp[6] = 99; // ArrayIndexOutOfBoundsException
        for (int i = 0; i < temp.length; i++) {//或者=temp.lengh-1；
            System.out.print(temp[i] + " ");
        }
        System.out.println();


//for是一个循环一个循环跑，这个是独立的循环
//        arr = temp;
//        for (int i = 9; i >= 0; i--) {
//            System.out.println(arr[i]);
//        }


    }
}


//        int[][] arr2 = new int[3][];
//        int[] arr31 = new int[]{1, 2, 3};
//        int[] arr32 = new int[arr31.length];//先要知道arr的长度
