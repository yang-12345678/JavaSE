package com.yang.demo2list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("yang");
        names.add("meng");
        names.add("qi");
        System.out.println(names);

        // 给第三个位置插入一个数据
        names.add(2, "赵敏");
        System.out.println(names);

        // 删除某个位置
        System.out.println(names.remove(1));
        System.out.println(names);

        // 修改某个位置
        System.out.println(names.set(2, "杨"));
        System.out.println(names);

        // 获取元素
        System.out.println(names.get(0);
    }
}
