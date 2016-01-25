package xyz.hanks.blog.util;

import com.socks.library.KLog;

import xyz.hanks.blog.BuildConfig;

/**
 * log管理
 * Created by hanks on 16/1/25.
 */
public class LogUtils {
    private static final String TAG = "zyhLog";
    public static boolean showLog = BuildConfig.SHOW_LOG; // 是否需要打印bug，可以在application的onCreate函数里面初始化

    /**
     * 打印catch的异常信息
     *
     * @param e
     */
    public static void logE(Exception e) {
        if (showLog) {
            e.printStackTrace();
        }
    }

    // 下面四个是默认tag的函数
    public static void i(String msg) {
        if (showLog) KLog.i(msg);
    }

    public static void d(String msg) {
        if (showLog) KLog.d(msg);
    }

    public static void e(String msg) {
        if (showLog) KLog.e(msg);
    }

    public static void v(String msg) {
        if (showLog) KLog.v(msg);
    }

    // 下面是传入自定义tag的函数
    public static void i(String tag, String msg) {
        if (showLog) KLog.i(tag, msg);
    }

    public static void d(String tag, String msg) {
        if (showLog) KLog.i(tag, msg);
    }

    public static void e(String tag, String msg) {
        if (showLog) KLog.i(tag, msg);
    }

    public static void v(String tag, String msg) {
        if (showLog) KLog.i(tag, msg);
    }
}
