package com.example.myapplication2.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class StatusActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        ImageView circle = (ImageView) findViewById(R.id.circleView2);
        circle.setAnimation(AnimationUtils.loadAnimation(this, R.anim.spin));
    }
}