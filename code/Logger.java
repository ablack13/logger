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

    public static void d(String tag, String arg) {
        Log.d(tag, arg);
    }

    public static void dd(String tag, Object source) {
        if (isJSONValid(source)) {
            try {
                format(tag, new JSONObject(source.toString()).toString(2));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            format(tag, source);
        }
    }

    private static void format(String tag, Object source) {
        tag = " " + tag + " ";
        d(" ", " ");
        d(" ", getSplitter(50) + tag + getSplitter(50));
        d(" ", "" + source);
        d(" ", getSplitter(100 + tag.length()));
        d(" ", " ");
    }

    private static String getSplitter(int length) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append("-");
        }
        return builder.toString();
    }

    private static boolean isJSONValid(Object test) {
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
}
