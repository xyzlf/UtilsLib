package com.xyzlf.utils.lib;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkUtil {

    public static boolean isNetworkConnected(Context context) {
        if (context != null) {
            try {
                ConnectivityManager mConnectivityManager = (ConnectivityManager) context
                        .getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
                if (mNetworkInfo != null) {
                    return mNetworkInfo.isAvailable();
                }
            } catch (Exception ignore) {
            }
        }
        return false;
    }

    /**
     * WiFi 是否已经连接
     */
    public static boolean isWifiConnected(Context c) {
        NetworkInfo networkInfo = null;
        try {
            ConnectivityManager connecManager = (ConnectivityManager) c.getApplicationContext().getSystemService(
                    Context.CONNECTIVITY_SERVICE);
            networkInfo = connecManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        } catch (Exception ex) {
            //java.lang.NullPointerException
            //   at android.os.Parcel.readException(Parcel.java:1333)
            //   at android.os.Parcel.readException(Parcel.java:1281)
            //   at android.net.IConnectivityManager$Stub$Proxy.getNetworkInfo(IConnectivityManager.java:830)
            //   at android.net.ConnectivityManager.getNetworkInfo(ConnectivityManager.java:387)
        }
        if (networkInfo != null) {
            return networkInfo.isConnected();
        } else {
            return false;
        }
    }

}
