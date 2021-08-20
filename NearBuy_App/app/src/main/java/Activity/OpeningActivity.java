package Activity;
import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;

import com.example.nearbuy_app.R;

public class OpeningActivity extends Activity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 2150;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_opening);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(() -> {
            /* Create an Intent that will start the Menu-Activity.*/
            Intent mainIntent = new Intent(OpeningActivity.this, LoginStart.class);
            OpeningActivity.this.startActivity(mainIntent);
            finish();
        }, SPLASH_DISPLAY_LENGTH);
    }
}