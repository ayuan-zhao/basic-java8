package edu.gqq.ayuan.loop;

import java.lang.invoke.MethodHandles;

public class Bricks {
    public static void main(String[] args) {

//        brick1();
//        brick2();
//        brick3();
//       brick4();
        brick5();
    }

    public static void brick1() {
        int i = 0;
        int j = 36;
        while (i <= 36) {
            j = 36 - i;
            if (i % 3 == 0) {
                int a = i / 3;
                int b = 3 * j;
                if (a + b == 36) {
                    break;
                }
            }
            ++i;
        }
        System.out.println(i);
        System.out.println(j);
    }

    public static void brick2() {
        int man = 0;
        int kids = 36;
        for (man = 0; man <= 36; man++) {//因为最先设了man是零，要把man的人数循环起来
            kids = 36 - man;//man的人数循环起来了，kids也需要重新赋值，这两个数必须此消彼长
            if (kids % 3 == 0) ;
            {
                if (kids / 3 + man * 3 == 36) {
                    System.out.println("小孩人数是" + kids + "大人人数是" + man);
                }
            }
        }
    }

    public static void brick3() {
        int man = 0;
        int kids = 36;
        while (man <= 36) {
            kids = 36 - man;
            if (kids % 3 == 0) {
                if (kids / 3 + man * 3 == 36) {
                    break;//学会加break
                }
            }
            man++;
        }
        System.out.println("小孩人数是" + kids + "大人人数是" + man);
    }

    public static void brick4() {
        int man = 0;
        int kids = 36;
        while (man <= 36) {
            kids = 36 - man;
            if (kids % 3 == 0) {
                int kidsB = kids / 3;
                int manB = man * 3;
                if (kidsB + manB == 36) {
                    break;//一定要加break

                }
            }
            man++;
        }
        System.out.println("小孩人数是" + kids + "大人人数是" + man);
    }


    public static void brick5() {
        int man = 0;
        int kids = 36;
        while (man <= 36) {

            kids = 36 - man;
            boolean a = kids / 3 + man * 3 == 36;
            if (a) {
                break;
            }
            man++;
        }
        System.out.println("小孩人数是" + kids + "大人人数是" + man);
    }
}





