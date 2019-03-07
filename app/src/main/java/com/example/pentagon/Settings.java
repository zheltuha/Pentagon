package com.example.pentagon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }



}
