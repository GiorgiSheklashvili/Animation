package com.example.mac12.animation;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
ImageView imageView,imageview1;
    Animation anim,anim1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.imageview1);
        imageview1=(ImageView) findViewById(R.id.imageView2);
//        anim=AnimationUtils.loadAnimation(this,R.anim.scale_in);
        anim1=AnimationUtils.loadAnimation(this,R.anim.translate);

    }


    public void onClick(View view) {
//        imageView.startAnimation(anim);
        imageView.animate().scaleX(1f).scaleY(1f).setDuration(300).setInterpolator(new OvershootInterpolator());

    }

    public void rotation(View view) {
        imageview1.startAnimation(anim1);
    }
}
