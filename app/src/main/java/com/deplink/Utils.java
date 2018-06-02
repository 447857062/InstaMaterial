package com.deplink;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by ${kelijun} on 2018/6/2.
 */

public class Utils {
    private static int screenWidth=0;
    private static int screenHeight=0;
    public static int dpToPx(int dp){
        return (int) (dp* Resources.getSystem().getDisplayMetrics().density);
    }
    public static boolean isAndroid5(){
        return Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP;
    }
    public static  int getScreenWidth(Context c){
        if(screenWidth==0){
            WindowManager windowManager= (WindowManager) c.getSystemService(Context.WINDOW_SERVICE);
            Display display=windowManager.getDefaultDisplay();
            Point size=new Point();
            display.getSize(size);
            screenWidth=size.x;
        }
        return screenWidth;
    }
    public static  int getScreenHeight(Context c){
        if(screenHeight==0){
            WindowManager windowManager= (WindowManager) c.getSystemService(Context.WINDOW_SERVICE);
            Display display=windowManager.getDefaultDisplay();
            Point size=new Point();
            display.getSize(size);
            screenHeight=size.y;
        }
        return screenHeight;
    }
}
