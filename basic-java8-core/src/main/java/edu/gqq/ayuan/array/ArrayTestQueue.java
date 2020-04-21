package edu.gqq.ayuan.array;

public class ArrayTestQueue {
    public static void main(String[] args) {
        arrayQueue();
    }

    //交换排序中的冒泡排序

    //正序，从小到大
//4，7，3，1
// 4，3，1，7第一轮得到一个最大的数字，放在倒数第一位；
//3，1，4，7第二轮，比较前三个数字，得到除最后一个数字之外最大的数字，放在倒数第二位
//1，3，4，7，第三轮，得到除最后两个数字外最大的数字，放在倒数第三位
// 排长度-1的轮次
    public static void arrayQueue() {
//        int[] arr = new int[]{4, 7, 3, 1};
        int[]arr = new int[]{123,22,89,543};
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {//比较大小，只需要长度减1的轮次
//         外层循环是循环轮次，轮次循环额次数是数字长度减1；
            for (int j = 0; j < arr.length - 1 - i; j++) {//每一轮次的数字对比排序，数字对比次数,每轮的循环依次4，3，2，轮次长度=-1-i
                if (arr[j] > arr[j + 1]) {//前面的数比后面的数大，这两个需要交换，交换需要临时变量
                   //正序与倒序的区别，只是在判断两个相邻的元素，在什么情况下交换，不一样
                    //如果是正序，前面的大于后面的，交换
                    //如果是倒序，前面的小于后面的，交换
                    //如果两个相邻的元素，如果前面的大于后面的，就前后两个值交换
                    temp = arr[j];
                    arr[j] = arr[j + 1];//一轮一轮去放这个值，最终做到把最大的值放在后面
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}




