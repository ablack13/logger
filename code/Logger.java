package com.onebit.logger;

import android.os.Build;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by scijoker on 08.10.15.
 */
public class Logger {
    private static boolean DEBUG = true;

    public static void d(String tag, String arg) {
        if (isDebugEnable()) {
            Log.d(tag, arg);
        }
    }

    public static void d(String logMsg) {
        if (isDebugEnable()) {
            d(getCurrentClassName(), getCurrentMethodName() + "(): " + logMsg);
        }
    }

    public static void dd(String tag, JSONObject jsonObject) {
        if (isDebugEnable()) {
            try {
                format(tag, jsonObject.toString(2));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public static void dd(String tag, Object source) {
        if (!isDebugEnable()) {
            return;
        }
        if (containsJsonStr(source)) {
            try {
                dd(tag, new JSONObject(source.toString()).toString(2));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            format(tag, source);
        }
    }

    private static String getSplitter(int length) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append("-");
        }
        return builder.toString();
    }

    private static void format(String tag, Object source) {
        tag = " " + tag + " ";
        d(" ", " ");
        d(" ", getSplitter(50) + tag + getSplitter(50));
        d(" ", "" + source);
        d(" ", getSplitter(100 + tag.length()));
        d(" ", " ");
    }

    private static String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[4].getMethodName();
    }

    private static String getCurrentClassName() {
        String className = Thread.currentThread().getStackTrace()[4].getClassName();

        String[] temp = className.split("[\\.]");
        className = temp[temp.length - 1];
        return className;
    }

    private static boolean containsJsonStr(Object test) {
        try {
            new JSONObject(test.toString());
        } catch (JSONException ex) {
            try {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    new JSONArray(test);
                }
            } catch (JSONException ex1) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDebugEnable() {
        return DEBUG;
    }

    public static void setEnable(boolean flag) {
        Logger.DEBUG = flag;
    }
}
