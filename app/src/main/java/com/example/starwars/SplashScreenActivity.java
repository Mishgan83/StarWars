package com.example.starwars;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashScreenActivity extends AppCompatActivity implements Animator.AnimatorListener {

    @BindView(R.id.logo) ImageView mlogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);
        ButterKnife.bind(this);
        ImageView logo = findViewById(R.id.logo);
        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.logo_animator);
        animator.setTarget(logo);
        animator.addListener(this);
        animator.start();

        //Log.d("TAG", "setContent");
        /*new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent(
                        SplashScreenActivity.this, HomeActivity.class
                );
                startActivity(intent);
                finish();
            }
        }, 800);
        */
    }


    @Override
    public void onAnimationStart(Animator animation) {

    }

    @Override
    public void onAnimationEnd(Animator animation) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationCancel(Animator animation) {

    }

    @Override
    public void onAnimationRepeat(Animator animation) {

    }
}
