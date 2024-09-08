package com.yang.demo1collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionTraversalDemo5 {
    public static void main(String[] args) {
        // Lambda
        Collection<String> names = new ArrayList<>();
        names.add("张无忌");
        names.add("杨晓");
        names.add("赵敏");
        names.add("张三丰");

//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        names.forEach(s -> System.out.println(s));
        // out 是一个打印对象，实力方法引用
        names.forEach(System.out::println);
    }
}
