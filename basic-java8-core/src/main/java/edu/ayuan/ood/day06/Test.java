package edu.ayuan.ood.day06;
//如果是使用同一个包下的类，import可以省略

import edu.ayuan.ood.day06.Person;

public class Test {
    public static void main(String[] args) {
//        对于同一个包下的使用同一个包下的类
        Person p = new Person();
//      这样的情况，程序是对的，能执行，但是不符合正常逻辑
//        p.age = -100;
//        像这种情况，是把类的属性开放出来，让调用者随意使用，这样会有问题
//        p.printAge();
        p.setAge(12);
        p.printAge();

        Person4 p4 =new Person4();
        p4.getAge();
    }
}

class T0{

}