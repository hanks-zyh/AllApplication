package xyz.hanks.blog.service;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import xyz.hanks.blog.R;

/**
 * Created by hanks on 16/2/15.
 */
public class UpdateService extends Service {


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
        try {
            if (intent != null) {
                String url = intent.getStringExtra("url");
                if (!TextUtils.isEmpty(url)) {
                    new DownloadFileAsync().execute(url);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @NonNull private Intent getInstallApkIntent(String fileName) {
        Uri uri = Uri.fromFile(new File(fileName));
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        return intent;
    }

    class DownloadFileAsync extends AsyncTask<String, Integer, String> {

        private NotificationCompat.Builder mNotifyBuilder;
        private NotificationManager mNotificationManager;
        private int notifyID;
        private String rootDir;
        private String fileName;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            checkFileStatus();

            mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            // Sets an ID for the notification, so it can be updated
            mNotifyBuilder = new NotificationCompat.Builder(getApplicationContext())
                    .setContentTitle("新版本:" + getString(R.string.app_name))
                    .setContentText("正在下载...")
                    .setProgress(100, 0, false)
                    .setSmallIcon(R.mipmap.ic_launcher, 100)
                    .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
            notifyID = 0x001111;
            mNotificationManager.notify(notifyID, mNotifyBuilder.build());
        }

        private void checkFileStatus() {
            if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
                rootDir = Environment.getExternalStorageDirectory().getAbsolutePath();
            } else {
                rootDir = getFilesDir().getAbsolutePath();
            }
            fileName = getString(R.string.app_name) + ".apk";
        }


        @Override
        protected String doInBackground(String... url) {

            try {
                //连接地址
                URL u = new URL(url[0]);

                HttpURLConnection c = (HttpURLConnection) u.openConnection();
                c.setRequestMethod("GET");
                c.getInputStream();

                //计算文件长度
                int lengthOfFile = c.getContentLength();


                File dir = new File(rootDir);
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                File file = new File(dir, fileName);

                file.deleteOnExit();

                FileOutputStream f = new FileOutputStream(file);

                InputStream in = c.getInputStream();

                //下载的代码
                byte[] buffer = new byte[1024 * 1024];
                int len1 = 0;
                long total = 0;
                int oldP = 0;
                while ((len1 = in.read(buffer)) > 0) {
                    total += len1; //total = total + len1
                    int p = (int) ((total * 100) / lengthOfFile);
                    if (p > oldP) {
                        oldP = p;
                        publishProgress(p);
                    }
                    f.write(buffer, 0, len1);
                }
                f.flush();
                f.close();

                return file.getAbsolutePath();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        protected void onProgressUpdate(Integer... progress) {
            int p = progress[0];
            p = p < 0 ? 0 : p;
            p = p > 100 ? 100 : p;
            mNotifyBuilder.setProgress(100, p, false);
            mNotificationManager.notify(notifyID, mNotifyBuilder.build());
        }

        @Override
        protected void onPostExecute(String filePath) {
            mNotificationManager.cancel(notifyID);
            if (!TextUtils.isEmpty(filePath)) {
                startActivity(getInstallApkIntent(filePath));
            }
            stopSelf();
        }
    }
}
