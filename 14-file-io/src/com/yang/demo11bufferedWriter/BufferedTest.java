package com.yang.demo11bufferedWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BufferedTest {
    public static void main(String[] args) {

        try (
                // 1. 创建一个字符缓冲流对象
                BufferedReader br = new BufferedReader(new FileReader("14-file-io/src/com/yang/csb.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("14-file-io/src/com/yang/csb2.txt"));
        ) {
            // 2. 提前准备一个 List 集合存储每段内容
            List<String> data = new ArrayList<>();
            // 3. 按行读取数据，存入到 data 集合中去
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }

            // 排序
            Collections.sort(data);
            System.out.println(data);

            // 遍历集合，将每段内容写入到目标文件中
            for (String s : data) {
                bw.write(s);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
