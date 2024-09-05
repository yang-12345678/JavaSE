package com.yang.demo2reflect;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class SaveObjectFrameWork {
    // 保存任意对象的静态方法
    public static void saveObject(Object obj) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("junit-reflect-annotation-proxy/src/obj.txt", true));
        // 只有反射可以知道对象有多少字段
        Class c = obj.getClass();
        String simpleName = c.getSimpleName();
        ps.println("==========" + simpleName + "==========");
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            String fieldValue = field.get(obj) + "";
            ps.println(name + "=" + fieldValue);
        }
        ps.close();
    }
}
