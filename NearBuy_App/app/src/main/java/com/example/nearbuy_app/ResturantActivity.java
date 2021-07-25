package com.example.nearbuy_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class ResturantActivity extends AppCompatActivity implements OnClickListner{

    private RecyclerView recyclerView;
    private ArrayList<ResturantModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturant);
        initView();
        buildSetData();
        setRecycleView();
    }

    private void setRecycleView() {
        RestutantAdapter adapter = new RestutantAdapter(arrayList,this);
        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void buildSetData() {
        for (int i = 0; i < 50; i++) {

            arrayList.add(new ResturantModel(R.drawable.rt1));
            arrayList.add(new ResturantModel(R.drawable.rt2));
            arrayList.add(new ResturantModel(R.drawable.rt3));
            arrayList.add(new ResturantModel(R.drawable.rt4));
            arrayList.add(new ResturantModel(R.drawable.rt5));
            arrayList.add(new ResturantModel(R.drawable.rt8));
            arrayList.add(new ResturantModel(R.drawable.rt9));

        }
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerresturant);
    }

    @Override
    public void onItemClicked(SalonModel model, int position) {
    }

    @Override
    public void onItemClicked2(ResturantModel model, int position) {
        Intent intent=new Intent(ResturantActivity.this,PaymentActivity.class);
        startActivity(intent);
    }

    @Override
    public void onItemClicked3(popularHangoutsModel model, int position) {

    }
}