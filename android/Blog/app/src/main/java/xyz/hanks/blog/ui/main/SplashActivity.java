package xyz.hanks.blog.ui.main;

import android.content.Intent;
import android.os.Bundle;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.functions.Action1;
import xyz.hanks.blog.R;
import xyz.hanks.blog.ui.base.BaseActivity;

/**
 * 启动界面
 * Created by hanks on 16/1/23.
 */
public class SplashActivity extends BaseActivity {

    private final int SPLASH_TIME = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Observable.timer(SPLASH_TIME, TimeUnit.MILLISECONDS)
                .subscribe(new Action1<Long>() {
                    @Override public void call(Long aLong) {
                        launchMainActivity();
                    }
                });
    }

    private void launchMainActivity() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
