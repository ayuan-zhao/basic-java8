package edu.gqq.ayuan.loop;

public class Jiezhu {
    public static void main(String[] args) {
        //define array
        int[] arr = new int[]{22, 33, 45, 6, 3, 9, 70, 7, 5};
        // define number
        int target = 8;

//        boolean result = hasTarget(target, arr);//接住
//
//        if (result) {
//            System.out.println("这个十位数组里有这个数");
//        } else {
//            System.out.println("这个十位数组里没有这个数");
//        }

//        if (true) {
//            System.out.println("true");
//        }

        //          or
        if (hasTarget(target, arr)) {
            System.out.println("这个十位数组里有这个数");
        } else {
            System.out.println("这个十位数组里没有这个数");
        }

        String[] arrs = {"abc", "def"};
        //名字可以不一样，形参和实参数量和类型对应，顺序对应
        multParams(3, "abc", arr, arrs);
    }

    /**
     * @param target the number to be searched
     * @param search original array
     * @return true: found false:not found
     */
    public static boolean hasTarget(int target, int[] search) {
        //  int [] search= new int [10];

        for (int i = 0; i < search.length; i++) {
            if (search[i] == target) {
                return true;
            }
        }
        return false;
    }

    /**
     * reture+/**+return
     *
     * @param a
     * @param b
     * @param arr
     * @param arrStrs
     */
    public static void multParams(int a, String b, int[] arr, String[] arrStrs) {
    }

}


