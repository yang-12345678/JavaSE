package com.yang.system_;

public class SystemTest {
    public static void main(String[] args) {
        // 1. 终止 java 虚拟机
        // 按照惯例，非零状态码表示异常终止
        // System.exit(0);  // 人为终止

        // 2. 获取当前系统时间，毫秒值
        long time = System.currentTimeMillis();
        System.out.println(time);

        for (int i = 0; i < 100000; i++) {
            System.out.println("输出了" + i);
        }

        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time)/1000.0 + "s");
    }
}
