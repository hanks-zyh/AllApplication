package xyz.hanks.blog.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;

/**
 * Created by hanks on 16/1/24.
 */
public class ApkUtils {

    public static void checkUpdate(Context context){
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        //getCurrentVersion
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        int currentVersionCode = preferences.getInt("versionCode", 0);
        new Thread(){
            @Override public void run() {

            }
        }.start();
        //getLastestVersion

        //showTip


    }
}
