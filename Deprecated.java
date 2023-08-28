package com.haha.annotation_;

/**
 * @author hhm
 * @version 1.0
 */
public class Deprecated {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}
//1.@java.lang.Deprecated修饰某个元素，表示该元素已经过时
//2.即不再推荐使用，但仍然可以使用
//3.查看@java.lang.Deprecated注解类的源码
//4.可以修饰方法，类，字段，包，参数等等
//5.@java.lang.Deprecated可以做版本升级过渡使用
/*
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {
}

 */
@java.lang.Deprecated
class A{
    @java.lang.Deprecated
    public int n1=10;
    @java.lang.Deprecated
    public void hi(){

    }
}