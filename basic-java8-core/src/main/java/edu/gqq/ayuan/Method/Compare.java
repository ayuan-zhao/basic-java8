package edu.gqq.ayuan.Method;

public class Compare {
    public static void main(String[] args) {
        //测试数据是否相等
        byte b1 = 3;
        byte b2 = 4;
        System.out.println("byte"+compare(b1,b2));
//        System.out.println("byte"+compare(5,6));//不能直接写整数，需要赋值一下
    }
        public static boolean compare(byte a,byte b) {
            System.out.println("byte");
            return a==b;
// test save
// test save2
// test save4
    }
    //用三元运算符改
//        if(a>b) {
//            return (a > c ? a : c);
//        }else {
//            return (b > c ? b : c);
//        }
    //继续改进
//        return (a>b)?(a>c?a:c):(b>c?b:c);
//    int temp = (a > b) ? a : b;
//    int max = ((temp > c)) ? temp : c;
//        return max;
}
