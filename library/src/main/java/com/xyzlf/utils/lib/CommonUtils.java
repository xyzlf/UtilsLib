
package com.xyzlf.utils.lib;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;

public class CommonUtils {

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
