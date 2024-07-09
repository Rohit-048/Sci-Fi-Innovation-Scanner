package com.example.sci_ficlub;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    private TextView sciFiTextView;
    private TextView innovationClubTextView;
    private LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        sciFiTextView = findViewById(R.id.sciFiText);
        innovationClubTextView = findViewById(R.id.innovationClubText);
        lottieAnimationView = findViewById(R.id.animationView);

        startAnimation();

        // Navigate to MainActivity after 2 seconds
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 2500);
    }

    private void startAnimation() {
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(1000); // 1 second
        fadeIn.setStartOffset(500); // Start after 0.5 second

        sciFiTextView.startAnimation(fadeIn);
        innovationClubTextView.startAnimation(fadeIn);
        lottieAnimationView.startAnimation(fadeIn);
    }
}
