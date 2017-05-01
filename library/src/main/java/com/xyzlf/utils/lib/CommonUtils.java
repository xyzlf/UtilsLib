
package com.xyzlf.utils.lib;

import android.os.Looper;

public class CommonUtils {

    public static boolean isUiThread() {
        return Thread.currentThread().equals(Looper.getMainLooper().getThread());
    }

}
