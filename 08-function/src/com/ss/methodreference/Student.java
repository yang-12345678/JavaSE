package com.ss.methodreference;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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

    public static int compareByAge(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }

    public int compareByHeight(Student s1, Student s2) {
        return Double.compare(s1.getHeight(), s2.getHeight());
    }
}
