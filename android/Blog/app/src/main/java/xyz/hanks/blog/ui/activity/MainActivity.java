package xyz.hanks.blog.ui.activity;

import android.content.Intent;
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

public class MainActivity extends BaseActivity {

    @Bind(R.id.rv) RecyclerView mRecyclerView;
    List<Article> dataList = new ArrayList<>();

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        dataList.add(new Article(0, "Detra Mcmunn", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/045109czyubkby8b88ttz0.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/02/08123745/SplitShire-2739-768x506.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(1, "Ami Koehler", "f you happen to own the AT&T variant of the LG G4, model H810, you'll definitely want to check for available updates as Marshmallow is now rolling out to the handset. It's available ", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451010oag11nnkbnq021q.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/02/08131951/SplitShire-2706-1152x759.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(2, "Uids", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451020h1q9gcz3c6r5435.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/01/08135813/SplitShire-0514-768x506.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(3, "Tomm", "Honor has announced some new romantic bundles for both the Honor 7 and Honor 5X ahead of Valentine's Day in the UK. The company has released some special bundles, which are available on vMall. Should you be after either smartphone, there are some goodies on offer that will be packaged alongside the handset.", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/04505941prtlemtsu7otuv.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2015/02/09114656/SplitShire-20531-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(4, "Perrtr", "Whether you're treating yourself or a loved on this Valentine's Day, the deals offered on vMall should be considered when browsing around for your next smartphone purchase. This promotion will run on February 11 from 09:30a.m. to 10:59p.m. GMT.…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451010oag11nnkbnq021q.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2015/03/30122324/SplitShire-5467-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(5, "Deney", "Hit the links below to be taken to the vMall listings for both smartphones included in this promotion:", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451020h1q9gcz3c6r5435.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2014/06/09112346/SplitShire_IMG_8150-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(0, "Detra Mcmunn", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/045109czyubkby8b88ttz0.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/02/08123745/SplitShire-2739-768x506.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(1, "Ami Koehler", "f you happen to own the AT&T variant of the LG G4, model H810, you'll definitely want to check for available updates as Marshmallow is now rolling out to the handset. It's available ", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451010oag11nnkbnq021q.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/02/08131951/SplitShire-2706-1152x759.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(2, "Uids", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451020h1q9gcz3c6r5435.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/01/08135813/SplitShire-0514-768x506.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(3, "Tomm", "Honor has announced some new romantic bundles for both the Honor 7 and Honor 5X ahead of Valentine's Day in the UK. The company has released some special bundles, which are available on vMall. Should you be after either smartphone, there are some goodies on offer that will be packaged alongside the handset.", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/04505941prtlemtsu7otuv.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2015/02/09114656/SplitShire-20531-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(4, "Perrtr", "Whether you're treating yourself or a loved on this Valentine's Day, the deals offered on vMall should be considered when browsing around for your next smartphone purchase. This promotion will run on February 11 from 09:30a.m. to 10:59p.m. GMT.…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451010oag11nnkbnq021q.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2015/03/30122324/SplitShire-5467-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(5, "Deney", "Hit the links below to be taken to the vMall listings for both smartphones included in this promotion:", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451020h1q9gcz3c6r5435.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2014/06/09112346/SplitShire_IMG_8150-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(0, "Detra Mcmunn", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/045109czyubkby8b88ttz0.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/02/08123745/SplitShire-2739-768x506.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(1, "Ami Koehler", "f you happen to own the AT&T variant of the LG G4, model H810, you'll definitely want to check for available updates as Marshmallow is now rolling out to the handset. It's available ", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451010oag11nnkbnq021q.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/02/08131951/SplitShire-2706-1152x759.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(2, "Uids", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451020h1q9gcz3c6r5435.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/01/08135813/SplitShire-0514-768x506.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(3, "Tomm", "Honor has announced some new romantic bundles for both the Honor 7 and Honor 5X ahead of Valentine's Day in the UK. The company has released some special bundles, which are available on vMall. Should you be after either smartphone, there are some goodies on offer that will be packaged alongside the handset.", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/04505941prtlemtsu7otuv.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2015/02/09114656/SplitShire-20531-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(4, "Perrtr", "Whether you're treating yourself or a loved on this Valentine's Day, the deals offered on vMall should be considered when browsing around for your next smartphone purchase. This promotion will run on February 11 from 09:30a.m. to 10:59p.m. GMT.…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451010oag11nnkbnq021q.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2015/03/30122324/SplitShire-5467-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(5, "Deney", "Hit the links below to be taken to the vMall listings for both smartphones included in this promotion:", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451020h1q9gcz3c6r5435.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2014/06/09112346/SplitShire_IMG_8150-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(2, "Uids", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451020h1q9gcz3c6r5435.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/01/08135813/SplitShire-0514-768x506.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(3, "Tomm", "Honor has announced some new romantic bundles for both the Honor 7 and Honor 5X ahead of Valentine's Day in the UK. The company has released some special bundles, which are available on vMall. Should you be after either smartphone, there are some goodies on offer that will be packaged alongside the handset.", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/04505941prtlemtsu7otuv.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2015/02/09114656/SplitShire-20531-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(4, "Perrtr", "Whether you're treating yourself or a loved on this Valentine's Day, the deals offered on vMall should be considered when browsing around for your next smartphone purchase. This promotion will run on February 11 from 09:30a.m. to 10:59p.m. GMT.…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451010oag11nnkbnq021q.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2015/03/30122324/SplitShire-5467-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(5, "Deney", "Hit the links below to be taken to the vMall listings for both smartphones included in this promotion:", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451020h1q9gcz3c6r5435.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2014/06/09112346/SplitShire_IMG_8150-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(0, "Detra Mcmunn", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/045109czyubkby8b88ttz0.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/02/08123745/SplitShire-2739-768x506.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(1, "Ami Koehler", "f you happen to own the AT&T variant of the LG G4, model H810, you'll definitely want to check for available updates as Marshmallow is now rolling out to the handset. It's available ", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451010oag11nnkbnq021q.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/02/08131951/SplitShire-2706-1152x759.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(2, "Uids", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451020h1q9gcz3c6r5435.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/01/08135813/SplitShire-0514-768x506.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(3, "Tomm", "Honor has announced some new romantic bundles for both the Honor 7 and Honor 5X ahead of Valentine's Day in the UK. The company has released some special bundles, which are available on vMall. Should you be after either smartphone, there are some goodies on offer that will be packaged alongside the handset.", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/04505941prtlemtsu7otuv.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2015/02/09114656/SplitShire-20531-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(4, "Perrtr", "Whether you're treating yourself or a loved on this Valentine's Day, the deals offered on vMall should be considered when browsing around for your next smartphone purchase. This promotion will run on February 11 from 09:30a.m. to 10:59p.m. GMT.…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451010oag11nnkbnq021q.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2015/03/30122324/SplitShire-5467-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(5, "Deney", "Hit the links below to be taken to the vMall listings for both smartphones included in this promotion:", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451020h1q9gcz3c6r5435.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2014/06/09112346/SplitShire_IMG_8150-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(0, "Detra Mcmunn", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/045109czyubkby8b88ttz0.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/02/08123745/SplitShire-2739-768x506.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(1, "Ami Koehler", "f you happen to own the AT&T variant of the LG G4, model H810, you'll definitely want to check for available updates as Marshmallow is now rolling out to the handset. It's available ", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451010oag11nnkbnq021q.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/02/08131951/SplitShire-2706-1152x759.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(2, "Uids", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a ton…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451020h1q9gcz3c6r5435.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2016/01/08135813/SplitShire-0514-768x506.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(3, "Tomm", "Honor has announced some new romantic bundles for both the Honor 7 and Honor 5X ahead of Valentine's Day in the UK. The company has released some special bundles, which are available on vMall. Should you be after either smartphone, there are some goodies on offer that will be packaged alongside the handset.", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/04505941prtlemtsu7otuv.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2015/02/09114656/SplitShire-20531-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(4, "Perrtr", "Whether you're treating yourself or a loved on this Valentine's Day, the deals offered on vMall should be considered when browsing around for your next smartphone purchase. This promotion will run on February 11 from 09:30a.m. to 10:59p.m. GMT.…", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451010oag11nnkbnq021q.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2015/03/30122324/SplitShire-5467-384x253.jpg", System.currentTimeMillis() - 60000));
        dataList.add(new Article(5, "Deney", "Hit the links below to be taken to the vMall listings for both smartphones included in this promotion:", "The park is a favorite among skaters in California and it definitely deserves it. The park is complete with plenty of smooth banks to gain a tonlo", "http://att.bbs.duowan.com/forum/201304/25/0451020h1q9gcz3c6r5435.png", "http://wpsplitshire.s3.amazonaws.com/wp-content/uploads/2014/06/09112346/SplitShire_IMG_8150-384x253.jpg", System.currentTimeMillis() - 60000));

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new DemoAdapter());

        startActivity(new Intent(this,ArticleActivity.class));
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
            ButterKnife.bind(this, itemView);
        }
    }

    class DemoAdapter extends RecyclerView.Adapter<DemoViewHolder> {


        @Override
        public DemoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_article, parent, false);
            return new DemoViewHolder(view);
        }

        @Override public void onBindViewHolder(DemoViewHolder holder, int position) {
            Article article = dataList.get(position);
            holder.title.setText(article.title);
            holder.content.setText(article.des);
            holder.time.setText("3 min");
            Glide.with(MainActivity.this).load(article.imageUrl).into(holder.cover);
            Glide.with(MainActivity.this).load(article.avatarUrl).into(holder.avatar);
        }

        @Override public int getItemCount() {
            return dataList.size();
        }
    }
}
