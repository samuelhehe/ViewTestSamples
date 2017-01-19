package com.samuelnotes.viewtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.FrameLayout;

import com.samuelnotes.viewtest.view.TouchForwardLayout;

/**
 * Created by samuelwang on 17/1/19.
 */

public class TouchForwardActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TouchForwardLayout layout = new TouchForwardLayout(this);

        Button button = new Button(this);
        button.setText("You Can't Miss Me!");

        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT, Gravity.CENTER);
        layout.addView(button, lp);
        setContentView(layout);

    }
}
