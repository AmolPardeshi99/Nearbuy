package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nearbuy_app.R;
import ViewHolder.ResturantViewHolder;

import java.util.ArrayList;

import Interface.OnClickListner;
import Model.ResturantModel;

public class RestutantAdapter extends RecyclerView.Adapter<ResturantViewHolder> {
    private ArrayList<ResturantModel> arrayList;
    private OnClickListner onClickListner2;
    public RestutantAdapter(ArrayList<ResturantModel>arrayList,OnClickListner onClickListner2){
        this.arrayList=arrayList;
        this.onClickListner2 = onClickListner2;
    }
    @NonNull

    @Override
    public ResturantViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_resturant,parent,false);

        return new ResturantViewHolder(view,onClickListner2);
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
