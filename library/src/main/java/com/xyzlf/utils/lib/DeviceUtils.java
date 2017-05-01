package com.xyzlf.utils.lib;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;

public class DeviceUtils {

    private static final String TAG = "DeviceUtils";

    private static final int ANDROID_SDK_VERSION = Build.VERSION.SDK_INT;

    private static final String PRODUCT = Build.PRODUCT.toLowerCase();

    private static final String MODEL = Build.MODEL.toLowerCase();

    // 手机品牌
    private static final String BRAND = Build.BRAND.toLowerCase();

    private static final String MANUFACTURER = Build.MANUFACTURER.toLowerCase();

    private static final String HOST = Build.HOST.toLowerCase();

    private static final String DISPLAY = Build.DISPLAY.toLowerCase();

    private static final String FINGERPRINT = Build.FINGERPRINT.toLowerCase();

    private DeviceUtils() {
    }

    public static boolean isMiuiRom() {
        return FINGERPRINT.contains("miui") || FINGERPRINT.contains("xiaomi") || DeviceUtils.isMiuiV5();
    }

    /**
     * Android 2.3
     * @return boolean
     */
    public static boolean isGingerbread() {
        return ANDROID_SDK_VERSION >= 9;
    }

    /**
     * Android 4.4
     * @return boolean
     */
    public static boolean isKitKat() {
        return ANDROID_SDK_VERSION >= 19;
    }

    /**
     * Android 4.0
     * @return boolean
     */
    public static boolean isIceCreamSandwich() {
        return ANDROID_SDK_VERSION >= 14;
    }

    public static boolean isMeizuM9() {
        return PRODUCT.contains("meizu_m9") && MODEL.contains("m9");
    }

    public static boolean isMeizuMX() {
        return PRODUCT.contains("meizu_mx");
    }

    public static boolean isMeizuMX2() {
        return PRODUCT.contains("meizu_mx2");
    }

    public static boolean isMeizuMX3() {
        return PRODUCT.contains("meizu_mx3");
    }

    public static boolean isMeizu() {
        return PRODUCT.contains("meizu");
    }

    public static boolean isGTN7100WithMokeeRom() {
        return MODEL.contains("gt-n7100") && HOST.contains("mokee");
    }

    public static boolean isMiOne() {
        return MODEL.startsWith("mi-one");
    }

    /**
     * 小米2
     * @return boolean
     */
    public static boolean isMi2() {
        return "mi 2".equalsIgnoreCase(MODEL);
    }

    public static boolean isGalaxyS4() {
        return "samsung".equalsIgnoreCase(MANUFACTURER) && "gt-i9500".equalsIgnoreCase(MODEL);
    }

    public static boolean isHuawei() {
        return MODEL != null && MODEL.contains("huawei");
    }

    public static boolean isHuaweiP6() {
        return MODEL.contains("huawei") && MODEL.contains("p6");
    }

    public static boolean isHuaweiP6forForAndroidM() {
        return MODEL.equalsIgnoreCase("PE-UL00") && Build.VERSION.SDK_INT >= 23; // android6.0 & p6
    }

    public static boolean isHuaweiMate7() {
        return MODEL.contains("huawei") && MODEL.contains("mt7");
    }

    public static boolean isHuaweiP7() {
        return MODEL.contains("huawei") && MODEL.contains("p7");
    }

    /**
     * Hua wei Honor 6 plus
     * @return boolean
     */
    public static boolean isHuaweiHonor6Plus() {
        return FINGERPRINT.toLowerCase().contains("huawei") && MODEL.toLowerCase().contains("pe-ul00");
    }

    public static boolean isZTE() {
        return "zte".equals(BRAND);
    }

    public static boolean isHtcDevice() {
        return MODEL.contains("htc") || MODEL.contains("desire");
    }

    public static boolean isLephoneDevice() {
        return PRODUCT.contains("lephone");
    }

