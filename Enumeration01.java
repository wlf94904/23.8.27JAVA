//package com.haha.enum_;
//
//public class Enumeration01 {
//    public static void main(String[] args) {
//        //使用
//        Season spring = new Season("春天", "温暖");
//        Season winter = new Season("冬天", "寒冷");
//        Season summer = new Season("夏天", "炎热");
//        Season autumn = new Season("秋天", "寒冷");
////        autumn.setName("XXX");
////        autumn.setDesc("非常地热...");
//        //因为对于季节而言，他的对象（具体值），是固定的四个，不会有更多
//        //这个设计类的思路，不能体现季节是固定的四个对象
//        //所以，这样设计不好===>枚举类[枚：一个一个，举：列举，即把具体的对象一个一个列举出来的类
//        // 就称为枚举类]
//        Season other = new Season("红天", "~~~");
//
//    }
//}
//class Season{//类
//    private String name;
//    private String desc;//描述
//
//    public Season(String name, String desc) {
//        this.name = name;
//        this.desc = desc;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }
//}
