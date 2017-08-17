package com.example.usgir.expe;

import android.animation.ObjectAnimator;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final AnimatedVectorDrawableCompat vectorDrawableCompat = AnimatedVectorDrawableCompat.create(getApplicationContext(),R.drawable.vectdrawable);
        final Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vectorDrawableCompat!=null)
                {
                    button.setBackground(vectorDrawableCompat);
                    vectorDrawableCompat.start();
                }
            }
        });
    }
}
