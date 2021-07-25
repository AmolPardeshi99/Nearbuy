package com.example.nearbuy_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class StoriesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<StoriesModel> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);
        initView();
        buildSetData();
        setRecycleView();
    }

    private void setRecycleView() {
        StoriesAdapter adapter=new StoriesAdapter(arrayList);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void buildSetData() {
        for(int i=0;i<50;i++) {
            arrayList.add(new StoriesModel(R.drawable.st1));
            arrayList.add(new StoriesModel(R.drawable.st2));
            arrayList.add(new StoriesModel(R.drawable.st3));
            arrayList.add(new StoriesModel(R.drawable.st4));
            arrayList.add(new StoriesModel(R.drawable.st5));
            arrayList.add(new StoriesModel(R.drawable.st6));
            arrayList.add(new StoriesModel(R.drawable.st8));
            arrayList.add(new StoriesModel(R.drawable.st9));
            arrayList.add(new StoriesModel(R.drawable.st10));
            arrayList.add(new StoriesModel(R.drawable.st11));
        }
    }

    private void initView() {
        recyclerView=findViewById(R.id.recycleview);
    }
}