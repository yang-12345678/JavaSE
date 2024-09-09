package com.yang.date_;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        // 1. 创建一个Date对象，代表系统此刻时间
        Date date = new Date();
        System.out.println(date);

        // 2. 拿到时间毫秒值
        long time = date.getTime();
        System.out.println(time);

        // 3. 把时间毫秒值转换回来
        // 两秒之后的时间
        time += 2 * 1000;
        Date date1 = new Date(time);
        System.out.println(date1);

        // 4. 直接修改日期对象的时间
        Date date2 = new Date();
        date2.setTime(time);
        System.out.println(date2);
    }
}
