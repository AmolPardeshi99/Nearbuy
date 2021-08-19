package ViewHolder;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nearbuy_app.R;

import Model.StoriesModel;

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


