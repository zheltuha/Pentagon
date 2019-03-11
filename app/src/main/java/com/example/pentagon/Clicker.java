package com.example.pentagon;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.CheckedOutputStream;

public class Clicker extends AppCompatActivity {

    private ImageView tapCkick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicker);

        tapCkick = (ImageView)findViewById(R.id.imClickPlace);

        imageClick();
    }

    private int Clicks, speed = 59;

    public void imageClick (){
        tapCkick.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Clicks++;
                        TextView sumClick = (TextView)findViewById(R.id.textClickMetr);
                        TextView speedR = (TextView)findViewById(R.id.textSpeed);

                        sumClick.setText("Clicks: "+Integer.toString(Clicks));

                        if(Clicks == 50 || Clicks == 150 || Clicks ==250 || Clicks == 350|| Clicks == 450 || Clicks ==  550){
                            speed = speed + 93;
                            speedR.setText("Speed: "+Integer.toString(speed)+ " 000 km/h");
                        }
                    }
                }
        );
    }

}
