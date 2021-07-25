package com.example.nearbuy_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

public class ShareAndRateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_and_rate);

        //Share the app button intent set to playstore
        CardView ShareApp = (CardView) findViewById(R.id.cardShareTheApp);
        ShareApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=com.nearbuy.nearbuymobile"));
                startActivity(intent);
            }
        });

        //Rate the app button intent set to playstore
        CardView RateApp = (CardView) findViewById(R.id.cardRateTheApp);
        RateApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=com.nearbuy.nearbuymobile"));
                startActivity(intent);
            }
        });

        //Intent to like our facebook page
        CardView FacebookPage = (CardView) findViewById(R.id.cardLikeUsOnFacebook);
        FacebookPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/nearbuy/"));
                startActivity(intent);
            }
        });

        //Intent to  our blog
        CardView BlogPage = (CardView) findViewById(R.id.cardNearbuyBlog);
        BlogPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShareAndRateActivity.this, WebActivity.class);
                startActivity(intent);
            }
        });

    }
}