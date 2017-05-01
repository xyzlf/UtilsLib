package com.xyzlf.utils.lib;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeUtil {

    /**
     * @param time System.currentTimeMillis()
     * @return yyyy-MM-dd HH:mm
     */
    public static String getTimeStr(long time) {
        SimpleDateFormat mDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        if (time <= 0) {
            return null;
        }
        return mDateFormat.format(new Date(time));
    }

    /**
     * @param time System.currentTimeMillis()
     * @return yyyyMMddHHmmss
     */
    public static String getTimeStrNoDivide(long time) {
        SimpleDateFormat mDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault());
        if (time <= 0) {
            return null;
        }
        return mDateFormat.format(new Date(time));
    }

    /**
     * @param time System.currentTimeMillis()
     * @return yyyyMMdd
     */
    public static String getTimeStrYmd(long time) {
        SimpleDateFormat mDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        if (time <= 0) {
            return null;
        }
        return mDateFormat.format(new Date(time));
    }
}
