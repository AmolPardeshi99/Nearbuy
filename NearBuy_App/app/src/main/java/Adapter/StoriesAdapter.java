package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nearbuy_app.R;
import ViewHolder.StoriesViewHolder;

import java.util.ArrayList;

import Model.StoriesModel;

public class StoriesAdapter extends RecyclerView.Adapter<StoriesViewHolder> {
    private ArrayList<StoriesModel> arrayList;
    public StoriesAdapter(ArrayList<StoriesModel>arrayList){
        this.arrayList=arrayList;
    }
    @NonNull

    @Override
    public StoriesViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_stories,parent,false);

        return new StoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  StoriesViewHolder holder, int position) {
        StoriesModel model=arrayList.get(position);
        holder.setData(model);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}
