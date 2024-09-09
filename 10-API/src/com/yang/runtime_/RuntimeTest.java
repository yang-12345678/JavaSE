package com.yang.runtime_;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();

        // 可用处理器数
        System.out.println(r.availableProcessors());
        // Java虚拟机的内存总量
        System.out.println(r.totalMemory() / 1024 / 1024);
        // Java虚拟机可用内存
        System.out.println(r.freeMemory() / 1024 / 1024);
        // 启动某个程序
        Process p = r.exec("QQ");
        p.destroy(); // 销毁、关闭程序

    }
}
