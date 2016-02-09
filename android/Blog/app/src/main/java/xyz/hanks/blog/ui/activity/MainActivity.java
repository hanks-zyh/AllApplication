package xyz.hanks.blog.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import xyz.hanks.blog.R;
import xyz.hanks.blog.data.Article;
import xyz.hanks.blog.ui.base.BaseActivity;
import xyz.hanks.blog.util.LogUtils;

public class MainActivity extends BaseActivity {

    @Bind(R.id.rv) RecyclerView mRecyclerView;
    List<Article> dataList = new ArrayList<>();

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        dataList.add(new Article(0, "Detra Mcmunn", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/045109czyubkby8b88ttz0.png", System.currentTimeMillis() - 60000));
        dataList.add(new Article(1, "Ami Koehler", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451010oag11nnkbnq021q.png", System.currentTimeMillis() - 60000));
        dataList.add(new Article(2, "Uids", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451020h1q9gcz3c6r5435.png", System.currentTimeMillis() - 60000));
        dataList.add(new Article(3, "Tomm", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/04505941prtlemtsu7otuv.png", System.currentTimeMillis() - 60000));
        dataList.add(new Article(4, "Perrtr", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451010oag11nnkbnq021q.png", System.currentTimeMillis() - 60000));
        dataList.add(new Article(5, "Deney", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451020h1q9gcz3c6r5435.png", System.currentTimeMillis() - 60000));

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new DemoAdapter());
    }

    @Override protected void onDestroy() {
        ButterKnife.unbind(this);
        super.onDestroy();
    }

     static class DemoViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.img_avatar) ImageView avatar;
        @Bind(R.id.img_cover) ImageView cover;
        @Bind(R.id.tv_title) TextView title;
        @Bind(R.id.tv_content) TextView content;
        @Bind(R.id.tv_time) TextView time;

        public DemoViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

     class DemoAdapter extends RecyclerView.Adapter<DemoViewHolder> {


        @Override
        public DemoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_article,parent,false);
            return new DemoViewHolder(view);
        }

        @Override public void onBindViewHolder(DemoViewHolder holder, int position) {
            Article article = dataList.get(position);
            holder.title.setText(article.title);
            holder.content.setText(article.des);
            holder.time.setText("3 min");
            LogUtils.d(article.imageUrl);
            Glide.with(getApplicationContext()).load(article.imageUrl).into(holder.avatar);
        }

        @Override public int getItemCount() {
            return dataList.size();
        }
    }
}
