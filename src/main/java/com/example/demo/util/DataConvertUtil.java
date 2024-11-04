package com.example.demo.util;

import com.example.demo.util.bean.IStaticTimeZone;
import com.example.demo.util.bean.TimeZoneThreadLocal;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;

public class DataConvertUtil {


    /**
     * 将时间转换为时间戳
     */
    public static long dateToStamp(Date date) {
        try {
            return date.getTime();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * 将字符串yyyy-MM-dd HH:mm:ss转换为时间戳(Ftp转换用)
     */
    public static long stringToTimeStampFtp(String strDate, String strTime) {
        if (ToolUtil.isNotEmpty(strDate) && ToolUtil.isNotEmpty(strTime)) {
            try {
                String resTime = "";
                if (Objects.equals(strTime.length(), 5)) {
                    resTime = "0" + strTime.substring(0, 1) + ":" + strTime.substring(1, 3) + ":00";
                } else {
                    resTime = strTime.substring(0, 2) + ":" + strTime.substring(2, 4) + ":00";
                }
                String resDate = strDate.substring(0, 4) + "-" + strDate.substring(4, 6) + "-" + strDate.substring(6, 8) + " " + "" + resTime;
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = format.parse(resDate);
                return dateToStamp(date);
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        } else {
            return 0;
        }
    }

    /**
     * 将字符串yyyy-MM-dd HH:mm:ss转换为时间戳(Ftp转换用)
     */
    //public static long stringToTimeStampFtp(String strDate, String strTime, String timeZone) {
    //    if (ToolUtil.isNotEmpty(strDate) && ToolUtil.isNotEmpty(strTime)) {
    //        try {
    //            String resTime = "";
    //            if (Objects.equals(strTime.length(), 5)) {
    //                resTime = "0" + strTime.substring(0, 1) + ":" + strTime.substring(1, 3) + ":00";
    //            } else {
    //                resTime = strTime.substring(0, 2) + ":" + strTime.substring(2, 4) + ":00";
    //            }
    //            String resDate = strDate.substring(0, 4) + "-" + strDate.substring(4, 6) + "-" + strDate.substring(6, 8) + " " + "" + resTime;
    //            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //            Date date = format.parse(resDate);
    //            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    //            if (ToolUtil.isEmpty(timeZone)) {
    //                timeZone = IStaticTimeZone.CHINA_TIME_ZONE;
    //            }
    //            ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of(timeZone));
    //            return zonedDateTime.toEpochSecond() * DateTimeKit.SECOND_MS;
    //        } catch (Exception e) {
    //            e.printStackTrace();
    //            return 0;
    //        }
    //    } else {
    //        return 0;
    //    }
    //}

    /**
     * 将字符串yyyy-MM-dd HH:mm:ss转换为时间戳
     */
    public static long stringToTimeStamp(String str) {
        if (ToolUtil.isNotEmpty(str)) {
            try {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                format.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
                Date date = format.parse(str);
                return date.getTime();
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        } else {
            return 0;
        }
    }

    /**
     * 将时间戳转换为带时区的时间戳
     */
    public static long LongToTimeLong(Long str) {
        if (ToolUtil.isNotEmpty(str)) {
            try {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = new Date(str);
                String res = format.format(date);
                return stringToTimeStamp(res,"yyyy-MM-dd HH:mm:ss");
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        } else {
            return 0;
        }
    }


    /**
     * 将字符串转换为时间戳 timeType为时间格式
     */
    public static long stringToTimeStamp(String str, String timeType) {
        if (ToolUtil.isNotEmpty(str)) {
            try {
                SimpleDateFormat format = new SimpleDateFormat(timeType);
                format.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
                Date date = format.parse(str);
                return date.getTime();
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        } else {
            return 0;
        }
    }

    /**
     * 将字符串转换为时间戳 timeType为时间格式
     */
    public static long stringToTimeStamp(String str, String timeType, String timeZone) {
        if (ToolUtil.isNotEmpty(str)) {
            try {
                SimpleDateFormat format = new SimpleDateFormat(timeType);
                if (ToolUtil.isEmpty(timeZone)) {
                    timeZone = "GMT+8:00";
            } else {
                timeZone = timeZone.replace("UTC", "GMT");
            }
            format.setTimeZone(TimeZone.getTimeZone(timeZone));
            Date date = format.parse(str);
                return date.getTime();
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        } else {
            return 0;
        }
    }

    public static long ftpStringToTimeStamp(String str, String timeZone) {
        if (ToolUtil.isNotEmpty(str)) {
            try {
                String timeType = "yyyyMMdd";
                if (str.length() > 8) {
                    timeType = "yyyyMMddHHmmss";
                }
                SimpleDateFormat format = new SimpleDateFormat(timeType);
                format.setTimeZone(TimeZone.getTimeZone(timeZone));
                Date date = format.parse(str);
                return date.getTime();
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        } else {
            return 0;
        }
    }


    /**
     * 将时间戳转换为日期字符串
     */
    public static String stampToString(long time) {
        try {
            if (0L == time) {
                return "";
            }
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            format.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
            Date date = new Date(time);
            return format.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    /**
     * 将时间戳转换为无符号日期字符串
     */
    public static String stampToUnsignedString(long time) {
        try {
            if (0L == time) {
                return "";
            }
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            format.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
            Date date = new Date(time);
            return format.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 将时间戳转换为日期字符串
     */
    public static String stampToString(Long time) {
        if (time == null) {
            return "";
        }
        return stampToString(time.longValue());
    }
    /**
     * 将时间戳转换为无符号日期字符串
     */
    public static String stampToUnsignedString(Long time) {
        if (time == null) {
            return "";
        }
        return stampToUnsignedString(time.longValue());
    }

    /**
     * 将时间戳转换为日期字符串  timeType为时间格式
     */
    public static String stampToString(long time, String timeType) {
        try {
            SimpleDateFormat format = new SimpleDateFormat(timeType);
            format.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
            Date date = new Date(time);
            return format.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 将时间戳转换为日期字符串  timeType为时间格式,
     */
    public static String stampToString(Long time, String timeType, String timeZone) {

        if(time == null){
            return "";
        }
        if(Objects.equals(0L,time)){
            return "";
        }
        try {
            if (ToolUtil.isEmpty(timeZone)) {
                timeZone = "GMT+8:00";
            } else {
                timeZone = timeZone.replace("UTC", "GMT");
            }
            SimpleDateFormat format = new SimpleDateFormat(timeType);
            format.setTimeZone(TimeZone.getTimeZone(timeZone));
            Date date = new Date(time);
            return format.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    /**
     * 将时间戳转换为日期字符串  timeType为时间格式
     */
    public static String stampToString(Long time, String timeType) {
        if (time == null) {
            return "";
        }
        if (0L == time) {
            return "";
        }
        return stampToString(time.longValue(),timeType);
    }


    /**
     * 时间转换前台显示工具类
     */
    //public static String stampToTime(Object object) {
    //    if (ToolUtil.isEmpty(object) || Objects.equals(Convert.toLong(object), 0L)) {
    //        return "";
    //    } else {
    //        return DateUtil.stampToDate(Convert.toLong(object));
    //    }
    //}

    /**
     * 时间差值转换
     */
    //public static String timeResult(Object object) {
    //    if (ToolUtil.isNotEmpty(object)) {
    //        BigDecimal temp = Convert.toBigDecimal(object).subtract(Convert.toBigDecimal(IStaticTimeUnits.HOUR));
    //        //保留2位小数
    //        temp.setScale(2);
    //        return Convert.toStr(temp);
    //    } else {
    //        return "";
    //    }
    //}

    /**
     * 获取用户自定义时区
     */
    public static String getTimeZone() {
        String timeZone;
        if (ToolUtil.isEmpty(TimeZoneThreadLocal.getTimeZone())) {
            timeZone = IStaticTimeZone.CHINA_TIME_ZONE;
            TimeZoneThreadLocal.setTimeZone(timeZone);
        } else {
            timeZone = TimeZoneThreadLocal.getTimeZone();
        }
        return timeZone.replace("UTC", "GMT");
    }

    /**
     * 获取用户自定义时区
     */
    public static String getTimeZone(String timeZone) {
        if (ToolUtil.isEmpty(TimeZoneThreadLocal.getTimeZone())) {
            TimeZoneThreadLocal.setTimeZone(timeZone);
        } else {
            timeZone = TimeZoneThreadLocal.getTimeZone();
        }
        return timeZone.replace("UTC", "GMT");
    }

    /**
     * 得到n天之后的日期
     *
     * @param days
     * @return
     */
    public static String getAfterDayDate(String days,String format) {
        int daysInt = Integer.parseInt(days);

        Calendar canlendar = Calendar.getInstance(); // java.util包
        canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
        Date date = canlendar.getTime();

        SimpleDateFormat sdfd = new SimpleDateFormat(format);
        String dateStr = sdfd.format(date);

        return dateStr;
    }

    /**
     * 将时间戳带自定义时区转换为日期字符串  timeType为时间格式
     */
    public static String stampToStringByMyTimezone(long time, String timeType, String timezone) {
        try {
            SimpleDateFormat format = new SimpleDateFormat(timeType);
            String replaceTimezone = timezone.replace("UTC", "GMT");
            format.setTimeZone(TimeZone.getTimeZone(replaceTimezone));
            Date date = new Date(time);
            return format.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 将毫秒转换为时分秒
     * @param ltime
     * @return
     * @author yuanchao
     */
    public static String secToTime(Long ltime) {
        String timeStr="";
        if(ToolUtil.isNotEmpty(ltime)){
            int time = Integer.parseInt(ltime + "") / 1000;
            int hour = 0;
            int minute = 0;
            int second = 0;
            if (time <= 0)
                return "00:00:00";
            else {
                minute = time / 60;
                if (minute < 60) {
                    second = time % 60;
                    timeStr = "00:" + unitFormat(minute) + ":" + unitFormat(second);
                } else {
                    hour = minute / 60;
                    if (hour > 99)
                        return "99:59:59";
                    minute = minute % 60;
                    second = time - hour * 3600 - minute * 60;
                    timeStr = unitFormat(hour) + ":" + unitFormat(minute) + ":" + unitFormat(second);
                }
            }
        }
        return timeStr;
    }
    public static String unitFormat(int i) {
        String retStr = null;
        if (i >= 0 && i < 10) {
            retStr = "0" + Integer.toString(i);
        } else {
            retStr = "" + i;
        }
        return retStr;
    }

}

