package Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.nearbuy_app.R;

import java.util.ArrayList;

import Adapter.StoriesAdapter;
import Model.StoriesModel;

public class StoriesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private final ArrayList<StoriesModel> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);
        initView();
        buildSetData();
        setRecycleView();
        Toast.makeText(this,"You will be able to see the status soon",Toast.LENGTH_LONG).show();
    }

    private void setRecycleView() {
        StoriesAdapter adapter=new StoriesAdapter(arrayList);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void buildSetData() {
        for(int i=0;i<50;i++) {
            arrayList.add(new StoriesModel(R.drawable.st1));
            arrayList.add(new StoriesModel(R.drawable.st2));
            arrayList.add(new StoriesModel(R.drawable.st3));
            arrayList.add(new StoriesModel(R.drawable.st4));
            arrayList.add(new StoriesModel(R.drawable.st5));
            arrayList.add(new StoriesModel(R.drawable.st6));
            arrayList.add(new StoriesModel(R.drawable.st8));
            arrayList.add(new StoriesModel(R.drawable.st9));
            arrayList.add(new StoriesModel(R.drawable.st10));
            arrayList.add(new StoriesModel(R.drawable.st11));
        }
    }

    private void initView() {
        recyclerView=findViewById(R.id.recycleview);
    }
}