package xyz.hanks.blog.ui.activity;

import android.os.Bundle;

import xyz.hanks.blog.R;
import xyz.hanks.blog.ui.base.BaseActivity;

/**
 * Created by hanks on 16/2/11.
 */
public class ArticleActivity extends BaseActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
    }
}
