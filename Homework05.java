package com.haha.homework;

/**
 * @author hhm
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        new A().f1();
    }
}
class A{
    private  String NAME="hello";
    public void f1(){
        class B{
            private final String NAME="xxx";
            public void show(){
                //如果内部类和外部类的属性重名，可以同外部类.this.属性名来指定
                System.out.println("NAME="+NAME+" 外部类的name="+A.this.NAME);
            }
        }

        B b = new B();b.show();

    }
}