    public static boolean isZTEU880() {
        return "zte".equals(MANUFACTURER) && "blade".contains(MODEL);
    }

    public static boolean isZTEUV880() {
        return "zte".equals(MANUFACTURER) && MODEL.contains("zte-u v880");
    }

    public static boolean isZTEU950() {
        return "zte".equals(MANUFACTURER) && MODEL.contains("zte u950");
    }

    public static boolean isZTEU985() {
        return "zte".equals(MANUFACTURER) && MODEL.contains("zte u985");
    }

    public static boolean isHTCHD2() {
        return "htc".equals(MANUFACTURER) && MODEL.contains("hd2");
    }

    public static boolean isHTCOneX() {
        return "htc".equals(MANUFACTURER) && MODEL.contains("htc one x");
    }


    public static boolean isHtc802W() {
        return "htc".equals(MANUFACTURER) && "htc 802w".equals(MODEL);
    }

    public static boolean isVIVO() {
        return ("BBK".equalsIgnoreCase(MANUFACTURER) || "vivo".equalsIgnoreCase(MANUFACTURER)) && MODEL != null && MODEL.contains("vivo");
    }

    public static boolean isVIVOS9() {
        return "BBK".equalsIgnoreCase(MANUFACTURER) && "vivo S9".equalsIgnoreCase(MODEL);
    }

    public static boolean isI9100() {
        return "samsung".equals(MANUFACTURER) && "gt-i9100".equals(MODEL);
    }

    public static boolean isGtS5830() {
        return "gt-s5830".equalsIgnoreCase(MODEL);
    }

    public static boolean isGtS5830i() {
        return "gt-s5830i".equalsIgnoreCase(MODEL);
    }

    public static boolean isGtS5838() {
        return MODEL.startsWith("gt-s5838");
    }

    public static boolean isSMG9008W() {
        return "sm-g9008w".equalsIgnoreCase(MODEL);
    }

    public static boolean isGTP1000() {
        return "gt-p1000".equalsIgnoreCase(MODEL);
    }

    public static boolean isMb525() {
        return MODEL.startsWith("mb525");
    }

    public static boolean isMe525() {
        return MODEL.startsWith("me525");
    }

    public static boolean isMb526() {
        return MODEL.startsWith("mb526");
    }

    public static boolean isMe526() {
        return MODEL.startsWith("me526");
    }

    public static boolean isMe860() {
        return MODEL.startsWith("me860");
    }

    public static boolean isMe865() {
        return MODEL.startsWith("me865");
    }

    public static boolean isXT882() {
        return MODEL.startsWith("xt882");
    }

    public static boolean isYulong() {
        return "yulong".equalsIgnoreCase(MANUFACTURER);
    }

    public static boolean isKindleFire() {
        return MODEL.contains("kindle fire");
    }

    public static boolean isLGP970() {
        return MODEL.startsWith("lg-p970");
    }

    public static boolean isU8800() {
        return MODEL.startsWith("u8800");
    }

    public static boolean isU9200() {
        return MODEL.startsWith("u9200");
    }

    public static boolean isMt15i() {
        return MODEL.startsWith("mt15i");
    }

    public static boolean isDEOVOV5() {
        return "deovo v5".equalsIgnoreCase(MODEL);
    }

    public static boolean isMilestone() {
        return "milestone".equalsIgnoreCase(MODEL);
    }

    public static boolean isMilestoneXT720() {
        return "milestone xt720".equalsIgnoreCase(MODEL);
    }

    public static boolean isXT702() {
        return "xt702".equalsIgnoreCase(MODEL);
    }

    public static boolean isC8500() {
        return "c8500".equalsIgnoreCase(MODEL);
    }

    public static boolean isAmoiN807() {
        return "amoi n807".equalsIgnoreCase(MODEL);
    }

    public static boolean isE15I() {
        return "e15i".equalsIgnoreCase(MODEL);
    }

    public static boolean isZTE_CN600() {
        return "zte-c n600".equalsIgnoreCase(MODEL);
    }

