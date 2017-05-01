package com.xyzlf.utils.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.text.TextUtils;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by j-zhanglifeng-ncf on 2017/5/1.
 */

public class FileUtil {

    /**
     * save the Bitmap to SDCard
     *
     * @param context context
     * @param bitmap  bitmap
     * @return filePath
     */
    public static String saveBitmapToSDCard(Context context, Bitmap bitmap) {
        if (null == context) {
            return null;
        }
        if (null == bitmap) {
            return null;
        }
        //SDCard is valid
        if (!isSDCardMounted()) {
            return null;
        }
        String filePath = null;
        File externalFilesDir = context.getExternalFilesDir(null);
        String dir = null;
        if (null != externalFilesDir) {
            dir = externalFilesDir.getAbsolutePath();
        }
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(dir)) {
            if (!dir.endsWith(File.separator)) {
                filePath = dir + File.separator + packageName + File.separator + System.currentTimeMillis() + ".jpg";
            } else {
                filePath = dir + packageName + File.separator + System.currentTimeMillis() + ".jpg";
            }
            try {
                File file = new File(filePath);
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();

                FileOutputStream outputStream = new FileOutputStream(file);
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
                outputStream.flush();
                outputStream.close();
            } catch (Exception e) {
                ToastUtil.showToast(context, e.getMessage(), true);
            }
        }
        return filePath;
    }

    /**
     * SD卡是否挂载
     * @return booolean
     */
    public static boolean isSDCardMounted() {
        return Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState());
    }


}
