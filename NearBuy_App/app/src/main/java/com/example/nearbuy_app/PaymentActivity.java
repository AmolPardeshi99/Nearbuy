package com.example.nearbuy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PaymentActivity extends AppCompatActivity {
    private ImageView debitcard;
    private ImageView craditcard;
    private ImageView upi;
    private ImageView netbanking;
    private ImageView paytm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        initView();
        debitcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaymentActivity.this,CardActivity.class);
                startActivity(intent);
            }
        });
        craditcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaymentActivity.this,CardActivity.class);
                startActivity(intent);
            }
        });


    }

    private void initView() {
        debitcard=findViewById(R.id.debitcard);
        craditcard=findViewById(R.id.creditcard);
        upi=findViewById(R.id.upi);
        netbanking=findViewById(R.id.netbanking);
        paytm=findViewById(R.id.paytm);
    }
}