package com.vkramarenko.procachaniytest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.vkramarenko.procachaniytest.R;
import com.vkramarenko.procachaniytest.adapter.ImageAdapter;

/**
 * Created by Vlad Kramarenko on 23.01.2017.
 * class for layout result
 */
public class ResultActivity extends AppCompatActivity {

    public static final String TAG = "ResultActivity";

    public static ImageAdapter adapter;

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        findViews();
        initializeRecyclerView();
    }

    private void initializeRecyclerView() {
        adapter = new ImageAdapter(getApplicationContext());
        mRecyclerView.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(llm);
    }

    private void findViews() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);
    }
}

