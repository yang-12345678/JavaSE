package com.yang.demo4fileinputStream;

import java.io.FileInputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        // 1. 创建文件字节输入流管道与源文件接通
        // FileInputStream id  = new FileInputStream(new File("14-file-io\\src\\com\\yang\\a.txt"));
        FileInputStream id  = new FileInputStream("14-file-io\\src\\com\\yang\\a.txt");

        // 2. 读取文件中的字节并输出：每次读取多个字节
        // 定义一个字节数组用于每次读取字节
        byte[] buffer = new byte[3];
        // 定义一个变量记住每次读取了多少字节
        int len;
        while( (len = id.read(buffer)) != -1 ) {
            // 3. 把读取到的字节数组转换成字符串输出, 读取多少，倒出多少
            String str = new String(buffer, 0, len);
            System.out.print(str);
        }
        // 拓展：每次读取多个字节，性能得到提升，因为每次读取多个字节，可以减少硬盘和内存的交互次数，从而提升性能
        // 依然无法避免读取汉字输出乱码的问题：存在汉字字节截断的可能

    }
}
