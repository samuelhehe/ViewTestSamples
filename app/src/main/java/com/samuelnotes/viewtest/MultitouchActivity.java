package com.samuelnotes.viewtest;

import android.app.Activity;
import android.os.Bundle;

import com.samuelnotes.viewtest.view.RotateZoomImageView;

/**
 * Created by samuelwang on 17/1/19.
 */

public class MultitouchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RotateZoomImageView iv = new RotateZoomImageView(this);
        iv.setImageResource(R.mipmap.ic_launcher);

        setContentView(iv);
    }
}
