package org.java.miku;

import org.java.miku.util.SimpleDateUtil;
import org.junit.Test;

import java.util.Date;

public class SimpleDateUtilTest {

    @Test
    public void testGetTimeByZone() {
        System.out.println(SimpleDateUtil.getTimeByZone("GMT+7:00"));
    }

    @Test
    public void testConversionTimeZone() {
        Date date = new Date();
        System.out.println(SimpleDateUtil.conversionTimeZone(date,"GMT+7:00"));
        System.out.println(SimpleDateUtil.conversionTimeZone(date,"GMT+8:00"));
        System.out.println(SimpleDateUtil.conversionTimeZone(date,"GMT+9:00"));
    }
}
