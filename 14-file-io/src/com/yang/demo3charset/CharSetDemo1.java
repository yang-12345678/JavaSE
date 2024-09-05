package com.yang.demo3charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 实现字符的编码和解码
        // 1. 编码
        String name = "我爱你中国123";

        // byte[] bytes = name.getBytes();// 平台默认编码
        byte[] bytes = name.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        // 2. 解码
        String gbk = new String(bytes, "GBK");
        System.out.println(gbk);
    }
}
