package com.example.myapplication2.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class PlaceMedActivity extends Activity {
    ImageView pulseCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_med);
        pulseCircle = (ImageView) findViewById(R.id.pulseCircleView);
        pulseCircle.setAnimation(AnimationUtils.loadAnimation(this, R.anim.grow_and_fade));
        pulseCircle.setColorFilter(R.color.red);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                endAnimations();
            }
        }, 8000);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_place_med, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void endAnimations() {
        pulseCircle.clearAnimation();
        ImageView numberCircle = (ImageView) findViewById(R.id.numberView);
        LinearLayout title = (LinearLayout) findViewById(R.id.placeMedTitle);
        title.setBackgroundColor(getResources().getColor(R.color.green));
        numberCircle.setImageDrawable(getResources().getDrawable(R.drawable.number3_green));
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                launchDetails();
            }
        }, 1000);
    }

    private void launchDetails() {
        Intent myIntent = new Intent(getBaseContext(), TabDetailsActivity.class);
        startActivity(myIntent);
        finish();
    }
}
