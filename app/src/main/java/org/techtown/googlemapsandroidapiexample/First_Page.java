package org.techtown.googlemapsandroidapiexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class First_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        Handler x = new Handler();
        x.postDelayed(new SplashHandler(), 5000);
    }

    public class SplashHandler implements Runnable {
        public void run() {
            Intent intent = new Intent(getApplicationContext(), MapActivity.class);
            startActivity(intent);
            finish();
        }
    }
}