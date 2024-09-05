package com.yang.demo8fileWriter;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterDemo1 {
    public static void main(String[] args) {
        // 1. 创建一个字符输出流对象
        try (
                // 覆盖管道
                // Writer fw = new FileWriter("14-file-io/src/com/yang/c.txt")
                Writer fw = new FileWriter("14-file-io/src/com/yang/c.txt", true)
        ) {
            // 写一个字符出去
            fw.write('a');
            fw.write(98);
            fw.write('杨');
            fw.write("\r\n");

            // 写一个字符串出去
            fw.write("hello world");
            fw.write("你好");
            fw.write("\r\n");

            // 写一个字符串的一部分
            fw.write("java", 1, 2);
            fw.write("\r\n");

            // 写一个字符数组出去
            char[] chars = "java".toCharArray();
            fw.write(chars);
            fw.write("\r\n");

            // 写字符数组的一部分
            fw.write(chars, 1, 2);
            fw.write("\r\n");

            fw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
