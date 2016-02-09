package xyz.hanks.blog.ui.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.concurrent.TimeUnit;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.Observable;
import rx.functions.Action1;
import xyz.hanks.blog.R;
import xyz.hanks.blog.ui.base.BaseActivity;

/**
 * 启动界面
 * Created by hanks on 16/1/23.
 */
public class SplashActivity extends BaseActivity {

    private final int SPLASH_TIME = 2000;
    @Bind(R.id.img_bg) ImageView mImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        mImage.animate()
                .setDuration(SPLASH_TIME)
                .scaleX(1.1f)
                .scaleY(1.1f)
                .setListener(new AnimatorListenerAdapter() {
                    @Override public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        launchMainActivity();
                    }
                })
                .start();
    }

    @Override protected void onDestroy() {
        ButterKnife.unbind(this);
        super.onDestroy();
    }

    private void launchMainActivity() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
