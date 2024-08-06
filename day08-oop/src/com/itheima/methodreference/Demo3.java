package com.itheima.methodreference;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {
    public static void main(String[] args) {
        // 需求：有一个字符串数组，里面有一些人的名字，请按照名字的首字母升序排序
        String[] names = {"Tom", "Andy", "Mike", "Boby", "Dlei", "Rose", "caocao"};

        // Arrays.sort(names );  // 默认就是按照首字母的编号升序排序
        // 要求：忽略首字母的大小进行升序排序

//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);  // java 自己提供了两个字符串比较的方法
//            }
//        });

//        Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));

        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));
    }
}
