package edu.gqq.ayuan.loop;

public class Continue {
    public static void main(String[] args) {
        //break
//        int i = 9;
//        switch (i) {
//            case 1:
//                break;//中止case

        return1();
//        return2();
//        return3();
//        break1();
//        break2();

    }

//        continue跳过某个循环语句块的一次执行，出现在多层嵌套的循环体语句中，可以通过标签指明要跳过的是哪一层的循环


    //return：并非专门用于结束循环的，它的功能时结束一个方法，函数。当一个方法执行到一个return语句时，这个方法将被结束。
    //return写到哪，下面的代码就不执行了
    private static void return1() {
        for (int d = 0; d < 9; d++) {
            return;
            //System.out.println(d);
        }
    }

    private static void return2() {
        for (int e = 0; e < 9; e++) {
            if (e == 7) ;
            {
                return;//这块看起来和使用break感觉一样，但是实际上，return是把整个方法结束了，而break只是终止当前的循环
            }
            //System.out.println(e);
        }
    }

    private static void return3() {
        for (int f = 0; f < 2; f++) {
            for (int g = 0; g < 2; g++) {
                if (g == 1) {
                    return;//没有输出，因为停止了这个函数方法
                    //break;//有输出，因为只停止本层循环
                }
                System.out.println(g);
            }
        }
    }


    public static void break1() {
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 9; b++) {
                if (b > 6) {
                    break;//当i大于6的时候终止循环,终止的循环是当前所在的循环，小循环，继续进行上一层循环
                }
                System.out.println();
            }
            break;//写在哪个循环里就中止哪个循环，sout之后执行这个break，并且没有写条件，所以整个大循环只执行一次
        }
    }

    public static void break2() {
        for (int c = 0; c < 9; c++) {
            if (c % 2 == 0) {
                continue;//结束当前这次循环，直接进入下一次循环，如果c取余数，只输出1，3，5，7,continue当前循环下面的代码不执行
                //直接进入下一次
//                System.out.println(c);
            }

        }
    }
}

