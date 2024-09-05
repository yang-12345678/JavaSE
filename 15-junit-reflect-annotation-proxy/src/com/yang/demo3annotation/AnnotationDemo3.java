package com.yang.demo3annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationDemo3 {
    // 解析注解
    @Test
    public void parseClass() throws Exception {
        // 1. 获取类对象
        Class c1 = Demo.class;
        // 2. 判断这个类上是否添加了注解
        if (c1.isAnnotationPresent(MyTest2.class)) {
            // 3. 获取注解对象
            MyTest2 myTest2 = (MyTest2) c1.getDeclaredAnnotation(MyTest2.class);
            // 4. 获取注解属性值
            String[] address = myTest2.address();
            double height = myTest2.height();
            String value = myTest2.value();

            // 5. 打印
            System.out.println(Arrays.toString(address));
            System.out.println(height);
            System.out.println(value);
        }
    }

    @Test
    public void parseMethod() throws Exception {
        // 1. 获取类对象
        Class c1 = Demo.class;
        // 2. 获取方法对象
        Method method = c1.getMethod("go");
        if(method.isAnnotationPresent(MyTest2.class)) {
            MyTest2 myTest2 = (MyTest2) method.getDeclaredAnnotation(MyTest2.class);
            String[] address = myTest2.address();
            double height = myTest2.height();
            String value = myTest2.value();
            System.out.println(Arrays.toString(address));
            System.out.println(height);
            System.out.println(value);
        }
    }
}
