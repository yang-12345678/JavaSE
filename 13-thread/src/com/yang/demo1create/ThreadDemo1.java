package com.yang.demo1create;

public class ThreadDemo1 {
    // main 方法本身是由一条主线程负责推荐执行的
    public static void main(String[] args) {
        // 创建线程方式一：继承 Thread 类
        // 4. 创建线程类的对象，代表线程
        Thread t1 = new Mythread();
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
        }
    }
}

// 1. 定义一个子类继承Thread类，成为一个线程类
class Mythread extends Thread{
    // 2. 重写Thread类的run方法
    @Override
    public void run() {
        // 3. 编写线程的任务代码
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出：" + i);
        }
    }
}