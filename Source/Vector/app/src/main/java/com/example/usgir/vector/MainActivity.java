package com.example.usgir.vector;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.support.design.widget.Snackbar;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.textView);
        imageView = (ImageView)findViewById(R.id.imageView);
        final RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.layer);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimatedVectorDrawableCompat drawable = AnimatedVectorDrawableCompat.create(getApplicationContext(),R.drawable.animatedvector);
                if (drawable!=null)
                {
                    Snackbar.make(relativeLayout,"Yes",Snackbar.LENGTH_SHORT).show();
                    imageView.setImageDrawable(drawable);
                    drawable.start();
                }
                else
                    Snackbar.make(relativeLayout,"No",Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
