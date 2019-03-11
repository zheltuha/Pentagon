package com.example.pentagon;

import android.gesture.Gesture;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class Settings extends AppCompatActivity implements
        GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener{

    private TextView tap;
    private GestureDetectorCompat detecTap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        assert getSupportActionBar() != null;                    //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button

        tap = (TextView)findViewById(R.id.textSettings);
        detecTap = new GestureDetectorCompat(this, this);
        detecTap.setOnDoubleTapListener(this);

    }

    @Override
    public boolean onTouchEvent (MotionEvent event){
        detecTap.onTouchEvent(event);
        return super.onTouchEvent(event);
    }


    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }


    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        tap.setText("onSingleTapConfirmed" + e.toString());
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        tap.setText("onDoubleTap" + e.toString());
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        tap.setText("onDoubleTapEvent" + e.toString());
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
