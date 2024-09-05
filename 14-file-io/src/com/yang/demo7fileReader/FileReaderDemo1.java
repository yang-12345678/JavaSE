package com.yang.demo7fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo1 {
    public static void main(String[] args) {

        try (
                // 1. 创建文件字符输入流与源文件接通
                Reader fr = new FileReader("14-file-io/src/com/yang/b.txt")
        ) {
            // 2. 定义一个字符数组，每次读多个字符
            char[] chs = new char[1024];
            int len;  // 用于记录每次读了多少个字符
            while ((len = fr.read(chs)) != -1) {
                // 3. 每次读取多个字符，并把字符数组转换成字符串输出
                String str = new String(chs, 0, len);
                System.out.println(str);
            }
            // 拓展：文件字符输入流每次读取多个字符，性能较好，而且读取中文
            // 是按照字符读取的，不会出现乱码！这是一种读取中文很好的方案
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
