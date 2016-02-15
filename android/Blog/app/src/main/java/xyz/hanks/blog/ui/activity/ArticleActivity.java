package xyz.hanks.blog.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import xyz.hanks.blog.R;
import xyz.hanks.blog.service.UpdateService;
import xyz.hanks.blog.ui.base.BaseActivity;

/**
 * Created by hanks on 16/2/11.
 */
public class ArticleActivity extends BaseActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

    }

    public void download(View view) {
        Toast.makeText(this, "d", Toast.LENGTH_SHORT).show();
        String apkUrl = "http://file.bmob.cn/M02/93/DD/oYYBAFbBUpmAfvxHAIn6mnv3n2U127.apk";
        UpdateService.update(this, apkUrl);

    }
}

