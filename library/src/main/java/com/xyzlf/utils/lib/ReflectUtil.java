package com.xyzlf.utils.lib;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectUtil {
    private static final String TAG = "ReflectUtil";

    @SuppressWarnings({
            "rawtypes", "unchecked"
    })
    public static Object invokeStaticMethod(String clzName, String methodName, Class<?>[] methodParamTypes, Object... methodParamValues) {
        try {
            Class clz = Class.forName(clzName);
            if (clz != null) {
                Method med = clz.getMethod(methodName, methodParamTypes);
                if (med != null) {
                    med.setAccessible(true);
                    Object retObj = med.invoke(null, methodParamValues);
                    return retObj;
                }
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static Object invokeMethod(ClassLoader loader, String clzName,
                                      String methodName, Object methodReceiver,
                                      Class<?>[] methodParamTypes, Object... methodParamValues) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (methodReceiver == null) {
            return null;
        }

        Class clz = Class.forName(clzName, false, loader);
        if (clz != null) {
            Method med = clz.getMethod(methodName, methodParamTypes);
            if (med != null) {
                med.setAccessible(true);
                return med.invoke(methodReceiver, methodParamValues);
            }
        }
        return null;
    }

    public static Object invokeMethod(String clzName, String methodName, Object methodReceiver, Class<?>[] methodParamTypes, Object... methodParamValues) {
        try {
            if (methodReceiver == null) {
                return null;
            }

            Class clz = Class.forName(clzName);
            if (clz != null) {
                Method med = clz.getMethod(methodName, methodParamTypes);
                if (med != null) {
                    med.setAccessible(true);
                    Object retObj = med.invoke(methodReceiver, methodParamValues);
                    return retObj;
                }
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static final Object getStaticField(String clzName, String filedName) {
        try {
            Field field = null;
            Class<?> clz = Class.forName(clzName);
            if (clz != null) {
                field = clz.getField(filedName);
                if (field != null) {
                    return field.get("");
                }
            }
        } catch (Exception e) {
        }

        return null;
    }

    public static final Object getField(String clzName, Object obj, String filedName) {
        try {
            if (obj == null) {
                return null;
            }

            Class<?> clz = Class.forName(clzName);
            if (clz != null) {
                Field field = clz.getField(filedName);
                if (field != null) {
                    return field.get(obj);
                }
            }
        } catch (Exception e) {
        }

        return null;
    }
}
