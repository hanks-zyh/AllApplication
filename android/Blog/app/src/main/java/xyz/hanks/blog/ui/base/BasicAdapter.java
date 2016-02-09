package xyz.hanks.blog.ui.base;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * 封装RecyclerView的Adapter
 * Created by hanks on 16/2/2.
 */
public class BasicAdapter extends RecyclerView.Adapter {

    @Override public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override public int getItemCount() {
        return 0;
    }
}
