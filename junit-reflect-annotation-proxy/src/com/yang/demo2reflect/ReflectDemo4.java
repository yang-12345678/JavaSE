package com.yang.demo2reflect;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        // 体会反射的作用
        Dog dog = new Dog("小黑", 3);
        Student student = new Student("小明", 19, "吃饭");
        Teacher teacher = new Teacher("小红", 19, 3000, "422期", '女', "123412412");

        SaveObjectFrameWork.saveObject(dog);
        SaveObjectFrameWork.saveObject(student);
        SaveObjectFrameWork.saveObject(teacher);
    }
}
