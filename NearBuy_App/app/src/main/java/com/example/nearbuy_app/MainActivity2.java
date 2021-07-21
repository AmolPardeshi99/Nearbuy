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

        int imagarr [] = {R.drawable.party_2,R.drawable.buffet_1};
        flipper = (ViewFlipper) findViewById(R.id.flipper);

        for(int i=0; i<imagarr.length; i++){
            showImage(imagarr[i]);
        }

        TextView tvCityName = (TextView)findViewById(R.id.tvTopHeader);
        tvCityName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void showImage(int img){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper.addView(imageView);
        flipper.setFlipInterval(4000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);


    }

}