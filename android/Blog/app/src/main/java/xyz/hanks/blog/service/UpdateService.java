package xyz.hanks.blog.service;

import android.app.DownloadManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Environment;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.RemoteViews;

import xyz.hanks.blog.R;

public class UpdateService extends Service {


    // 通知栏
    private NotificationManager updateNotificationManager = null;
    private Notification updateNotification = null;

    private RemoteViews remoteViews;// 状态栏通知显示的view
    private CompleteReceiver completeReceiver;

    /**
     * 后台下载
     *
     * @param context
     * @param apkUrl  下载地址
     */
    public static void update(Context context, String apkUrl) {
        Intent intent = new Intent(context, UpdateService.class);
        intent.putExtra("url", apkUrl);
        context.startService(intent);
    }

    @Override public IBinder onBind(Intent intent) {
        return null;
    }


    @Override public int onStartCommand(Intent intent, int flags, int startId) {

        String url = intent.getStringExtra("url");

        if (!TextUtils.isEmpty(url)) {


            completeReceiver = new CompleteReceiver();
            /** register download success broadcast **/
            registerReceiver(completeReceiver,
                    new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));


            DownloadManager downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
            request.setTitle(getString(R.string.app_name) + ".apk");
            request.setDescription("正在下载新版本安装包");
            request.setAllowedOverRoaming(false);

            request.setVisibleInDownloadsUi(true);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);

            request.setDestinationInExternalFilesDir(getApplicationContext(), Environment.DIRECTORY_DOWNLOADS, "apk");
            downloadManager.enqueue(request);
        }
        return super.onStartCommand(intent, flags, startId);
    }


    @Override public void onDestroy() {
        if (completeReceiver != null) {
            unregisterReceiver(completeReceiver);
        }
        super.onDestroy();

    }

    class CompleteReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent != null && DownloadManager.ACTION_DOWNLOAD_COMPLETE.equals(intent.getAction())) {
                long completeDownloadId = intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1);
                stopSelf();
            }
        }
    }

}