    /**
     * 判断是否 Android 3.0 以下
     * @return boolean
     */
    public static boolean isApiLvlLess11() {
        return ANDROID_SDK_VERSION < 11;
    }

    /**
     * 判断是否 Android 4.1
     *
     * @return boolean
     */
    public static boolean isApiLevel16() {
        return ANDROID_SDK_VERSION >= 16;
    }

    public static boolean isApiLevel10() {
        return ANDROID_SDK_VERSION == 10;
    }

    public static boolean isHoneycomb() {
        return ANDROID_SDK_VERSION >= 11 && ANDROID_SDK_VERSION < 14;
    }

    public static boolean isAndroidL() {
        return ANDROID_SDK_VERSION == 21;
    }

    public static boolean isAndroidLPlus() {
        return ANDROID_SDK_VERSION >= 21;
    }

    public static boolean isMiuiV5() {
        return "V5".equalsIgnoreCase(getMiuiVersionName());
    }

    public static boolean isMiuiV6() {
        return "V6".equalsIgnoreCase(getMiuiVersionName());
    }

    public static String getMiuiVersionName() {
        String miuiVersionName = "";
        try {
            Object obj = ReflectUtil.invokeStaticMethod("android.os.SystemProperties", "get", new Class[]{
                    String.class}, new Object[]{"ro.miui.ui.version.name"});
            if (obj instanceof String) {
                miuiVersionName = (String) obj;
            }
        } catch (Exception e) {
            return "";
        }
        return miuiVersionName;
    }

    /**
     * 判断华为Emotion UI-1.6
     *
     * @return boolean
     */
    public static boolean isEmotionUI16() {
        return "EmotionUI_1.6".equalsIgnoreCase(getHuaweiEmotionVersion());
    }

    /**
     * 判断华为Emotion UI-2.3
     *
     * @return boolean
     */
    public static boolean isEmotionUI23() {
        return "EmotionUI_2.3".equalsIgnoreCase(getHuaweiEmotionVersion()) || getDisplayForEmotionUI().contains("emui2.3");
    }

    public static boolean isCmOS() {
        String version = System.getProperty("ro.build.host");
        if (TextUtils.isEmpty(version)) {
            version = Build.HOST;
        }
        return !TextUtils.isEmpty(version) && version.contains("cyanogenmod");
    }

    /**
     * 获取华为版本信息
     * @return String
     */
    public static String getHuaweiEmotionVersion() {
        String emotionVersionName = "";
        try {
            Object obj = ReflectUtil.invokeStaticMethod("android.os.SystemProperties", "get", new Class[]{
                    String.class
            }, new Object[]{"ro.build.version.emui"});
            if (obj instanceof String) {
                emotionVersionName = (String) obj;
            }
        } catch (Exception e) {
            return "";
        }

        return emotionVersionName;
    }

    public static String getDisplayForEmotionUI() {
        return DISPLAY == null ? "" : DISPLAY;
    }

    public static boolean isOppo() {
        return "oppo".equals(MANUFACTURER);
    }

    public static boolean isOppoFind7() {
        return "oppo".equals(MANUFACTURER) && ("x9070".equals(MODEL) || "x9077".equals(MODEL));
    }

