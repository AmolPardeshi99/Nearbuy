package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nearbuy_app.R;

public class CardActivity extends AppCompatActivity {
    private EditText cardnumber;
    private EditText month;
    private EditText year;
    private EditText ccv;
    private Button payNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        initView();
        payNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean cardNumber = cardNumber();
                boolean month = year();
                boolean year = month();
                boolean ccv=ccv();
                if(cardNumber&&month&&year&&ccv){
                    Toast.makeText(CardActivity.this,"Payment Success",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(CardActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void initView() {
        cardnumber = findViewById(R.id.cardNumber);
        month = findViewById(R.id.month);
        year = findViewById(R.id.year);
        ccv = findViewById(R.id.ccv);
        payNow = findViewById(R.id.paynow);
    }

    private boolean cardNumber() {
        if (cardnumber.getText().toString().length() == 16) {
            return true;
        } else {
            cardnumber.setError("Invalid card number");
            return false;
        }
    }

    private boolean ccv() {
        if (ccv.getText().toString().length() >= 3) {
            return true;
        } else {
            ccv.setError("Invalid ccv");
            return false;
        }
    }

    private boolean month() {
        if (month.getText().toString().trim().length() >= 2) {
            return true;
        } else {
            month.setError("Invalid month");
            return false;
        }
    }
    private boolean year() {
        if (month.getText().toString().trim().length() >= 2) {
            return true;
        } else {
            month.setError("Invalid year");
            return false;
        }
    }
}