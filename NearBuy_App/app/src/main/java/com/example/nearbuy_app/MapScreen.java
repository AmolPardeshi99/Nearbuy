package com.example.nearbuy_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MapScreen extends AppCompatActivity {

    Button mBtnPermission;
    TextView mTvSelectManually;
    private static final int REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_screen);
        mBtnPermission = findViewById(R.id.BtnLocation);
        mTvSelectManually = findViewById(R.id.tvManually);
        mBtnPermission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] permission = {Manifest.permission.ACCESS_FINE_LOCATION};
                ActivityCompat.requestPermissions(MapScreen.this, permission, REQUEST_CODE);

            }
        });

        mTvSelectManually.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MapScreen.this, MainActivity.class);
                MapScreen.this.startActivity(mainIntent);
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {

            Intent mainIntent = new Intent(MapScreen.this, MainActivity2.class);
            MapScreen.this.startActivity(mainIntent);

        } else{


        }
    }


}