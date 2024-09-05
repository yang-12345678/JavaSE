package com.yang.demo4fileinputStream;

import java.io.FileInputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // 1. 创建文件字节输入流管道与源文件接通
        // FileInputStream id  = new FileInputStream(new File("14-file-io\\src\\com\\yang\\a.txt"));
        FileInputStream id  = new FileInputStream("14-file-io\\src\\com\\yang\\a.txt");

        // 2. 读取文件中的字节并输出：每次读取一个字节
        // 定义一个变量，记住每次读取的一个字节
        int b;
        while ((b = id.read()) != -1) {
            System.out.print((char) b);
        }

        // 每次读取一个字节的问题：性能较差，读取汉字输出一定会乱码

    }
}
