package com.example.bhavyasingh.boombutton;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab_twitter,fab_fb,fab_plus;
    Animation FabOpen,FabClose,FabRClockwise,FabRanticlockwise;
    boolean isOpen=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab_plus=(FloatingActionButton)findViewById(R.id.fab_plus);
        fab_fb=(FloatingActionButton)findViewById(R.id.fab_fb);
        fab_twitter=(FloatingActionButton)findViewById(R.id.fab_twitter);

        FabOpen= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_open);
        FabClose=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        FabRClockwise=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clockwise);
        FabRanticlockwise=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_anticlockwise);

        fab_plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(isOpen){
                    fab_fb.startAnimation(FabClose);
                    fab_twitter.startAnimation(FabClose);
                    fab_plus.startAnimation(FabRanticlockwise);
                    fab_twitter.setClickable(false);
                    fab_fb.setClickable(false);
                    isOpen=false;

                }
                else {
                    fab_fb.startAnimation(FabOpen);
                    fab_twitter.startAnimation(FabOpen);
                    fab_plus.startAnimation(FabRClockwise);
                    fab_twitter.setClickable(true);
                    fab_fb.setClickable(true);
                    isOpen=true;
                }

            }


        });

    }
}
