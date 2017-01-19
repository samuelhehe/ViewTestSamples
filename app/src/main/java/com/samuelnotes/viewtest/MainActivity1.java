package com.samuelnotes.viewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity1 extends AppCompatActivity {


    private Button act_btn;
    private Button act_btn1;
    private Button act_btn2;
    private ImageView act_iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act_btn = (Button) this.findViewById(R.id.act_btn);
        act_btn1 = (Button) this.findViewById(R.id.act_btn1);
        act_btn2 = (Button) this.findViewById(R.id.act_btn2);
        act_iv = (ImageView) this.findViewById(R.id.act_iv);

        act_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity ", "onClick " + view);
            }
        });
        act_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d("MainActivity ", "onTouch  action: " + motionEvent.getAction());
                // 0 down 2 move 1 up
                return true;
            }
        });

//        act_btn1.setClickable(false);
//        act_btn1.setEnabled(false);
        act_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity ", "onClick " + view);
            }
        });
        act_btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d("MainActivity ", "onTouch  action: " + motionEvent.getAction());
                // 0 down 2 move 1 up
                return false;
            }
        });
        act_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity ", "onClick " + view);
            }
        });
        act_btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d("MainActivity ", "onTouch  action: " + motionEvent.getAction());
                // 0 down 2 move 1 up
                return true;
            }
        });

//        act_iv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("MainActivity ", "onClick " + view);
//            }
//        });

        act_iv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d("MainActivity ", "onTouch  action: " + motionEvent.getAction());
                // 0 down 2 move 1 up
                return false;
            }
        });


    }


}
