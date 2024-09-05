package com.yang.demo2recursion;

import java.io.File;

public class FileSearchTest4 {
    public static void main(String[] args) {
        File dir = new File("c:/");
        searchFile(dir);
    }

    public static void searchFile(File dir) {

        if (dir == null || !dir.exists() || dir.isFile()) {
            return;
        }

        File[] files = dir.listFiles();

        if (files != null && files.length > 0) {

            for (File file : files) {
                // 判断当前目录下是否存在一级文件对象，存在才可以遍历
                if (file.isFile()) {
                    if ("QQ.exe".equals(file.getName())) {
                        System.out.println("找到了");
                        System.out.println(file.getAbsolutePath());
                        return;
                    }
                } else {
                    searchFile(file);
                }
            }

        }
    }
}
