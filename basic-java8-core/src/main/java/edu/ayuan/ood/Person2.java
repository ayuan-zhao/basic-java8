package edu.ayuan.ood;

public class Person2 {
    public String name;
    public int age;
//    可以备注性别男为0，女为1
    public int sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println(age);
    }

    public int addAge(int i) {
        age += i;
        return age;


    }
}


