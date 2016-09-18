package com.example.admin.animdemo;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView touMing;
    private TextView suoFang;
    private TextView fanZhuan;
    private TextView yiDong;
    private TextView zuHe;
    private ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        touMing= (TextView) findViewById(R.id.touMing);
        suoFang= (TextView) findViewById(R.id.suoFang);
        fanZhuan= (TextView) findViewById(R.id.fanZhuan);
        yiDong= (TextView) findViewById(R.id.yiDong);
        zuHe= (TextView) findViewById(R.id.zuHe);
        im= (ImageView) findViewById(R.id.im);
        touMing.setOnClickListener(this);
        suoFang.setOnClickListener(this);
        fanZhuan.setOnClickListener(this);
        yiDong.setOnClickListener(this);
        zuHe.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.touMing:
                ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(im,"alpha",0f,1f);
                objectAnimator.setDuration(500);
                objectAnimator.start();
                break;
            case R.id.fanZhuan:
                ObjectAnimator objectAnimator1=ObjectAnimator.ofFloat(im,"rotation",0f,360f);
                objectAnimator1.setDuration(500);
                objectAnimator1.setRepeatMode(ValueAnimator.RESTART);
                objectAnimator1.start();
                break;
            case R.id.zuHe:


                break;
        }



    }

   /* @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.touMing:
                Animation alphaAnimation= AnimationUtils.loadAnimation(this,R.anim.tou_ming);
                im.startAnimation(alphaAnimation);
                break;
            case R.id.suoFang:
                //缩放动画
                Animation ScaleAnimation=new ScaleAnimation(0f,1.5f,0f,1.5f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                ScaleAnimation.setDuration(500);
                ScaleAnimation.setFillAfter(false);
                ScaleAnimation.setFillBefore(false);
                ScaleAnimation.setRepeatCount(3);
                ScaleAnimation.setRepeatMode(Animation.REVERSE);
                ScaleAnimation.setStartOffset(0);
                im.startAnimation(ScaleAnimation);
                break;
            case R.id.fanZhuan:
                Animation RotaAnimation=new RotateAnimation(0,-360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                RotaAnimation.setDuration(500);
                RotaAnimation.setRepeatCount(3);
                im.startAnimation(RotaAnimation);
                break;
            case R.id.yiDong:
                Animation tranAnimation=new TranslateAnimation(0,100,0,100);
                tranAnimation.setDuration(500);
                tranAnimation.setInterpolator(this, android.R.anim.accelerate_decelerate_interpolator);//设置动画插入器
                im.startAnimation(tranAnimation);
                break;
            case R.id.zuHe:
               *//* AnimationSet animationSet=new AnimationSet(true);
                Animation scaAnimation=new AlphaAnimation(0f,1f);
                scaAnimation.setFillBefore(false);
                scaAnimation.setDuration(500);

                Animation RoAnimation=new RotateAnimation(0,-360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                RoAnimation.setDuration(500);

                animationSet.addAnimation(animationSet);
                animationSet.addAnimation(RoAnimation);
                im.startAnimation(animationSet);*//*
                AnimationSet animationSet = new AnimationSet(true);

                Animation alAnimation = new AlphaAnimation(0f, 1.0f);
                alAnimation.setDuration(500);//设置动画持续时间为500毫秒

               *//* Animation scaleAnimation = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                scaleAnimation.setDuration(500);//设置动画持续时间为500毫秒
                scaleAnimation.setRepeatMode(Animation.REVERSE);
                scaleAnimation.setStartOffset(0);
                scaleAnimation.setInterpolator(this, android.R.anim.decelerate_interpolator);//设置动画插入器*//*

                Animation RoAnimation=new RotateAnimation(0,-360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                RoAnimation.setDuration(500);

                animationSet.addAnimation(alAnimation);
                animationSet.addAnimation(RoAnimation);

                im.startAnimation(animationSet);

                break;


        }

    }*/
}
