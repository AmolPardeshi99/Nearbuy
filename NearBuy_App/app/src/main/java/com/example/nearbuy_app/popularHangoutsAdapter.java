package com.example.nearbuy_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class popularHangoutsAdapter extends RecyclerView.Adapter<popularHangoutsViewHolder> {
    private ArrayList<popularHangoutsModel> arrayList;
    private OnClickListner onClickListner;
    public popularHangoutsAdapter(ArrayList<popularHangoutsModel>arrayList, OnClickListner onClickListner){
        this.arrayList=arrayList;
        this.onClickListner=onClickListner;
    }
    @NonNull

    @Override
    public popularHangoutsViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_resturant,parent,false);

        return new popularHangoutsViewHolder(view,onClickListner);
    }

    @Override
    public void onBindViewHolder(@NonNull popularHangoutsViewHolder holder, int position) {
        popularHangoutsModel popularHangoutsModel=arrayList.get(position);
        holder.setData(popularHangoutsModel);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}
