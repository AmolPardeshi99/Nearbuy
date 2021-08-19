package ViewHolder;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nearbuy_app.R;

import Interface.OnClickListner;
import Model.SalonModel;

public class SalonViewHolder extends RecyclerView.ViewHolder {
    private ImageView IvStories;
    private CardView cardView;
    private OnClickListner onClickListner;


    public SalonViewHolder(@NonNull View itemView,OnClickListner onClickListner) {
        super(itemView);
        initView(itemView);
        this.onClickListner=onClickListner;
    }

    private void initView(View itemView) {
        IvStories=itemView.findViewById(R.id.IvResturant);
        cardView=itemView.findViewById(R.id.cardview);


    }
    public void setData(SalonModel model){
        IvStories.setImageResource(model.getImage());
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListner.onItemClicked(model,getAdapterPosition());
            }
        });
    }
}


