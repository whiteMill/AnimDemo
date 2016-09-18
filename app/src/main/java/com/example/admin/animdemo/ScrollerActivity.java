package com.example.admin.animdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 2016/9/18.
 */
public class ScrollerActivity extends AppCompatActivity implements myScrollerView.OnScrollerView{
    private myScrollerView myScrollerView;
    private ImageView mImageView;
    private MyListview myListview;
    private TextView textView;
    private ArrayList<String> dataList=new ArrayList<>();
    private int imageHeight;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);
        init();
        initData();
        myListview.setAdapter(new ArrayAdapter<String>(ScrollerActivity.this,android.R.layout.simple_list_item_1,dataList));
        initListeners();
    }

    private void initListeners() {
        // 获取顶部图片高度后，设置滚动监听
        ViewTreeObserver vto = mImageView.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                mImageView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                imageHeight = mImageView.getHeight();
                myScrollerView.setOnScrollerView(ScrollerActivity.this);
            }
        });
    }


    private void initData(){
        for (int i=0;i<20;i++){
            dataList.add("这是第"+i+"条数据");
        }
    }

    public void init(){
        myScrollerView= (com.example.admin.animdemo.myScrollerView) findViewById(R.id.myScrollView);
        myScrollerView.smoothScrollTo(0, 0);
        mImageView= (ImageView) findViewById(R.id.myImageView);
        myListview= (MyListview) findViewById(R.id.myListView);
        textView= (TextView) findViewById(R.id.mTextView);
    }

    @Override
    public void onScrollChanged(myScrollerView myScrollerView, int X, int Y, int oldX, int oldY) {
        if (Y <= 0) {
            textView.setBackgroundColor(Color.argb((int) 0, 227, 29, 26));//AGB由相关工具获得，或者美工提供
        } else if (Y > 0 && Y <= imageHeight) {
            float scale = (float) Y / imageHeight;
            float alpha = (255 * scale);
            // 只是layout背景透明(仿知乎滑动效果)
            textView.setBackgroundColor(Color.argb((int) alpha, 227, 29, 26));
        } else {
            textView.setBackgroundColor(Color.argb((int) 255, 227, 29, 26));
        }

    }
}
