package com.coolweather.android;

import android.app.Activity;

/**
 * Created by A555L on 2018/12/28.
 */

public class Windowstyle {
    public static int getStateBarHeight(Activity a) {
        int result = 0;
        int resourceId = a.getResources().getIdentifier("status_bar_height",
                "dimen", "android");
        if (resourceId > 0) {
            result = a.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
}
