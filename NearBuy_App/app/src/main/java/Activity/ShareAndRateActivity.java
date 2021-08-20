package Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import com.example.nearbuy_app.R;

public class ShareAndRateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_and_rate);

        //Share the app button intent set to playstore
        CardView ShareApp = findViewById(R.id.cardShareTheApp);
        ShareApp.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=com.nearbuy.nearbuymobile"));
            startActivity(intent);
        });

        //Rate the app button intent set to playstore
        CardView RateApp = findViewById(R.id.cardRateTheApp);
        RateApp.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=com.nearbuy.nearbuymobile"));
            startActivity(intent);
        });

        //Intent to like our facebook page
        CardView FacebookPage = findViewById(R.id.cardLikeUsOnFacebook);
        FacebookPage.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/nearbuy/"));
            startActivity(intent);
        });

        //Intent to  our blog
        CardView BlogPage = findViewById(R.id.cardNearbuyBlog);
        BlogPage.setOnClickListener(v -> {
            Intent intent = new Intent(ShareAndRateActivity.this, WebActivity.class);
            startActivity(intent);
        });

    }
}