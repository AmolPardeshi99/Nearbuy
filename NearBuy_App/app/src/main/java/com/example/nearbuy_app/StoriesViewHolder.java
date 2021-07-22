package com.example.nearbuy_app;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StoriesViewHolder extends RecyclerView.ViewHolder {
    private ImageView IvStories;


    public StoriesViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        IvStories=itemView.findViewById(R.id.IvStories);


    }
    public void setData(StoriesModel model){
        IvStories.setImageResource(model.getImage());
    }
}


