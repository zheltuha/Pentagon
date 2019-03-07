package com.example.pentagon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorV1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_v1);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    public int funcNum1 () {
        EditText text1 = (EditText)findViewById(R.id.textNum1);
        String str1 = (text1.getText().toString());

        if (str1.matches("")){
            return 0;
        }
        else {
            int num1 = Integer.parseInt(text1.getText().toString());
            return num1;
        }
    }

    public int funcNum2() {
        EditText text2 = (EditText) findViewById(R.id.textNum2);
        String str2 = (text2.getText().toString());

        if ( str2.matches("")) {
            return 0;
        }
        else {
            int num2 = Integer.parseInt(text2.getText().toString());
            return num2;
        }
    }

    public TextView inResult (){
        TextView resTex = (TextView)findViewById(R.id.textResul);
        return resTex;
    }

    public void sumButton (View v){
        int n1 = funcNum1();
        int n2 = funcNum2();
        TextView resTex = inResult();

        float resSum = n1 + n2;
        resTex.setText(Float.toString(resSum));
    }

    public void subButton (View v){
        int n1 = funcNum1();
        int n2 = funcNum2();
        TextView resTex = inResult();

        float resSub = n1 - n2;
        resTex.setText(Float.toString(resSub));
    }

    public void mulButton (View v){
        int n1 = funcNum1();
        int n2 = funcNum2();
        TextView resTex = inResult();

        float resMul = n1 * n2;
        resTex.setText(Float.toString(resMul));
    }

    public void divButton (View v){
        float n1 = funcNum1();
        float n2 = funcNum2();
        TextView resTex = inResult();

        float resDiv = n1 / n2;
        resTex.setText(Float.toString(resDiv));
    }
}
