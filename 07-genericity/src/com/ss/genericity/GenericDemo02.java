package com.ss.genericity;

public class GenericDemo02 {
    public static void main(String[] args) {
        // 学会自定义泛型类
        // MyArrayList<String> list = new MyArrayList<String>();
        MyArrayList<String> list = new MyArrayList<>();  // JDK7 开始支持
        list.add("A");
        list.add("hello world");

        list.remove("A");
        System.out.println(list);
    }
}
