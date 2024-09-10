package com.yang.demo1create;

public class ThreadDemo2_2 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程输出：" + i);
                }
            }
        };
        Thread t1 = new Thread(r);
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程输出：" + i);
                }
            }
        }).start();
    }
}
