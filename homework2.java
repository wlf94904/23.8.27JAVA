package com.haha.homework;

/**
 * @author hhm
 * @version 1.0
 */
public class homework2 {
    public static void main(String[] args) {

    }
}
class Frock{
    private static int currentNum=100000;
    private int serialNumber;

    public Frock() {
        serialNumber=getNextNum();
    }

    public static int getNextNum(){
        currentNum +=100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
class TestFrock{
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock = new Frock();//序列号是100300
        Frock frock1 = new Frock();//序列号是100400
        Frock frock2 = new Frock();//序列号是100500
        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());

    }
}
