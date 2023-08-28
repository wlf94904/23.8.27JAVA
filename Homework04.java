package com.haha.homework;

/**
 * @author hhm
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        //1.匿名内部类是
        /*
        new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },同时也是一个对象
        他的编译类型ICalculate，他的运行类型就是匿名内部类
         */
        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },10,8);

        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1*n2;
            }
        },10,8);

    }
}
//编写接口
interface ICalculate{
    //work方法是完成计算
    //该方法完成怎样的计算，交给匿名内部类完成
    public double work(double n1,double n2);
}
class Cellphone{
    //当调用testWork方法时，直接传入一个实现了ICalculate接口的匿名内部类
    //该匿名内部类，可以灵活的实现work，完成不同的计算任务
    public void testWork(ICalculate iCalculate,double n1,double n2){
        double result=iCalculate.work(n1,n2);//动态绑定
        System.out.println("计算结果="+result);
    }
}