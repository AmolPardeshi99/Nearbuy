package com.example.nearbuy_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class popularHangoutsActivity extends AppCompatActivity implements OnClickListner{

    private RecyclerView recyclerView;
    private ArrayList<popularHangoutsModel> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_hangouts);
        initView();
        buildSetData();
        setRecycleView();
    }

    private void setRecycleView() {
        popularHangoutsAdapter popularHangoutsAdapter=new popularHangoutsAdapter(arrayList,this);
        LinearLayoutManager gridLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(popularHangoutsAdapter);
    }

    private void buildSetData() {
        for(int i=0;i<50;i++) {
            arrayList.add(new popularHangoutsModel(R.drawable.ph1));
            arrayList.add(new popularHangoutsModel(R.drawable.ph2));
            arrayList.add(new popularHangoutsModel(R.drawable.ph3));
            arrayList.add(new popularHangoutsModel(R.drawable.ph4));
            arrayList.add(new popularHangoutsModel(R.drawable.ph5));
            arrayList.add(new popularHangoutsModel(R.drawable.ph6));


        }
    }

    private void initView() {
        recyclerView=findViewById(R.id.resturant);
    }


    @Override
    public void onItemClicked(SalonModel model, int position) {

    }

    @Override
    public void onItemClicked2(ResturantModel model, int position) {

    }

    @Override
    public void onItemClicked3(popularHangoutsModel model, int position) {
        Intent intent=new Intent(popularHangoutsActivity.this,PaymentActivity.class);
        startActivity(intent);
    }
}