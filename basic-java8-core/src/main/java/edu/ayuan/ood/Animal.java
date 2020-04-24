package edu.ayuan.ood;

/**
 * 动物的类
 */
public class Animal {
    String name;//动物的名称
    int eye;//描述眼睛的个数
    int legs;//几条腿

    /**
     * 输出动物吃的食物
     *
     * @param food 食物
     */
    //    局部变量只能在局部使用，food只能在当前方法中使用，形参不包含之内，形参可以直接定义，外部使用，
    //方法的参数可以有多个，参数之间用逗号分割
    public void eat(String food) {
        System.out.println("此种动物的食物是：" + food);
//        i++,这个用不了，因为是局部变量
//        Animal ani = new Animal();//隔壁定义的对象
//        ani.eat("mouse");//要看之前定义时的参数
    }

    /**
     * 动物的移动方式
     *
     * @param moveType 移动方式
     */
    public void move(String moveType) {
//        方法内的局部变量int c =0;局部变量必须有初始化值
        int c= 0;
//        int k;这样的变量用不了，不能在局部使用
        System.out.println("此种动物移动方式是：" + moveType);
    }

}
