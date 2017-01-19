package com.samuelnotes.viewtest;

import android.app.Activity;
import android.os.Bundle;

import com.samuelnotes.viewtest.view.TouchDelegateLayout;

/**
 * Created by samuelwang on 17/1/18.
 */

public class TouchDelegateActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TouchDelegateLayout layout = new TouchDelegateLayout(this);
        setContentView(layout);
    }


}
