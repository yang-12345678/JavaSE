package com.yang.demo2reflect;

public class ReflectDemo2 {
    @Test
    public void getClassInfo() {
        // 1. 反射第一步，获取Clas对象，代表拿到类
        Class c1 = Student.class;
        System.out.println(c1.getName());  // 类的全类名 com.yang.demo2reflect.Student
        System.out.println(c1.getSimpleName());  // 类名 Student

        // 2. 获取类的构造器对象，并对其进行操作
    }
}