    /**
     * Meizu model
     *
     * @return boolean
     */
    public static boolean isMeizuModel() {
        if ("meizu_m9".equalsIgnoreCase(Build.MODEL) || "m9".equalsIgnoreCase(Build.MODEL) || "meizu mx".equalsIgnoreCase(Build.MODEL) || "mx".equalsIgnoreCase(Build.MODEL)
                || "m030".equalsIgnoreCase(Build.MODEL) || "m031".equalsIgnoreCase(Build.MODEL) || "m032".equalsIgnoreCase(Build.MODEL) || "m040".equalsIgnoreCase(Build.MODEL)
                || "m045".equalsIgnoreCase(Build.MODEL) || "m351".equalsIgnoreCase(Build.MODEL) || "m353".equalsIgnoreCase(Build.MODEL) || "m355".equalsIgnoreCase(Build.MODEL)
                || "m356".equalsIgnoreCase(Build.MODEL) || "MX4".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /**
     * Lenovo z90-7
     * @return boolean
     */
    public static boolean isLenovoZ90Minus7() {
        return "lenovo z90-7".equals(MODEL);
    }

    /**
     * 魅族Note 5.1
     * @return boolean
     */
    public static boolean isMZ5Point1() {
        return ANDROID_SDK_VERSION == 22 && PRODUCT.equals("m2 note") && FINGERPRINT.contains("m2note:5.1");
    }

    /**
     * 乐视超级手机1 pro
     * @return boolean
     */
    public static boolean isLeTVPro1() {
        return ANDROID_SDK_VERSION == 21 && PRODUCT.equals("乐视超级手机1 pro");
    }

    /**
     * 魅族1 Note 1
     * @return boolean
     */
    public static boolean isMZ1Note22() {
        return Build.VERSION.SDK_INT == 22
                && Build.PRODUCT.toLowerCase().equals("m1 note")
                && Build.FINGERPRINT.toLowerCase().contains("m1note:5.1");
    }

    /**
     * 三星 N9006
     * @return boolean
     */
    public static boolean isSamSungN9006() {
        return Build.VERSION.SDK_INT == 21
                && Build.PRODUCT.equalsIgnoreCase("h3gzc")
                && Build.MODEL.equalsIgnoreCase("sm-n9006");
    }

    public static boolean isXiaoMi() {
        return BRAND.equals("xiaomi");
    }

    /**
     * Qiku QiJianBan
     * @return boolean
     */
    public static boolean isQikuQiJian() {
        return PRODUCT.equalsIgnoreCase("cp8692")
                && MODEL.equalsIgnoreCase("8692-A00")
                && MANUFACTURER.equalsIgnoreCase("qiku");
    }

    public static boolean isQikuOs6() {
        return PRODUCT.equalsIgnoreCase("qk8692")
                && MODEL.equalsIgnoreCase("8692-A00")
                && MANUFACTURER.equalsIgnoreCase("qiku")
                && ANDROID_SDK_VERSION >= 23;
    }

    public static boolean isCoolPad5219() {
        return MODEL.equals("coolpad 5219");
    }

    public static boolean isSonyEricsson() {
        return MODEL.equals("mk16i") && ANDROID_SDK_VERSION == 10
                && MANUFACTURER.equals("sony ericsson");
    }

    public static boolean isHuaweiH60101() {
        return PRODUCT.equals("h60-l01") && ANDROID_SDK_VERSION == 19
                && MANUFACTURER.equals("huawei");
    }

    public static boolean isSamsungI9082i() {
        return MODEL.equals("gt-i9082i") && ANDROID_SDK_VERSION == 16
                && MANUFACTURER.equals("samsung");
    }

    public static boolean isHtcD516D() {
        return PRODUCT.equals("d516d") && ANDROID_SDK_VERSION == 18
                && MANUFACTURER.equals("htc");
    }

    /**
     * 输入设备信息
     * @param c context
     */
    public static void printDisplayInfo(Context c) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\nANDROID_SDK_VERSION:").append(ANDROID_SDK_VERSION).append("\n");
        sb.append("PRODUCT:").append(PRODUCT).append("\n");
        sb.append("MODEL:").append(MODEL).append("\n");
        sb.append("BRAND:").append(BRAND).append("\n");
        sb.append("MANUFACTURER:").append(MANUFACTURER).append("\n");
        sb.append("HOST:").append(HOST).append("\n");
        sb.append("DISPLAY:").append(DISPLAY).append("\n");
        sb.append("FINGERPRINT:").append(FINGERPRINT).append("}");
        Log.d(TAG, sb.toString());
    }
}
