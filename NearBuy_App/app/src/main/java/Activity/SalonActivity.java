package Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.nearbuy_app.R;

import java.util.ArrayList;

import Adapter.SalonAdapter;
import Interface.OnClickListner;
import Model.ResturantModel;
import Model.SalonModel;
import Model.popularHangoutsModel;

public class SalonActivity extends AppCompatActivity implements OnClickListner {

    private RecyclerView recyclerView;
    private final ArrayList<SalonModel> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon);
        initView();
        buildSetData();
        setRecycleView();
        Toast.makeText(this,"You can view your services and add to cart soon",Toast.LENGTH_LONG).show();
    }

    private void setRecycleView() {
        SalonAdapter adapter=new SalonAdapter(arrayList,this);
        LinearLayoutManager gridLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void buildSetData() {
        for(int i=0;i<50;i++) {
            arrayList.add(new SalonModel(R.drawable.sl1));
            arrayList.add(new SalonModel(R.drawable.sl2));
            arrayList.add(new SalonModel(R.drawable.sl3));
            arrayList.add(new SalonModel(R.drawable.sl4));
            arrayList.add(new SalonModel(R.drawable.sl5));
            arrayList.add(new SalonModel(R.drawable.sl7));


        }
    }

    private void initView() {
        recyclerView=findViewById(R.id.recyclersaloon);
    }

    @Override
    public void onItemClicked(SalonModel model, int position) {

        Intent intent=new Intent(SalonActivity.this, PaymentActivity.class);
        startActivity(intent);

    }
    @Override
    public void onItemClicked2(ResturantModel model, int position) {

    }
    @Override
    public void onItemClicked3(popularHangoutsModel model, int position) {

    }
}