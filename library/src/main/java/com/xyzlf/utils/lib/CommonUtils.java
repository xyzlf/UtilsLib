
package com.xyzlf.utils.lib;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;

public class CommonUtils {

    // 使用此方法打开外部activity,避免外部activity不存在而造成崩溃
    public static boolean startActivity(Context context, Intent intent) {
        boolean bResult = true;
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            bResult = false;
        } catch (Exception e) {
            bResult = false;
        }
        return bResult;
    }

    // 使用此方法打开外部activity,避免外部activity不存在而造成崩溃
    public static boolean startActivity(Context context, Class<?> c) {
        boolean result = true;
        try {
            Intent intent = new Intent(context, c);
            context.startActivity(intent);
        } catch (ActivityNotFoundException exception) {
            result = false;
            exception.printStackTrace();
        } catch (Exception e) {
            result = false;
            e.printStackTrace();
        }
        return result;
    }

    public static boolean isUiThread() {
        return Thread.currentThread().equals(Looper.getMainLooper().getThread());
    }

}
