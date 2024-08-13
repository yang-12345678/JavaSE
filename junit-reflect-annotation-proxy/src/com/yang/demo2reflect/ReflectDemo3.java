package com.yang.demo2reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception{
        // 反射的基本作用
        // 1. 类的全部成分的获取
        // 2. 可以破坏封装性
        // 3. 可以绕过泛型的约束
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("令狐冲");
//        list.add(1);
        // 泛型约束工作在编译时，反射机制工作在运行时
        Class c1 = list.getClass();  // c1 = ArrayList.class
        // 获取 ArrayList 类的 add 方法
        Method add = c1.getDeclaredMethod("add", Object.class);
        add.setAccessible(true);
        add.invoke(list, 9.0);
        add.invoke(list, true);
        System.out.println(list);
    }
}
