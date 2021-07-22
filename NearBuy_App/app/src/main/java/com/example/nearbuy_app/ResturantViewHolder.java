package com.example.nearbuy_app;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ResturantViewHolder extends RecyclerView.ViewHolder {
    private ImageView IvStories;


    public ResturantViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        IvStories=itemView.findViewById(R.id.IvResturant);


    }
    public void setData(ResturantModel model){
        IvStories.setImageResource(model.getImage());
    }
}


