package com.example.nearbuy_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class SalonActivity extends AppCompatActivity implements OnClickListner{

    private RecyclerView recyclerView;
    private ArrayList<SalonModel> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon);
        initView();
        buildSetData();
        setRecycleView();
    }

    private void setRecycleView() {
        SalonAdapter adapter=new SalonAdapter(arrayList,this);
        LinearLayoutManager gridLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void buildSetData() {
        for(int i=0;i<50;i++) {
            arrayList.add(new SalonModel(R.drawable.sl1));
            arrayList.add(new SalonModel(R.drawable.sl2));
            arrayList.add(new SalonModel(R.drawable.sl3));
            arrayList.add(new SalonModel(R.drawable.sl4));
            arrayList.add(new SalonModel(R.drawable.sl5));
            arrayList.add(new SalonModel(R.drawable.sl7));


        }
    }

    private void initView() {
        recyclerView=findViewById(R.id.recyclersaloon);
    }

    @Override
    public void onItemClicked(SalonModel model, int position) {

        Intent intent=new Intent(SalonActivity.this,PaymentActivity.class);
        startActivity(intent);

    }

    @Override
    public void onItemClicked2(ResturantModel model, int position) {

    }
}