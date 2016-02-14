package xyz.hanks.blog.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.functions.Action1;
import xyz.hanks.blog.R;
import xyz.hanks.blog.service.UpdateService;
import xyz.hanks.blog.ui.base.BaseActivity;
import xyz.hanks.blog.util.ToastUtils;

/**
 * Created by hanks on 16/2/11.
 */
public class ArticleActivity extends BaseActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

    }

    public void download(View view){
        Toast.makeText(this,"d",Toast.LENGTH_SHORT).show();
        String apkUrl = "https://d20vhy8jiniubf.cloudfront.net/downloads/PopClip-1.5.4.zip";
        UpdateService.update(this, apkUrl);

    }
}
