package com.yang.demo1collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();

        // 添加元素
        list.add("yang");
        list.add("meng");
        System.out.println(list);

        // 获取集合元素个数
        System.out.println(list.size());

        // 删除集合元素
        list.remove("yang");
        System.out.println(list);

        // 判断集合是否为空
        System.out.println(list.isEmpty());

        // 清空集合
        // list.clear();
        // System.out.println(list);

        // 判断集合中是否存在某个数据
        System.out.println(list.contains("meng"));

        // 把集合转换成数组
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));

        // String[] arr2 = list.toArray(String[]::new); // jdk11
    }
}
