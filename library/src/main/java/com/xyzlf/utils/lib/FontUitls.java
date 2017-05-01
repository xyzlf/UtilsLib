
package com.xyzlf.utils.lib;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;

public class FontUitls {

    private static HashMap<String, Typeface> sFontCache = new HashMap<String, Typeface>();

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
