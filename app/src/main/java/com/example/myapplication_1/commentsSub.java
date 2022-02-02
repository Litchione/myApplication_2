package com.example.myapplication_1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class commentsSub extends LinearLayout{

    public commentsSub(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    public commentsSub(Context context){
        super(context);

        init(context);
    }

    protected void init(Context context) {
        LayoutInflater inflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_comments_sub,this,true);
    }
}