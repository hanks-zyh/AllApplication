package xyz.hanks.blog;

import android.app.Application;
import android.content.Context;
import android.os.StrictMode;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Application类
 * Created by hanks on 16/1/25.
 */
public class BlogApp extends Application {

    private static BlogApp sInstance;

    public static Context getInstance() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        //严格模式
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectCustomSlowCalls()// API等级11，使用StrictMode.noteSlowCode
                .detectDiskReads()
                .detectDiskWrites()
                .detectNetwork()
                .penaltyLog()
                .penaltyFlashScreen()// API等级11
                .build());

        //自定义字体
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/AvenirLTStd-Medium.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }

}
