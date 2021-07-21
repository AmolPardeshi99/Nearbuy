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

    ViewFlipper flipper, flipper2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // setting data in first Flipper
        int imagarr [] = {R.drawable.party_2,R.drawable.buffet_1};
        flipper = (ViewFlipper) findViewById(R.id.flipper);

        for(int i=0; i<imagarr.length; i++){
            showImage(imagarr[i]);
        }

        // setting data in second Flipper
        int imagarr2 [] = {R.drawable.buy_now1,R.drawable.buy_now2,R.drawable.buy_now3,R.drawable.buy_now4};
        flipper2 = (ViewFlipper) findViewById(R.id.flipperBuyNow);

        for(int i=0; i<imagarr2.length; i++){
            showImage2(imagarr2[i]);
        }

        // By clinking on expand list of city we go on city page
        TextView tvCityName = (TextView)findViewById(R.id.tvTopHeader);
        tvCityName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void showImage(int img) {
        // setting for first flipper
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper.addView(imageView);
        flipper.setFlipInterval(4000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
    public void showImage2(int img2){

        // setting for second flipper
        ImageView imageView2 = new ImageView(this);
        imageView2.setBackgroundResource(img2);

        flipper2.addView(imageView2);
        flipper2.setFlipInterval(4000);
        flipper2.setAutoStart(true);

        flipper2.setInAnimation(this, android.R.anim.slide_in_left);
        flipper2.setOutAnimation(this, android.R.anim.slide_out_right);

    }

}