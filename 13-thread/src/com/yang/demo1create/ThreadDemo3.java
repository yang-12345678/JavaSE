package com.yang.demo1create;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) {
        // 3. 创建一个Callable接口的实现类对象
        Callable<String> c1 = new MyCallable(100);
        // 4. 把Callable对象封装成一个真正的线程任务对象FutureTask对象
        /**
         * 未来任务对象的作用？
         *  a. 本质是一个Runnable线程任务对象，可以交给Thread线程对象处理
         *  b. 可以获取线程执行完毕后的结果
         */
        FutureTask<String> f1 = new FutureTask<>(c1);
        // 5. 把FutureTask对象作为参数传递给Thread线程对象
        Thread thread = new Thread(f1);
        // 6. 启动线程
        thread.start();

        Callable<String> c2 = new MyCallable(50);
        FutureTask<String> f2 = new FutureTask<>(c2);
        Thread thread2 = new Thread(f2);
        thread2.start();

        // 获取线程执行完毕后的结果
        try {
            // 如果主线程发现第一个线程还没有执行完毕，会让出CPU，等第一个线程执行完毕后，才会往下执行
            System.out.println(f1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            // 如果主线程发现第二个线程还没有执行完毕，会让出CPU，等第一个线程执行完毕后，才会往下执行
            System.out.println(f2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

// 1. 定义一个实现类实现 Callable 接口
class MyCallable implements Callable<String> {

     private int n;
     public MyCallable(int n) {
         this.n = n;
     }

     // 2. 实现 call 方法，定义线程执行体
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "子线程1-" + n + "的和是：" + sum;
    }
}