package com.study.jing.myapplication;

import android.util.Log;

/**
 * Created by jing on 2016/2/25.
 */
public class LogUtils {
    public static boolean isLog = false;
    public static void Log(String msg){
        if (isLog){
            Log.i("Kevin",msg);
        }
    }
}
