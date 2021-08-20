package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;

import android.widget.Toast;
import android.widget.ViewFlipper;

import com.example.nearbuy_app.R;


public class LoginStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_start);
        Toast.makeText(this,"We will implement login via otp soon",Toast.LENGTH_LONG).show();

        int[] n = {R.drawable.img1, R.drawable.img2, R.drawable.img3};
        ViewFlipper flipper = findViewById(R.id.flipper);

        for (int j : n) {
            showImage(j, flipper);
        }

        EditText mEtMobileNum = findViewById(R.id.Etv1);
        mEtMobileNum.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length()>9){
                    Intent intent = new Intent(LoginStart.this, MapScreen.class);
                    startActivity(intent);
                    Toast.makeText(LoginStart.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void showImage(int img, ViewFlipper flipper) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper.addView(imageView);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }
}