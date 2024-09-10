package com.yang.demo1create;

public class ThreadDemo2 {
    public static void main(String[] args) {
        // 3. 创建线程任务类的对象代表一个线程任务
        Runnable mr = new MyRunnable();
        // 4. 把线程任务交个一个线程对象来处理
        Thread t1 = new Thread(mr);
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
        }
    }
}

// 1. 定义一个线程任务类实现 Runnable 接口
class MyRunnable implements Runnable {

    // 2. 重写 run方法
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出：" + i);
        }
    }
}