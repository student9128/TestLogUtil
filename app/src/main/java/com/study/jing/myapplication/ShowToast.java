package com.study.jing.myapplication;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by jing on 2016/2/25.
 */
public class ShowToast {

    public static void showToast(Context context,String text){
        Toast toast = null;
        if (toast == null){
           toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        }
        toast.setText(text);
        toast.show();

    }
}
