package com.yang.demo3annotation;

// 自定义注解
public @interface MyBook {
    String name();
    int age() default 19;
    String[] address();
}
