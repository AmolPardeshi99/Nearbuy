package com.example.nearbuy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity2 extends AppCompatActivity {

    private ViewFlipper flipper3, flipper, flipper2, flipper4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // setting data in first Flipper
        int imagarr[] = {R.drawable.party_2, R.drawable.buffet_1};
        flipper = (ViewFlipper) findViewById(R.id.flipper);

        for (int i = 0; i < imagarr.length; i++) {
            showImage(imagarr[i], flipper);
        }

        // setting data in second Flipper
        int imagarr2[] = {R.drawable.buy_now1, R.drawable.buy_now2, R.drawable.buy_now3, R.drawable.buy_now4};
        flipper2 = (ViewFlipper) findViewById(R.id.flipperBuyNow);

        for (int i = 0; i < imagarr2.length; i++) {
            showImage(imagarr2[i], flipper2);
        }

        //setting data for third flipper
        int imagarr3[] = {R.drawable.kabab_2, R.drawable.drink_1, R.drawable.farmer_3, R.drawable.affinity_4, R.drawable.wellness_5};
        flipper3 = (ViewFlipper) findViewById(R.id.flipperBuyNow2);

        for (int i = 0; i < imagarr3.length; i++) {
            showImage(imagarr3[i], flipper3);
        }

        //setting data for Promocode flipper-4
        int imagarr4[] = {R.drawable.promo_1, R.drawable.promo_2};
        flipper4 = (ViewFlipper) findViewById(R.id.flipperPromo);

        for (int i = 0; i < imagarr4.length; i++) {
            showImage(imagarr4[i], flipper4);
        }

        // By clinking on expand list of city we go on city page
        TextView tvCityName = (TextView) findViewById(R.id.tvTopHeader);
        tvCityName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //Intent for stories button
        ImageView mIvStoriesBtn = (ImageView) findViewById(R.id.btn_stories);
        mIvStoriesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, StoriesActivity.class);
                startActivity(intent);
            }
        });

//        //Intent for scan activity
//        ImageView mIvScan  = (ImageView) findViewById(R.id.btn_scan);
//        mIvScan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity2.this,ScanActivity.class);
//                startActivity(intent);
//            }
//        });


        // Intent for Restaurant Deal
        ImageView DealResto = (ImageView) findViewById(R.id.deal_resto);
        DealResto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, ResturantActivity.class);
                startActivity(intent);
            }
        });

        // Intent for Restaurant Card
        ViewFlipper flipper = (ViewFlipper) findViewById(R.id.flipper);
        flipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, ResturantActivity.class);
                startActivity(intent);
            }
        });

        // Intent on linear layout
        LinearLayout layout  = (LinearLayout) findViewById(R.id.linearResto);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, ResturantActivity.class);
                startActivity(intent);
            }
        });

        // Intent on Purchase Button
        ImageView mIvPurchase  = (ImageView) findViewById(R.id.btn_purchase);
        mIvPurchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, PurchaseActivity.class);
                startActivity(intent);
            }
        });

        // Intent for Menu button
        ImageView Menu  = (ImageView) findViewById(R.id.icon_menu);
        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        // Intent for notification button
        ImageView Notification  = (ImageView) findViewById(R.id.icon_notification);
        Notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, NotificationActivity.class);
                startActivity(intent);
            }
        });

        // Intent for saloon button
        ImageView saloon  = (ImageView) findViewById(R.id.deal_saloon);
        saloon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, SalonActivity.class);
                startActivity(intent);
            }
        });

        // Intent for saloon button
        ImageView mIvSaloon  = (ImageView) findViewById(R.id.IvSaloon);
        mIvSaloon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, SalonActivity.class);
                startActivity(intent);
            }
        });

        // Intent for saloon button
        ImageView hairOffer  = (ImageView) findViewById(R.id.hair_offer);
        hairOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, SalonActivity.class);
                startActivity(intent);
            }
        });


    }

    //Function for setting flipper
    public void showImage(int img, ViewFlipper flipper) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper.addView(imageView);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }


}