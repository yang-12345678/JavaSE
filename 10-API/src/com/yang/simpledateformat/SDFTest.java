package com.yang.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SDFTest {
    public static void main(String[] args) throws ParseException {
        // 1. 准备一些时间
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        // 2. 格式化日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
//        System.out.println(sdf.format(d));
        System.out.println(sdf.format(time));

        // 解析字符串时间，成为日期对象
        String dateStr = "2022-12-12 12:12:11";
        // 1. 创建简单日期格式化对象，指定的时间格式必须与被解析的时间格式一摸一样，否则会出 bug
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf2.parse(dateStr);
        System.out.println(parse);

    }
}
