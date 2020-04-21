package edu.gqq.ayuan.array;

public class ArrayProblem {
    public static void main(String[] args) {
//        OutOfBounds();
        nullpointexception();
    }


    public static void OutOfBounds() {
        int[] arr = new int[3];//声明，定义，申请空间的时候，有一个有三个长度的数组，三个连续的内存空间96个bytes
        System.out.println(arr[3]);//长度为3，最多能打到2，因为从零开始
        //会报ArrayIndexOutOfBoundsException
    }

    public static void nullpointexception(){
        int[] arr = null;
        System.out.println(arr[0]);//nullpointexception,null就是啥都没有的意思arr什么都没有，不能调任何一个值
    }
}
