package edu.gqq.ayuan.loop;

public class Prime {

    private static boolean isPrime(int num) {
        if (num == 2) return true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        for (int i = 2; i < 1000; i++) {
//            if (isPrime(i)) {
//                System.out.println(i);
//            }
//        }

//        printPrime3();
        printPrime2();

    }

    public static void printPrime3() {
        for (int i = 3; i < 1000; i++) {// 判断完了再++i
            int j = 2;// int写在for循环里面，因为每次都要从2开始试
            boolean isPrime = true;// 预设boolean初始是true
            while (j <= i - 1) {// i是要看是不是质数的值，j是看能不能被整除的数，j最大要比i小一位
                if (i % j == 0) {// 判断5%2是否为零，如果不为零，j++，不进if代码块，直接J+1回到while判断
                    // i%j如果为零，isPrime=false→break跳出if判断和While循环→也不j++→直接从for循环开始判断
                    isPrime = false;
                    break;// break是循环才有break，而不是判断的break,break之后就跳出循环，或者进入上一个循环
                }
                j++;
            }
            if (isPrime) {// 如果while循环进不去,就进for下面第二个if,因为boolean值默认是true,就打印答案
                // 如果while循环进不去，那就是用设定好的boolean值是ture,打印i这个数字
                // 打印完了之后重新回到for语句，i++,一定一定把第二个if写在while循环外，否则每次验j都会输出一次
                System.out.println(i);
            }
        }
    }

    public static void printPrime2() {
        for (int i = 3; i < 1000; i++) {
            int j = 2;
            boolean isPrime = true;
            while (j <= i - 1) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
