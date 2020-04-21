package edu.gqq.ayuan.loop;

public class NumberReverse {
    public static void main(String[] args) {
        int num = 12345;
        String res = "";//先建空的字符串，否则会拼进去奇奇怪的东西
        while (num > 0) {//绝对要写大于零，不是等于零
            res += num % 10;//String+int=String
            // res是字符串，字符串加数字还是字符串，只是拼接不是加和
            num /= 10;//除以十会把最后一位去掉
        }
        System.out.println(res);
    }
}
