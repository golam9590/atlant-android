package com.frostchein.atlant.utils;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

public class ScreenUtils {

  public static int getWidth(Context context) {
    Display display = createWindowManager(context).getDefaultDisplay();
    Point size = new Point();
    display.getSize(size);
    return size.x;
  }

  public static int getHeight(Context context) {
    Display display = createWindowManager(context).getDefaultDisplay();
    Point size = new Point();
    display.getSize(size);
    return size.y;
  }

  private static WindowManager createWindowManager(Context context) {
    return (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
  }

  public static int getStatusBarHeight(Context context) {
    int result = 0;
    int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
    if (resourceId > 0) {
      result = context.getResources().getDimensionPixelSize(resourceId);
    }
    return result;
  }

}
