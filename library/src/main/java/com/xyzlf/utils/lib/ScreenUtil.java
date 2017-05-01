package com.xyzlf.utils.lib;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

import java.lang.reflect.Field;

public class ScreenUtil {

    /**
     * @param context context
     * @return
     */
    public static int getScreenWidth(Context context) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return dm.widthPixels;
    }

    /**
     * @param context context
     * @return
     */
    public static int getScreenHeight(Context context) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return dm.heightPixels;
    }

    public static int getStatusBarHeight(Activity activity) {
        int statusBarHeight;
        Rect rectgle = new Rect();
        Window window = activity.getWindow();
        window.getDecorView().getWindowVisibleDisplayFrame(rectgle);
        statusBarHeight = rectgle.top;
        window.findViewById(Window.ID_ANDROID_CONTENT).getTop();

        if (statusBarHeight <= 0) {
            statusBarHeight = getStatusBarHeight2(activity.getApplicationContext());
        }
        return statusBarHeight;
    }

    /**
     * @param context context
     * @return int
     */
    private static int getStatusBarHeight2(Context context) {
        int statusBarHeight = -1;
        try {
            Class<?> cl = Class.forName("com.android.internal.R$dimen");
            Object obj = cl.newInstance();
            Field field = cl.getField("status_bar_height");

            int x = Integer.parseInt(field.get(obj).toString());
            statusBarHeight = context.getResources().getDimensionPixelSize(x);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statusBarHeight;
    }

}
