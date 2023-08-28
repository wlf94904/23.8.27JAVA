package com.haha.homework;

/**
 * @author hhm
 * @version 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.common();
        tang.passRiver();

        tang.common();
        tang.passRiver();
        tang.passRiver();
        tang.passRiver();
        //过火焰山
        tang.passFireHill();
    }
}
