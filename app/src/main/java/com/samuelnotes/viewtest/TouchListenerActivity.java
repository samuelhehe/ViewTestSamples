package com.samuelnotes.viewtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;

/**
 * Created by samuelwang on 17/1/18.
 */

public class TouchListenerActivity extends Activity implements View.OnTouchListener {


    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touch_listener);
        checkBox = (CheckBox) findViewById(R.id.checkbox_lock);
        findViewById(R.id.selection_first).setOnTouchListener(this);
        findViewById(R.id.selection_second).setOnTouchListener(this);
        findViewById(R.id.selection_third).setOnTouchListener(this);


    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        Log.d("onTouch", "event-->>"+ getNameForEvent(event));

        return checkBox.isChecked();
    }

    private String getNameForEvent(MotionEvent event) {
        String action = "";
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                action = "ACTION_DOWN";
                break;
            case MotionEvent.ACTION_CANCEL:
                action = "ACTION_CANCEL";
                break;
            case MotionEvent.ACTION_MOVE:
                action = "ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                action = "ACTION_UP";
                break;
            default:
                return null;
        }

        return String.format("%s\n%.1f, %.1f", action, event.getX(), event.getY());
    }


}
