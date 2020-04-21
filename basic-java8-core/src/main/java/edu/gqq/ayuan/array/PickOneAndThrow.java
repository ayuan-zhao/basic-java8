package edu.gqq.ayuan.array;

public class PickOneAndThrow {
    public static void main(String[] args) {
        pickOneAndThrow();
    }

    public static void pickOneAndThrow() {
        int[] array = new int[]{2, 3, 0, 0, 34, 45, 0, 2, 7, 5};
//    int [] lengthNumber=  new int [0];
        int lengthNumber = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0) {
                continue;
            } else {
                lengthNumber++;

            }
        }
        int[] NewOne = new int[lengthNumber];
        for (int i = 0; i < lengthNumber - 1; i++) {


        }

    }

}
//返回 一个int型，array数组