package edu.gqq.ayuan.array;

public class MaxMinAverage {
    public static void main(String[] args) {
        float[] given = new float[]{1.666F, 6.6F, 118.8F, 166F, 666F, 666.666F};
        float maxValue = max(given);
        System.out.println("maxValue is " + maxValue);

//        max();
//        min();
//        average();

    }

    public static float max(float[] given) {
        if (given == null || given.length == 0) return -1;
        float max = given[0];
        for (int i = 0; i < given.length; i++) {
            if (max < given[i]) {
                max = given[i];
            }
        }
        return max;
    }

    public static void max() {
        float[] given = new float[]{1.666F, 6.6F, 118.8F, 166F, 666F, 666.666F};
        float max = given[0];

        for (int i = 0; i < given.length; i++) {
            if (max < given[i]) {
                max = given[i];
            }
        }
        System.out.println("max is" + max);
    }


    public static void min() {
        float[] given = new float[]{1.666F, 6.6F, 118.8F, 166F, 666F, 666.666F};
        float min = given[0];
//        for (int i = 0; i < given.length - 1; i++) {
//        这么写是错的，从零开始，到数组的长度就可以了，不需要再减1了
        for (int i = 0; i < given.length - 1; i++) {
            if (min > given[i]) {
                min = given[i];
            }
        }
        System.out.println("min is" + min);

    }

    public static void average() {
        float[] given = new float[]{1.666F, 6.6F, 118.8F, 166F, 666F, 666.666F};
        float average = given[0];
        float sum = 0;
        for (int i = 0; i < given.length - 1; i++) {
            sum += given[i];
        }
        average = sum / given.length;
        System.out.println("sum is " + sum + " average is " + average);
    }
}



