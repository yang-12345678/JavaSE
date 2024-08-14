package com.yang.demo3annotation;

@MyBook(name = "ymq", age = 18, address = {"北京", "上海"})
//@A(value = "delete")
//@A(value = "delete", hobby = "打篮球")
@A("delete")
public class AnnotationDemo1 {

    @MyBook(name = "ljq", age = 18, address = {"北京", "上海"})
    public static void main(String[] args) {

    }
}
