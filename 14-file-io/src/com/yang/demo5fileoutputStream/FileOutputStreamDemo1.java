package com.yang.demo5fileoutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // 1. 创建文件字节输出流管道与目标文件接通
        // FileOutputStream os = new FileOutputStream("14-file-io/src/com/yang/b.txt");  // 覆盖管道
        FileOutputStream os = new FileOutputStream("14-file-io/src/com/yang/b.txt", true);  // 追加数据

        // 2. 写入数据
        os.write(97);
        os.write('b');
        os.write('徐');  // 会乱码

        // 3. 写一个字节数组出去
        byte[] bytes = "我爱你中国666".getBytes();
        os.write(bytes);
        os.write("\r\n".getBytes());

        // 4. 写一个字节数组的一部分出去
        os.write(bytes, 0, 3);

        os.close();

    }
}
