package edu.ayuan.methods;

public class ParamTest3 {
    public static void main(String[] args) {
        Ren p = new Ren();
//        p.age = 20;
        p.setAge(20);
//        p.address = "132 dixon lading";
        p.setAddress("132 dixon lading");
//        p.name = "John";
        p.setName("John");
        changePerson(p);
        System.out.println(p.getAddress());
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }

    private static void changePerson(Ren p) {
        p = new Ren();
//        p.age = 30;
        p.setAge(30);
//        p.address = "122 dixon lading";
        p.setAddress("122 dixon lading");
//        p.name = "John Smith";
        p.setName("John Smith");
    }
}

class Ren {
    private int age;
    private String name;
    private String address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
