package edu.ayuan.ood;

import org.apache.logging.log4j.core.util.JsonUtils;
import org.w3c.dom.ls.LSOutput;

/**
 * 人
 */
public class Person {//类名首字母大写，类后面跟着大括号，全部都是类的信息，这里写了两个成员变量，写了两个方法
    //属性，成员变量,成员变量可以先声明，不用初始化，类成员变量是有默认值(全局变量可以不初始化)
    String name ;//String的默认值是null；
    int age;//年龄，int的默认值是0；
    //行为，方法，也叫函数
//    public static void main(String[] args) {
    //有没有返回值  这个信息  在方法名前面，void没有，int有
     public void showName() {//方法的名称如果是多个单词，首个单词的首字母小写，其他的单词首字母大写，驼峰命名法

         System.out.println("姓名：" + name);
     }

    /**
     * 获取年龄
     * @return
     */
     public int getAge(){//如果是一个有返回值的方法，那么方法体的最后一行一定是返回相应的数据，返回相应的数据，使用的是return关键字，
         //返回的数据类型与方法定义的一致
         return age;//定义在min里面,return在另一个方法里是可以的
     }

}
