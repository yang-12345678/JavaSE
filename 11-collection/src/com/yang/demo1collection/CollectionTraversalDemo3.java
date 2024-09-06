package com.yang.demo1collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalDemo3 {
    public static void main(String[] args) {
        // 迭代器遍历
        Collection<String> names = new ArrayList<>();
        names.add("张无忌");
        names.add("杨晓");
        names.add("赵敏");
        names.add("张三丰");

        // 1. 获取这个集合的迭代器对象
        Iterator<String> it = names.iterator();
        // 默认站在第一位，取出这个数据并移到下一位,取不出则抛异常
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());

        // 2. 使用一个 while 循环来遍历
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }
}
