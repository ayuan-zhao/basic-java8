package edu.ayuan.methods;

public class ParamTest1 {

    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        String str = "str1";

        modify(a, b, str);

        System.out.println("----in main after call method modify---");

        // a is 8
        System.out.println(a);
        // b is 5
        System.out.println(b);
        // str is str1
        System.out.println(str);
    }

    private static void modify(int a1, int b, String str) {
        System.out.println("----befor change---");
        // a is 8
        System.out.println(a1);
        // b is 5
        System.out.println(b);
        // str is str1
        System.out.println(str);
        a1 = 0;
        b = -1;
        str = "str2";
        System.out.println("----after change---");

        // a is 0
        System.out.println(a1);
        // b is -1
        System.out.println(b);
        // str is str2
        System.out.println(str);
    }
}
