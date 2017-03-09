package com.xyzlf.utils.lib;

import android.content.Context;
import android.util.Base64;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;

/**
 * Created by zhanglifeng
 */
public class RSAUtil {

    /**
     * 得到公钥
     *
     * @throws NoSuchAlgorithmException
     * @throws Exception
     */
    private static PublicKey getPublicKeyFromX509(String algorithm, String bysKey) throws Exception {
        byte[] decodeKey = Base64.decode(bysKey, Base64.DEFAULT);
        X509EncodedKeySpec x509 = new X509EncodedKeySpec(decodeKey);
        KeyFactory keyFactory = KeyFactory.getInstance(algorithm);
        return keyFactory.generatePublic(x509);
    }

    /**
     * 使用公钥加密
     */
    public static String encryptByPublic(Context context, String content, String keyFileName) {
        try {
            String pubKey = getPublicKeyFromAssets(context, keyFileName);
            PublicKey publicKey = getPublicKeyFromX509("RSA", pubKey);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] plaintext = content.getBytes();
            byte[] output = cipher.doFinal(plaintext);

            return Base64.encodeToString(output, Base64.DEFAULT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 从assets文件中获取公钥
     */
    private static String getPublicKeyFromAssets(Context context, String keyFileName) {
        try {
            InputStreamReader inputReader = new InputStreamReader(context
                    .getResources().getAssets().open(keyFileName));
            BufferedReader bufReader = new BufferedReader(inputReader);
            String line;
            String Result = "";
            while ((line = bufReader.readLine()) != null) {
                if (line.charAt(0) == '-') {
                    continue;
                }
                Result += line;
            }
            return Result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
