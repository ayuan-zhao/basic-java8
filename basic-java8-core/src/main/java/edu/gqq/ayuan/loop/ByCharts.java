package edu.gqq.ayuan.loop;

public class ByCharts {
    public static void main(String[] args) {
        multiplicationTablesWorse();
        multiplicationTablesBetter();


    }

    public static void multiplicationTablesBetter() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {//第二个数大于第一个数
                System.out.print(i + "X" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }

        public static void multiplicationTablesWorse () {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    if (j > i) continue;//这样算的次数多
                    System.out.print(i + "X" + j + "=" + (i * j) + "\t");
                }
                System.out.println();
            }
        }
    }


