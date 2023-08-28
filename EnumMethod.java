package com.haha.enum_;

import java.sql.SQLOutput;

/**
 * @author hhm
 * @version 1.0
 * 演示Enum类的各种方法的使用
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Season2枚举类，来演示各种方法
        Season2 autumn=Season2.AUTUMN;
        //输出枚举对象的名称
        System.out.println(autumn.name());
        //ordinal()输出的是该枚举对象的次序/编号，从0开始编号
        //AUTUMN枚举对象是 第三个，所以输出2
        System.out.println(autumn.ordinal());
        //从反编译可以看到values方法，返回Season2[]
        //含有定义的所有枚举对象
        Season2[] values = Season2.values();
        System.out.println("====遍历取出枚举对象（增强for）====");
        for(Season2 season:values){//增强for循环
            System.out.println(season);
        }

        //valueOf：将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常
        //执行流程
        //1.根据你输入的“AUTUMN"到Season2的枚举对象去查找
        //2.如果找到了就返回，否则报错
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1="+autumn1);
        System.out.println(autumn==autumn1);

        //compareTo:比较两个枚举常量，比较的就是编号
        //1.把Season2.AUTUMN枚举对象的编号和Season2.SUMMER枚举对象的编号进行比较
        //Season2.AUTUMN的编号[2]-Season2.SUMMER的编号[3]
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));


        //补充增强for
//        int[] nums={1,3,9};
//        //普通的for循环
//        System.out.println("====普通的for====");
//        for(int i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }
//        System.out.println("====增强的的for====");
//        for(int i:nums){//执行流程：依次从nums数组中取出数据，赋给i，如果取出完毕，则退出for
//            System.out.println("i="+i);
//        }

    }
}
