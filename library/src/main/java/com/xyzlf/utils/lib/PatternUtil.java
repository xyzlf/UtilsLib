package com.xyzlf.utils.lib;

import android.text.TextUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhanglifeng on 2016/8/26.
 * 正则表达式工具类
 * Pattern util
 */

public class PatternUtil {

    /**
     * Number
     */
    public static final String PATTERN_NUMERIC = "^[0-9]+\\.{0,1}[0-9]{0,8}$";

    /**
     * digit
     * @param str numeric string
     * @return boolean
     */
    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(PATTERN_NUMERIC);
        if (null != pattern) {
            Matcher matcher = pattern.matcher(str);
            return matcher.matches();
        }
        return false;
    }

    public static final String PATTERN_COLOR = "^#[0-9a-fA-F]{6}$";
    public static final String PATTERN_COLOR2 = "^#[0-9a-fA-F]{8}$";

    /**
     * color
     * @param colorStr color string
     * @return boolean
     */
    public static boolean isColorValid(String colorStr) {
        if (TextUtils.isEmpty(colorStr)) {
            return false;
        }
        Pattern pattern = Pattern.compile(PATTERN_COLOR);
        if (pattern != null) {
            Matcher matcher = pattern.matcher(colorStr);
            if (matcher.matches()) {
                return true;
            }
        }

        Pattern pattern2 = Pattern.compile(PATTERN_COLOR2);
        if (pattern2 != null) {
            Matcher matcher = pattern2.matcher(colorStr);
            if (matcher.matches()) {
                return true;
            }
        }

        return false;
    }

    public static final String PATTERN_EMAIL = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";

    /**
     * email
     *
     * @param email
     * @return
     */
    public static boolean isEmailValid(String email) {
        if (TextUtils.isEmpty(email)) {
            return false;
        }
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
        if (null != pattern) {
            Matcher mc = pattern.matcher(email);
            return mc.matches();
        }
        return false;
    }


}
