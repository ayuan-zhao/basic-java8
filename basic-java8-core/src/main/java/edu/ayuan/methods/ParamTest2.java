package edu.ayuan.methods;

public class ParamTest2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 20;
        p.address = "132 dixon lading";
        p.name = "John";
        changePerson(p);
//        System.out.println(p.address);
//        System.out.println(p.name);
//        System.out.println(p.age);
        System.out.println(p);
    }

    private static void changePerson(Person p) {
        p.age = 30;
        p.address = "122 dixon lading";
        p.name = "John Smith";
    }
}

//cmd + n feng zhuang
class Person extends Object{
    int age;
    String name;
    String address;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
