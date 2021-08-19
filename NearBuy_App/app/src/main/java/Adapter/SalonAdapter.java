package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nearbuy_app.R;
import ViewHolder.SalonViewHolder;

import java.util.ArrayList;

import Interface.OnClickListner;
import Model.SalonModel;

public class SalonAdapter extends RecyclerView.Adapter<SalonViewHolder> {
    private ArrayList<SalonModel> arrayList;
    private OnClickListner onClickListner;
    public SalonAdapter(ArrayList<SalonModel>arrayList,OnClickListner onClickListner){
        this.arrayList=arrayList;
        this.onClickListner=onClickListner;
    }
    @NonNull

    @Override
    public SalonViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_resturant,parent,false);

        return new SalonViewHolder(view,onClickListner);
    }

    @Override
    public void onBindViewHolder(@NonNull SalonViewHolder holder, int position) {
        SalonModel model=arrayList.get(position);
        holder.setData(model);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}
