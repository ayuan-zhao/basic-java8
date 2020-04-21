package edu.gqq.ayuan.loop;

public class Prime2 {
    public static void main(String[] args) {
//        prime1();
//        prime2();
        // 1. just one number.
//        checkOneNumber();
        // 2. check 1-1000
        checkMultiple(34, 56);
    }

    private static void checkMultiple(int min, int max) {
        if (min > max) {
            System.out.println("min must be smaller than max");
            return;
        }
        if (min < 2) {
            System.out.println("please input a number more than 2");
            return;
        }
        for (int i = min; i <= max; i++) {
            boolean res = isPrime2(i);
            if (res) {
                System.out.println(i + " is prime");
            }
        }
    }

    private static void checkOneNumber() {
        boolean res = isPrime2(98);
        if (res) {
            System.out.println("is prime");
        } else {
            System.out.println("not a prime");
        }
    }


    public static void prime1() {
        for (int i = 3; i < 1000; i++) {
            boolean isPrime = true;//先预设是正确的
            int j = 2;// int写在for循环里面，因为每次都要从2开始试
            for (j = 2; j < i - 1; j++) {//不停试j，从2-i-1；
                if (i % j == 0) {//就是在1和这个数字之外还被其他数字整除了，就不是质数
                    isPrime = false;//把预设值给改过来
                    break;//已经被整除了，不是质数了，就不用再试了，跳出循环
                }
            }

            if (isPrime) {//说明找到一个数是prime了，打印出来
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime2(int num) {
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
