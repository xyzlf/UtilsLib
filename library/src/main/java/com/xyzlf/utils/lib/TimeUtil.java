package com.xyzlf.utils.lib;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeUtil {

    //得到时间戳
    public static String getTimeStr(long time) {
        SimpleDateFormat mDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        if (time <= 0) {
            return null;
        }
        return mDateFormat.format(new Date(time));
    }

    //得到时间戳
    public static String getTimeStrNoDivide(long time) {
        SimpleDateFormat mDateFormat = new SimpleDateFormat("MMddHHmmss", Locale.getDefault());
        if (time <= 0) {
            return null;
        }
        return mDateFormat.format(new Date(time));
    }

    //得到时间戳
    public static String getTimeStrYmd(long time) {
        SimpleDateFormat mDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        if (time <= 0) {
            return null;
        }
        return mDateFormat.format(new Date(time));
    }

    public static String getDateFormat(long timeMillis) {
        if (timeMillis <= 0)
            return "";
        SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
        return sf.format(timeMillis);
    }

}
