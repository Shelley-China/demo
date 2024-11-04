package com.example.demo.util.bean;

public class TimeZoneThreadLocal {
    private static final ThreadLocal<String> timeZone = new ThreadLocal<>();
    public static void setTimeZone(String timeZoneCode) {
        timeZone.set(timeZoneCode);
    }
    public static String getTimeZone() {
        return timeZone.get();
    }
    public static void delTimeZone() {timeZone.remove();
    }
}
