package xyz.hanks.blog.ui.main;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import butterknife.Bind;
import butterknife.ButterKnife;
import xyz.hanks.blog.R;
import xyz.hanks.blog.ui.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Bind(R.id.rv) RecyclerView mRecyclerView;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override protected void onDestroy() {
        ButterKnife.unbind(this);
        super.onDestroy();
    }
}
