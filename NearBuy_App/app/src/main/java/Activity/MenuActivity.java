package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.nearbuy_app.R;

public class MenuActivity extends AppCompatActivity {
    private LinearLayout Profile;
    private LinearLayout Credit;
    private LinearLayout Notification;
    private LinearLayout ShareAndRate;
    private LinearLayout Promocodes;
    private LinearLayout Reservation;
    private LinearLayout Update,Help;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initView();
        Reservation.setOnClickListener(v -> {
            Intent intent=new Intent(MenuActivity.this, ReservationActivity.class);
            startActivity(intent);
        });
        Promocodes.setOnClickListener(v -> {
            Intent intent=new Intent(MenuActivity.this, PromocodesActivity.class);
            startActivity(intent);
        });
        ShareAndRate.setOnClickListener(v -> {
            Intent intent=new Intent(MenuActivity.this, ShareAndRateActivity.class);
            startActivity(intent);
        });
        Notification.setOnClickListener(v -> {
            Intent intent=new Intent(MenuActivity.this, NotificationActivity.class);
            startActivity(intent);
        });
        Credit.setOnClickListener(v -> {
            Intent intent=new Intent(MenuActivity.this, CreditActivity.class);
            startActivity(intent);
        });
        Profile.setOnClickListener(v -> {
            Intent intent=new Intent(MenuActivity.this, ProfileActivity.class);
            startActivity(intent);
        });

        Update.setOnClickListener(v -> {
            Intent intent=new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=com.nearbuy.nearbuymobile"));
            startActivity(intent);
        });

        Help.setOnClickListener(v -> {
            Intent intent=new Intent(MenuActivity.this, HelpActivity.class);
            startActivity(intent);
        });

    }

    private void initView() {
        Profile=findViewById(R.id.LinierProfile);
        Credit=findViewById(R.id.Liniercredits);
        Notification=findViewById(R.id.LinierNotification);
        ShareAndRate=findViewById(R.id.LinierShareAndRate);
        Promocodes=findViewById(R.id.LinierPromocodes);
        Reservation=findViewById(R.id.Linierreservation);
        Update= findViewById(R.id.LinierUpdate);
        Help= findViewById(R.id.LinierHelp);
    }
}