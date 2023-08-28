package com.haha.enum_;

/**
 * @author hhm
 * @version 1.0
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        //获取所有的枚举对象，即数组
        Week[] weeks = Week.values();
        System.out.println("===所有星期的信息如下===");
        //遍历，使用增强for
        for(Week week:weeks){
            System.out.println(week);
        }

    }
}
enum Week{
    //定义Week的枚举对象
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),
    FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期四");
    private String name;

    private Week(String name) {//私有的构造器
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}