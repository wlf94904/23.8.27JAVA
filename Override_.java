package com.haha.annotation_;

/**
 * @author hhm
 * @version 1.0
 */
public class Override_ {
    public static void main(String[] args) {

    }
}
class Father{//父类
    public void fly(){
        System.out.println("Father fly...");
    }

    public void say(){}
}
class Son extends Father{//子类
    //1. @Override注解放在fly方法上，表示子类的fly方法是重写了父类
    //2.这里如果没有写@Override，还是重写了父类的fly方法
    //3.如果写了 @Override注解，编译器就会检查该方法是否真的重写了
    //父类的方法，如果的确重写了，则编译通过，如果没有重写，则编译错误
    //4.@Override的定义
    //@interface表示一个注解类，
    /*
        @Target(ElementType.METHOD)
        @Retention(RetentionPolicy.SOURCE)
        public @interface Override {
         }
     */
    @Override
    public void fly() {
        System.out.println("Son fly...");
    }
    @Override
    public void say(){}
}