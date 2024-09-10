package com.yang.demo1create;

public class ThreadApiDemo4 {
    public static void main(String[] args) {
        Thread t1 = new Mythread1("1号线程");
//        t1.setName("1号线程");
        t1.start();
        System.out.println(t1.getName());  // 线程默认名称：Thread-索引

        Mythread1 t2 = new Mythread1();
        t2.setName("2号线程");
        t2.start();
        System.out.println(t2.getName());

        // 哪个谁调用这个代码，这个代码就拿到哪个线程
        Thread m = Thread.currentThread(); // 主线程
        m.setName("主线程");
        System.out.println(m.getName());  // main

    }
}

class Mythread1 extends Thread {

    public Mythread1(String name) {
        super(name);
    }

    public Mythread1() {}

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "子线程输出：" + i);
        }
    }

}