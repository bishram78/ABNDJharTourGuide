package com.bishram.jharkhand.tour.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.bishram.jharkhand.tour.R;

public class SplashActivity extends AppCompatActivity {

    // AN INTERVAL OF TIME THAT IS IN MILLISECONDS
    private static final int TIME_DELAYED = 3000;

    // This method is called when the activity is first created.
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        View view = findViewById(R.id.click_me);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                //finish();
            }
        });
//        startMainActivity();
    }

    // This method is called after a time interval of 3000 milliseconds.
    protected void startMainActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /*
                 * An Intent that will be take effected after the completion of the time interval.
                 * This will lead to the Main Activity.
                 * Also finishes this (current) activity.
                 */
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, TIME_DELAYED);
    }
}
