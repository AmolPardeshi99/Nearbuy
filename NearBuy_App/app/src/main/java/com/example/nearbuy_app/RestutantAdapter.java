package com.example.nearbuy_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestutantAdapter extends RecyclerView.Adapter<ResturantViewHolder> {
    private ArrayList<ResturantModel> arrayList;
    public RestutantAdapter(ArrayList<ResturantModel>arrayList){
        this.arrayList=arrayList;
    }
    @NonNull

    @Override
    public ResturantViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_resturant,parent,false);

        return new ResturantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResturantViewHolder holder, int position) {
        ResturantModel model=arrayList.get(position);
        holder.setData(model);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}
