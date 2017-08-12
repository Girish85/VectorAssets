package com.example.usgir.customvector;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    AnimatedVectorDrawableCompat drawable;
    ObjectAnimator animator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageView2);
        drawable = AnimatedVectorDrawableCompat.create(getApplicationContext(),R.drawable.animated);
        animator = new ObjectAnimator().ofFloat(imageView,"translationY",0.0f,-450.0f);
        animator.setDuration(500);
        animator.setStartDelay(400);
        //imageView.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
                if (drawable!=null)
                {
                    imageView.setImageDrawable(drawable);
                    animator.start();
                    drawable.start();
                }
            //}
        //});
    }
}
