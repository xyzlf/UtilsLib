
package com.xyzlf.utils.lib;

import android.content.Context;
import android.graphics.Typeface;
import android.util.ArrayMap;

public class FontUitls {

    private static ArrayMap<String, Typeface> sFontCache = new ArrayMap<String, Typeface>();

    public static Typeface getFont(Context context, String name) {
        Typeface tf = sFontCache.get(name);
        if (tf == null) {
            try {
                tf = Typeface.createFromAsset(context.getAssets(), "fonts/" + name);
            } catch (Exception ignore) {
            }
            sFontCache.put(name, tf);
        }
        if (tf == null) {
            tf = Typeface.DEFAULT;
        }
        return tf;
    }
}
