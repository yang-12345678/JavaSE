package com.yang.calendar_;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        // 1. 获取当前时间对应的日期对象
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        // 2. 获取日历中的某个信息
        int year = now.get(Calendar.YEAR);
        System.out.println(year);
        int month = now.get(Calendar.MONTH);
        System.out.println(month + 1);
        int day = now.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);

        // 3. 获取日期中记录的日期对象
        Date d = now.getTime();
        System.out.println(d);

        // 4. 拿到时间毫秒值
        long time = now.getTimeInMillis();
        System.out.println(time);

        // 5. 修改日历中的某个信息
        now.set(Calendar.MONTH, 10 - 1);
        System.out.println(now);

        // 6. 为某个信息增加或者减少
        now.add(Calendar.DAY_OF_YEAR, 10);
        now.add(Calendar.DAY_OF_YEAR, -10);
    }
}
