package com.haha.enum_;

/**
 * @author hhm
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.WINTER);
    }
}
//演示使用enum关键字来实现枚举类
enum Season2{//类


    //定义了四个对象,固定
    //public，这样外部才可以访问，static，希望外部可以直接访问
//    public static final Season SPRING=new Season("春天", "温暖");
//    public final static Season WINTER=new Season("冬天", "寒冷");
//    public final static Season AUTUMN=new Season("夏天", "炎热");
//    public final static Season SUMMER=new Season("秋天", "寒冷");
    //如果使用了enum来实现枚举类
    //1.使用关键字enum替代class
    //2.public static final Season SPRING=new Season("春天", "温暖");直接使用
    // SPRING("春天", "温暖");替代，常量名(实参列表）
    //3.如果有多个常量（对象），使用,号间隔即可
    //4.如果使用enum来实现枚举，要求将定义常量对象写在枚举类的最前面
    //5.如果使用的是无参构造器，创建常量对象，则可以省略（）
    SPRING("春天", "温暖"),WINTER("冬天", "寒冷"),AUTUMN("秋天", "凉爽" ),SUMMER("夏天", "炎热")/*WHAT*/;
    private String name;
    private String desc;//描述
    private Season2(){//无参构造器

    }
    //两个参数的构造器，上面调用
    private Season2(String name, String desc) {//做成私有的，外面就不可以new了
        this.name = name;
        this.desc = desc;
    }
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
