package com.example.nearbuy_app;
import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;

public class OpeningActivity extends Activity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 3150;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_opening);
        Log.d("Lloyd","onCreate");

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(OpeningActivity.this, SecondActivity.class);
                OpeningActivity.this.startActivity(mainIntent);
                //  Splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}