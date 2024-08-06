package com.itheima.lambda;

import com.itheima.innerclass.Student;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("殷素素", 35, 171.5, '女');
        students[1] = new Student("杨幂", 28, 168.5, '女');
        students[2] = new Student("张无忌", 25, 181.5, '男');
        students[3] = new Student("小昭", 19, 165.5, '女');
        students[4] = new Student("赵敏", 27, 167.5, '女');
        students[5] = new Student("刘亦菲", 36, 168, '女');

//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();  // 按照年龄升序
//            }
//        });

//        Arrays.sort(students, (Student s1, Student s2) -> {
//            return s1.getAge() - s2.getAge();
//        });

//        Arrays.sort(students, (s1,s2) -> {
//            return s1.getAge() - s2.getAge();
//        });

        Arrays.sort(students, (s1, s2) -> s1.getAge() - s2.getAge());


        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }
}

