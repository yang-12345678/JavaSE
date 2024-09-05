package com.yang.demo1file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\19585\\Nutstore\\1\\Sync\\Files\\实验数据集\\ALLAML.mat");
        System.out.println(f1.length());
        System.out.println(f1.getName());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f1.lastModified());
        System.out.println(f1.getParent());
        System.out.println(f1.getAbsoluteFile());

        File f2 = new File("C:\\Users\\19585\\Nutstore\\1\\Sync\\Files\\实验数据集");
        // 获取目录下一级文件名称
        String[] list = f2.list();
        for (String name : list) {
            System.out.println(name);
        }

        // 获取以及文件对象
        File[] files = f2.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
