package edu.gqq.ayuan.loop;

public class Pyramid {
    public static void main(String[] args) {

//        printPyramid(20);
//        printPyramidReverse(30);
        printPyramidReverse2(20);
    }

    /**
     * print n rows Pyramid
     *
     * @param n lines
     */
    public static void printPyramid(int n) {
        // int rowNum = 1;不用提前定义，在循环直接写
        int spaceNum = n - 1;//空格数是总行数-1,一共五行，第一行5-1=4个空格，第二行5-2=3个空格
        for (int rowNum = 1; rowNum <= n; ++rowNum) {//从第一行循环，行数小于总行书，行数++1
            for (int i = 0; i < spaceNum; i++) {//当行数小于总行书的时候，循环空格
//                i<spaceNum,循环次数小于n-1,比如10行，就循环打9次，一定要写spaceNum,配合--spaceNum才能保证空格不断减少

                System.out.print(" ");
            }
            for (int i = 0; i < 2 * rowNum - 1; i++) {
                System.out.print("*");
            }
            --spaceNum;
            System.out.println();

        }
    }

    public static void printPyramidReverse(int n) {
        // int rowNum = 1;不用提前定义，在循环里
        int spaceNum = 0;//空格数是总行数-1
        int starNum = 2 * n - 1;//
        for (int rowNum = 1; rowNum <= n; ++rowNum) {//从第一行循环，行数小于总行书，行数++1
            for (int i = 0; i < spaceNum; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < starNum; i++) {
                System.out.print("*");
            }
            ++spaceNum;
            starNum -= 2;
            System.out.println();
        }
    }

    public static void printPyramidReverse2(int n) {
        int space = 0;
        int star = 2 * n - 1;//星星的数量最大的时候是2*n-1,每行少两个，星星每行的数量是2n-2*rownumber+1,这个不用管
        for (int row = 1; row <= n; row++) {//一行一行循环，行数小于等于总行数
            for (int i = 0; i <space; i++) {//循环的次数小于空格数，空格数是1，就循环一次，空格为5，就循环打印空格5次。
                //循环几次，就打几次空格
                System.out.print(" ");
            }
            for (int i = 0; i < star; i++) {//i从0开始，会比2*n-1多打一次*，所以应该是小于
     //星星数最大的时候是2n-1，所以循环次数小于2n-1，每次循环一次，星星每次减2，打印的星星也就每次减二
                System.out.print("*");
            }
            System.out.println();//每一次大循环过后，row+1，空格加+1，星星-2，这个要写在大循环里和换行写在一起
            space++;
            star -= 2;
        }
    }
}



