package com.example.nearbuy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
            showImage(imagarr[i],flipper);
        }

        // setting data in second Flipper
        int imagarr2[] = {R.drawable.buy_now1, R.drawable.buy_now2, R.drawable.buy_now3, R.drawable.buy_now4};
        flipper2 = (ViewFlipper) findViewById(R.id.flipperBuyNow);

        for (int i = 0; i < imagarr2.length; i++) {
            showImage(imagarr2[i],flipper2);
        }

        //setting data for third flipper
        int imagarr3[] = {R.drawable.kabab_2, R.drawable.drink_1, R.drawable.farmer_3, R.drawable.affinity_4, R.drawable.wellness_5};
        flipper3 = (ViewFlipper) findViewById(R.id.flipperBuyNow2);

        for (int i = 0; i < imagarr3.length; i++) {
            showImage(imagarr3[i],flipper3);
        }

        //setting data for Promocode flipper-4
        int imagarr4[] = {R.drawable.promo_1, R.drawable.promo_2};
        flipper4 = (ViewFlipper) findViewById(R.id.flipperPromo);

        for (int i = 0; i < imagarr4.length; i++) {
            showImage(imagarr4[i],flipper4);
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
    }

    public void showImage(int img, ViewFlipper flipper) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper.addView(imageView);
        flipper.setFlipInterval(4000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }


}