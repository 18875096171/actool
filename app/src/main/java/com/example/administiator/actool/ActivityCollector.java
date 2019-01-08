package com.example.administiator.actool;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * author: Administiator
 * date:2019/1/8
 * descriptin:退出功能
 */

public class ActivityCollector {
  private   static List<Activity> activities = new ArrayList<Activity>();

    public static  void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void reMoveActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void fishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
        activities.clear();
    }
}
