package com.vkramarenko.procachaniytest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.vkramarenko.procachaniytest.R;
import com.vkramarenko.procachaniytest.activity.ResultActivity;
import com.vkramarenko.procachaniytest.providers.Provider;

/**
 * Created by vlad Kramarenko on 23.01.2017.
 * Adapter for RecyclerView
 */
public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.CardViewHolder> {

    public static final String TAG = "adapter";

    private Context context;

    public ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ImageAdapter.CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder");
        return new CardViewHolder(LayoutInflater.from(parent
                .getContext())
                .inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(final ImageAdapter.CardViewHolder holder, int position) {

        Picasso.with(context)
                .load(Provider.getInstance().getUrlList().get(position))
                .fit()
                .into(holder.imageView);
        int cat = 10;
    }

    @Override
    public int getItemCount() {
        return Provider.getInstance().getUrlList().size();
    }

    class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        CardViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageFromGoogle);
        }
    }
}
