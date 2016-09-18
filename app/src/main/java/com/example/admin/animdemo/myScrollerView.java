package com.example.admin.animdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by admin on 2016/9/18.
 */
public class myScrollerView extends ScrollView {

    public interface OnScrollerView{
         void onScrollChanged(myScrollerView myScrollerView,int X,int Y,int oldX,int oldY);
    }

    public OnScrollerView onScrollerView=null;

    public void setOnScrollerView(OnScrollerView onScrollerView) {
        this.onScrollerView = onScrollerView;
    }

    public myScrollerView(Context context) {
        super(context);
    }

    public myScrollerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public myScrollerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if(onScrollerView !=null){
            onScrollerView.onScrollChanged(this,l,t,oldl,oldt);
        }
    }
}
