package com.samuelnotes.viewtest;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

/**
 * Created by samuelwang on 17/1/18.
 */

public class MoveLoggerActivity extends Activity implements View.OnTouchListener {


    private int touchSlop;
    private Point touchPoint;
    private VelocityTracker velocityTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.move_logger);

        findViewById(R.id.view_logslop).setOnTouchListener(this);
        findViewById(R.id.view_logall).setOnTouchListener(this);

        touchSlop = ViewConfiguration.get(this).getScaledTouchSlop();
        velocityTracker = VelocityTracker.obtain();

        touchPoint = new Point();


    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            touchPoint.set((int) event.getX(), (int) event.getY());
            return true;
        } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
            velocityTracker.addMovement(event);
            switch (v.getId()) {

                case R.id.view_logslop:

                    if (Math.abs(event.getX() - touchPoint.x) > touchSlop
                            || Math.abs(event.getY() - touchPoint.y) > touchSlop) {

//                        Log.i("view_logslop", String.format("Bottom Move: %.1f,%.1f", event.getX(), event.getY()));
                    }
                    velocityTracker.computeCurrentVelocity(1000);

                    Log.i("view_logslop", String.format("Bottom velocity:  X  %.1f, y %.1f",  velocityTracker.getXVelocity(),  velocityTracker.getYVelocity()));


                    break;

                case R.id.view_logall:

                    Log.d("view_logall", "x -->> " + touchPoint.x + " y -->> " + touchPoint.y);

                    break;
            }

        }
        return false;
    }


    @Override
    protected void onStop() {
        super.onStop();
        if(velocityTracker!=null){
            velocityTracker.clear();
            velocityTracker.recycle();
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


    }
}
