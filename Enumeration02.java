package com.haha.enum_;

/**
 * @author hhm
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);

    }
}

//演示自定义枚举实现
class Season{//类
    private String name;
    private String desc;//描述

    //定义了四个对象,固定
    //public，这样外部才可以访问，static，希望外部可以直接访问
    public static final Season SPRING=new Season("春天", "温暖");
    public final static Season WINTER=new Season("冬天", "寒冷");
    public final static Season AUTUMN=new Season("夏天", "炎热");
    public final static Season SUMMER=new Season("秋天", "寒冷");

    //1、将构造器私有化，目的，防止直接new
    //2.去掉setXXX方法，则只能读，不能修改，防止属性被修改
    //3.在Season内部，直接创建固定的对象
    //4.优化，可以加入final修饰符,final可在static的前后
    private Season(String name, String desc) {//做成私有的，外面就不可以new了
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
