package org.java.miku.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * 对时间进行处理
 */
public class SimpleDateUtil {


    private static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    /**
     * 获取当前时间戳
     * @return
     */
    public static long getCurrentTimeStamp() {
        return System.currentTimeMillis();
    }

    /**
     * 获取任意时区的时间
     */
    public static String getTimeByZone(String timeZone) {
        TimeZone var1 = TimeZone.getTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
        simpleDateFormat.setTimeZone(var1);
        return simpleDateFormat.format(new Date());
    }

    /**
     * 将时间转换为指定时区的时间
     * @param time 当前时间
     * @param timeZone 指定的时区
     * @return
     */
    public static String conversionTimeZone(Date time,String timeZone) {
        TimeZone var1 = TimeZone.getTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
        simpleDateFormat.setTimeZone(var1);
        return simpleDateFormat.format(time);
    }
}
