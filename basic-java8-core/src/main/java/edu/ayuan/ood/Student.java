package edu.ayuan.ood;

/**
 * 学生类
 */
public class Student {
    public String name;
    public int age;
    public String course;
    public String interest;

    /**
     * 显示学生信息,调用在Test4 里
     */
    public void showInfo(){
        System.out.println("姓名"+name);
        System.out.println("年龄"+age);
        System.out.println("课程"+course);
        System.out.println("兴趣"+interest);

    }

}
