package edu.ayuan.ood.day06;
/*java中通过将数据声明为私有的（private）,再提供public方法：getXxx（）和setXxx()实现对该属性的操作，以实现以下目的
1.隐藏一个类中不需要对外提供的实现细节
2.使用者只能通过事先制定好的方法来访问数据，可以方便地加入控制逻辑，限制对属性的不合理操作
3.便于修改，增强代码的可维护性

*/
public class Person {
//    像这样的情况，是把类的属性开发出来，让调用者随意使用，这样会有问题
//    public int age;
//我们需要对这样不能让调用者随意使用的属性做封装和隐藏
//    属性为private，类外部无法访问，只能被Person内部访问
    private int age;

//通过print age 获得了age属性
    public void printAge() {
        System.out.println("年龄是：" + age);
    }
//    用setAge设置属性，用getAge得到属性
    public int getAge(){
        return age;
    }
//加入逻辑控制
    public void setAge(int a) {
        if (a <= 150 && a > 0) {
            age = a;
        } else {
            System.out.println("输入的年龄：" + a + "不在0到150之间");
        }
    }
}
