package edu.ayuan.ood;
//包下面的文件怎么用,当两个文件下都有Test7的时候，可以通过import来表明，又叫做引包
//import语句告诉编译器到那里去寻找类
import edu.ayuan.ood.Person;
import edu.ayuan.ood.Person.*;
import sun.security.ssl.SSLContextImpl;

public class Test7{
    //    static方法可以直接调用，不需要实例化,要是不写Staic ，需要在main里实例化你当前的这个Test7
//    形参的类型是实体类，也就是对象。ds1是DataSwap的对象，ds1是形参，在main方法调用函数时，肯定要给它一个实参，所以直接用
//    DataSwap是一个类，ds是他的实例化对象，传递ds到swap中，需要
//    a是DataSwap类中的属性
    public static void swap(DataSwap ds1) {
//        这里的a,需要在DataSwap里建一个 public int a;
        ds1.a = 6;
        System.out.println("在swap方法中ds1.a 的值是" + ds1.a);

    }

    //    DataSwap是一个类，ds是他的实例化对象，传递ds到swap中，需要一个dataswap实例对象，ds1接受
    public static void main(String[] args) {
//      第一步： new DataSwap()先在堆内存中存到了堆内存中，地址是BE2500，
//      第二步：ds引用对象存到栈中，地址是AD9500,值是new DataSwap()对象在堆中的地址BE2500
        DataSwap ds = new DataSwap();
//        "调用swap方法之前，ds.a的值是  0
        System.out.println("调用swap方法之前，ds.a的值是" + ds.a);
//        第三步：调用swap方法，给ds1引用对象保存到栈中，地址是AD9600,存的值来源于实参（ds）,也就是ds的栈中存的值，BE2500,
//        这个值实际上就是DataSwap（）对象，在堆中存的地址
//        到第三步的时候，ds也好，ds1也好，实际上都是指向了同一个对象，这个对象就是在堆内存中地址是BE2500上保存的对象
//        ds,ds1都是引用对象，存的是对象实际在堆中的地址
//        堆中是对象实际存贮的地方
//         ds,ds1是引用变量，引用堆中的一个实际变量。ds1,ds操作的是同一个对象
//        在这个例子中ds,ds1操作的是同一个对象

//        直接理解为值传递，栈中ds1保存和ds一样的值，也就是对象的地址，因为地址相同，所以指针指到堆中的同一个位置
        swap(ds);
//    "调用swap方法之后，ds.a的值是"  6
        System.out.println("调用swap方法之后，ds.a的值是" + ds.a);

/**  总结：
 * 方法的参数传递：
 * 1.如果方法的形参是基本数据类型，那么实参（实际的数据）向形参传递参数时，就是直接传递值，把实参的值复制给形参
 * 2.如果方法的形参是对象，那么实参（实际的对象），向形参传递参数的时候，也是把值给形参，这个值是实参在栈内存的值，也就是引用对象在堆内存中地址
 * 基本数据类型都是保存在栈内存中
 * 引用对象在栈内存中保存的是引用对象的地址，那么方法的参数传递，是传递值（是变量在栈内存中的值）

 */

    }
//    引包，没有同名，又是公共的，可以直接用
        Person p =new Person();
//    或者 edu.ayuan.ood.Person p =new  edu.ayuan.ood.Person();,就不用写上面的import了

}
