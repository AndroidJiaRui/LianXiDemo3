package com.example.lianxidemo3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lianxidemo3.Bean;
import com.example.lianxidemo3.R;
import com.example.lianxidemo3.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rv_list);


        List<Bean> beanList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            beanList.add(new Bean(String.format("哈%d号", i + 1), "哈"));
        }
        for (int i = 0; i < 10; i++) {
            beanList.add(new Bean(String.format("哈哈%d号", i + 1), "哈哈"));
        }
        for (int i = 0; i < 10; i++) {
            beanList.add(new Bean(String.format("哈哈哈%d号", i + 1), "哈哈哈"));
        }
        for (int i = 0; i < 20; i++) {
            beanList.add(new Bean(String.format("哈哈哈哈%d号", i + 1), "哈哈哈哈"));
        }

        mAdapter = new RecyclerViewAdapter(this, beanList);
        mRecyclerView.addItemDecoration(new StickHeaderDecoration(this));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);

    }

}
