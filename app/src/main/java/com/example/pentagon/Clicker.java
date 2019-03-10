package com.example.pentagon;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Clicker extends AppCompatActivity {

    private ImageView tapCkick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicker);

        tapCkick = (ImageView)findViewById(R.id.imClickPlace);

        imageClick();
    }

    private int sumSuper, speed = 12;

    public void imageClick (){
        tapCkick.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sumSuper++;
                        TextView numClick = (TextView)findViewById(R.id.textClickMetr);
                        TextView speedClick = (TextView)findViewById(R.id.textSpeed);

                        numClick.setText("Clicks: "+Integer.toString(sumSuper));

                        if(sumSuper == 50 || sumSuper == 200){
                            speed = speed + 110;
                            speedClick.setText("Speed: "+Integer.toString(speed)+ " 000 km/h");
                        }

                    }
                }
        );
    }
}
