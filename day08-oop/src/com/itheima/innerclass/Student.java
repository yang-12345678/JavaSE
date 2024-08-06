package com.itheima.innerclass;


import lombok.Data;

@Data
public class Student {
    private String name;
    private int age;
    private double height;
    private char sex;

    public Student(String name, int age, double height, char sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.sex = sex;
    }
}
