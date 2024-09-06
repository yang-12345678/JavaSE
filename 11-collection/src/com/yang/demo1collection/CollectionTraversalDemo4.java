package com.yang.demo1collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalDemo4 {
    public static void main(String[] args) {
        // 增强for遍历
        Collection<String> names = new ArrayList<>();
        names.add("张无忌");
        names.add("杨晓");
        names.add("赵敏");
        names.add("张三丰");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
