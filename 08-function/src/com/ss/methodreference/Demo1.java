package com.ss.methodreference;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("殷素素", 35, 171.5, '女');
        students[1] = new Student("杨幂", 28, 168.5, '女');
        students[2] = new Student("张无忌", 25, 181.5, '男');
        students[3] = new Student("小昭", 19, 165.5, '女');
        students[4] = new Student("赵敏", 27, 167.5, '女');
        students[5] = new Student("刘亦菲", 36, 168, '女');

//        Arrays.sort(students, (s1, s2) -> s1.getAge() - s2.getAge());

//        Arrays.sort(students, (s1, s2) -> Student.compareByAge(s1, s2));

        Arrays.sort(students, Student::compareByAge);


    }
}
