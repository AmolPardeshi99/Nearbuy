package com.example.nearbuy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MenuActivity extends AppCompatActivity {
    private LinearLayout Profile;
    private LinearLayout Credit;
    private LinearLayout Notification;
    private LinearLayout ShareAndRate;
    private LinearLayout Promocodes;
    private LinearLayout Reservation;
    private LinearLayout Update;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initView();
        Reservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,ReservationActivity.class);
                startActivity(intent);
            }
        });
        Promocodes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,PromocodesActivity.class);
                startActivity(intent);
            }
        });
        ShareAndRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,ShareAndRateActivity.class);
                startActivity(intent);
            }
        });
        Notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,NotificationActivity.class);
                startActivity(intent);
            }
        });
        Credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,CreditActivity.class);
                startActivity(intent);
            }
        });
        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

        Update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=com.nearbuy.nearbuymobile"));
                startActivity(intent);
            }
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
    }
}