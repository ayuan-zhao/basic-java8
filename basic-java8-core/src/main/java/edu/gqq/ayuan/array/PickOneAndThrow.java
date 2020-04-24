package edu.gqq.ayuan.array;

public class PickOneAndThrow {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 0, 0, 34, 45, 0, 2, 7, 5};


//        int arrayOriginal = pickOneAndThrow(3);
        int[] newArray = pickOneAndThrow(array, 2);

        System.out.println("newArray is");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }

    public static int[] pickOneAndThrow(int[] oldArray, int target) {
//        int[] array = new int[]{2, 3, 0, 0, 34, 45, 0, 2, 7, 5};
//    int [] lengthNumber=  new int [0];
        int lengthNumber = 0;
        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray[i] != target) {
                lengthNumber++;
            }
        }
        int[] newArray = new int[lengthNumber];
        int idx = 0;
        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray[i] != target) {
                newArray[idx] = oldArray[i];
                idx++;
            }
        }
        return newArray;
    }
}


//返回 一个int型，array数组