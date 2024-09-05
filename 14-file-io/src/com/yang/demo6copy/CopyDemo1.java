package com.yang.demo6copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyDemo1 {
    public static void main(String[] args) throws Exception {
        File source = new File("D:\\test.txt");
        File target = new File("d:\\test\\test.txt");
        copyFile(source, target);
    }

    public static void copyFile(File source, File target) throws Exception {
        FileInputStream is = new FileInputStream(source);
        FileOutputStream os = new FileOutputStream(target);

        byte[] buffer = new byte[3];

        int len;

        while((len = is.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }

        System.out.println("复制成功");
        is.close();
        os.close();

    }
}
