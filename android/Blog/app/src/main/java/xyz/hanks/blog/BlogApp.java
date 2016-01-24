package xyz.hanks.blog;

import android.app.Application;
import android.content.Context;

/**
 * Created by hanks on 16/1/25.
 */
public class BlogApp extends Application {

    private static BlogApp sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    public static Context getInstance() {
        return sInstance;
    }
}
