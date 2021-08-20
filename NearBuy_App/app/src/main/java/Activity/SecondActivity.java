package Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

import android.widget.Button;
import android.widget.Toast;

import com.example.nearbuy_app.R;

public class SecondActivity extends AppCompatActivity {

    Button mBtnPermission;
    private static final int REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Lloyd","SecondActivity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_main);
        mBtnPermission = findViewById(R.id.BtnLocation);
        mBtnPermission.setOnClickListener(v -> {
            Log.d("Lloyd","onButtonClickSecondaryActivity");
            String[] permission = {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.ACCESS_FINE_LOCATION};
            ActivityCompat.requestPermissions(SecondActivity.this, permission, REQUEST_CODE);
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
          //  showToast("Storage and Location Permission Granted");
          //  Toast.makeText(SecondActivity.this, "Button one clicked", Toast.LENGTH_SHORT).show();


        } else if (grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_DENIED) {
         //   showToast("Storage Granted And Location Permission Denied");


        } else if (grantResults[0] == PackageManager.PERMISSION_DENIED && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
          //  showToast("Storage Denied And Location Permission Granted");
            Toast.makeText(SecondActivity.this, "Button one clicked", Toast.LENGTH_SHORT).show();
        } else if (grantResults[0] == PackageManager.PERMISSION_DENIED && grantResults[1] == PackageManager.PERMISSION_DENIED) {
        //    showToast("Both Permissions Denied");


        }
    }


}