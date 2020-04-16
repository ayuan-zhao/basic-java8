package edu.gqq.ayuan.array;

public class ArrayTest {
    public static void main(String[] args) {
//        boolean[][] arr = new boolean[2][];
//        for (int i = 0; i < 2; i++) {
////            for (int j = 0; j < 3; j++) {
////                System.out.println(arr[i][j]);
////            }
//            System.out.println(arr[i]);
//        }
//        int[][] arr = new int[][]{
//                {3, 8, 2},
//                {2, 7},
//                {9, 0, 1, 6}
//        };
//        System.out.println(arr[0][2]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[2][2]);

        int[][] arrtest = new int[3][4];
        arrtest[2] = new int[]{11, 21};
        System.out.println(arrtest[2][1]);
        System.out.println(arrtest[2][2]);
    }
}
