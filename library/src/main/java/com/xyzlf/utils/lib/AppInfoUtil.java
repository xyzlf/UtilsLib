package com.xyzlf.utils.lib;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

public class AppInfoUtil {

    public static String getVersionName(Context context) {
        String result = "";
        if (null != context) {
            try {
                PackageInfo info = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                result = info.versionName;
            } catch (NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static boolean isPackageInstalled(Context context, String pkgName) {
        PackageInfo packageInfo = null;
        if (context == null || TextUtils.isEmpty(pkgName)) {
            return false;
        }
        try {
            packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(pkgName, 0);
        } catch (NameNotFoundException e) {
        }
        return packageInfo != null;
    }

}
