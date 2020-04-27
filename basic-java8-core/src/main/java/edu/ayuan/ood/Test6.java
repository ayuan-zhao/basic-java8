package edu.ayuan.ood;

public class Test6 {
    /**
     * 第一步：先执行int a =0,在栈中开辟了一块内存，地址就是AD8500,存的值是0，in a = 0 ,执行完了
     * 第二步：调用swap方法，执行int i部分，在栈中开辟一块内存，地址是AD8600,值是从a那里复制过来的值，值是0
     * 执行 swap的方法体里的代码，i=6，把i在栈中的值，改成6，最终，i在栈中的值是6。
     *
     * 总之，基本数据类型在参数的传递过程中，就是把实参的值复制值到形参上
     * @param i
     */

    public static void swap(int i ) {
//        进入这一步的时候 i 的值是0，但是下一步，又给i重新赋值了
        i = 6;
        System.out.println("swap方法中的参数i的值"+i);


    }

    public static void main(String[] args) {
        int a = 0;
//        不调用不执行
        swap (a);
        System.out.println("main方法中的a的值："+a);

    }
}
