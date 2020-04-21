package edu.ayuan.ood;

public class Test4 {
    public static void main(String[] args) {
        //实例化person类=创建person对象
        int i = 0;
        String s = "";
//        Person person;//Person类，声明一个person类型的，变量名叫person
       // new Person();// 就是实例化Person类，new Person,P要大写，表示类，实例化
        Person person = new Person();//声明一个person类型的，变量名叫person，实例化Person类并且给person赋值，赋值的值就是当前的实例
        person.name="张三";//给person对象的age属性赋值（不是变量了）
        person.showName();//对象的方法的调用
        //实例化person对象之后，给person.name
    }

}
