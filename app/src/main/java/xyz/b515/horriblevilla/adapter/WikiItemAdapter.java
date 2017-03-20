package xyz.b515.horriblevilla.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import xyz.b515.horriblevilla.R;

/**
 * Created by ZeroGo on 2017.3.20.
 */

public class WikiItemAdapter extends RecyclerView.Adapter<WikiItemAdapter.WikiItemHolder> {

    private Context context;

    public WikiItemAdapter(Context context) {
        this.context = context;
    }

    @Override
    public WikiItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new WikiItemHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.wiki_item, parent, false));
    }

    @Override
    public void onBindViewHolder(WikiItemHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class WikiItemHolder extends RecyclerView.ViewHolder {

        WikiItemHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
