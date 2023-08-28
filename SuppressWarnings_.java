package com.haha.annotation_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hhm
 * @version 1.0
 */
public class SuppressWarnings_ {
    //1.当不希望看到警告的时候，可以使用SuppressWarnings来抑制警告信息
    //2.在{""}中可以写入希望抑制（不显示）的警告信息
    //3.SuppressWarnings的作用范围是和你放置的位置相关
    //比如@SuppressWarnings放在main方法，则抑制警告的范围就是main方法
    //通常可以放在具体的语句/方法/类
    //4.看看@SuppressWarnings的源码
    //（1）放置的位置就是TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE
    //（2）该注解类有数组String[] value()设置一个数组比如{"rawtypes","unchecked","unused"}
    /*
    @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
public @interface SuppressWarnings {

    String[] value();
}
     */
    @SuppressWarnings({"rawtypes","unchecked","unused"})
    public static void main(String[] args) {
          List list=new ArrayList();
          list.add("jack");
          list.add("tom");
          list.add("mary");
          int i;
        System.out.println(list.get(1));
    }

//    public f1(){
//        List list=new ArrayList();
//        list.add("jack");
//        list.add("tom");
//        list.add("mary");
//        int i;
//        System.out.println(list.get(1));
//    }
}
