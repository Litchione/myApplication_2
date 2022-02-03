package com.example.myapplication_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v4.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class comments extends AppCompatActivity {

    Button add_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

        add_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sub n_layout = new Sub(getApplicationContext());
                LinearLayout con = (LinearLayout)findViewById(R.id.con);
                con.addView(n_layout);

                Button but = (Button)container.findViewById(R.id.b1);
                but.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(comments.this, "클릭되었습니다.", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}