package com.example.pizzarecipes;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        logo = findViewById(R.id.logo);


        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.5f, 0.5f, 1.5f,
                            Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                    scaleAnimation.setDuration(5000);
                    logo.startAnimation(scaleAnimation);
                    sleep(5000);
                    Intent intent = new Intent(SplashActivity.this, ListePizzaActivity.class);
                    startActivity(intent);
                    SplashActivity.this.finish();

                } catch (InterruptedException e) {
                    Log.e("SplashActivity", "Thread interrupted", e);
                } catch (Exception e) {
                    Log.e("SplashActivity", "Error occurred", e);
                }

            }
        };
        t.start();
    }
}
