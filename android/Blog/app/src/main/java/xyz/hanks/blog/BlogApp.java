package xyz.hanks.blog;

import android.app.Application;
import android.content.Context;
import android.os.StrictMode;

/**
 * Created by hanks on 16/1/25.
 */
public class BlogApp extends Application {

    private static BlogApp sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectCustomSlowCalls()// API等级11，使用StrictMode.noteSlowCode
                .detectDiskReads()
                .detectDiskWrites()
                .detectNetwork()
                .penaltyLog()
                .penaltyFlashScreen()// API等级11
                .build());
    }

    public static Context getInstance() {
        return sInstance;
    }
}
