package com.jdd.kit.util;

import android.content.Context;



/**
 * Created by SkyEyes9 on 2015/12/24.
 * 吐司工具类
 */
public class ToastUtil {
    public static void toast(Context context, String info) {
        android.widget.Toast.makeText(context, info, android.widget.Toast.LENGTH_SHORT).show();
    }


    public static void toastL(Context context,String info) {
        android.widget.Toast.makeText(context, info, android.widget.Toast.LENGTH_LONG)
                .show();
    }
}
