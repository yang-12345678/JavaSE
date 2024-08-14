package com.yang.demo3annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo4 {
    public static void main(String[] args) throws Exception {

        // 模拟 Junit

        AnnotationDemo4  ad = new AnnotationDemo4();

        Class c = AnnotationDemo4.class;
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTest.class)) {
                method.invoke(ad);
            }
        }
    }
    @MyTest
    public void test1() {
        System.out.println("Test1方法执行了");
    }

//    @MyTest
    public void test2() {
        System.out.println("Test2方法执行了");
    }

    @MyTest
    public void test3() {
        System.out.println("Test3方法执行了");
    }
    @MyTest
    public void test4() {
        System.out.println("Test4方法执行了");
    }
}
