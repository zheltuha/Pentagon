package com.example.pentagon;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generNum();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();                           //идентификатор выбранного пункта меню


        switch (id) {
            case R.id.action_calc1:
                Intent set_calc1 = new Intent(".CalculatorV1");
                startActivity(set_calc1);
                return true;

            case R.id.action_enter:
                Intent set_enter = new Intent(".enterPenta");
                startActivity(set_enter);
                return true;

            case R.id.action_settings:
                Intent set_settings = new Intent(".Settings");
                startActivity(set_settings);
                return true;

            case R.id.action_toExit:
                AlertDialog.Builder win_build = new AlertDialog.Builder(MainActivity.this);

                win_build.setMessage("Выйти из приложения?").setCancelable(false).setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog win_dow = win_build.create();
                win_dow.setTitle("Выход");
                win_dow.show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public int funcRandom1 () {
        EditText text1 = (EditText)findViewById(R.id.numOt);
        String str1 = (text1.getText().toString());

        if (str1.matches("")){                              //проверка на пустоту поля ввода
            return 1;
        }
        else {
            int rand1 = Integer.parseInt(text1.getText().toString());
            return rand1;
        }
    }

    public int funcRandom2() {
        EditText text2 = (EditText)findViewById(R.id.numDo);
        String str2 = (text2.getText().toString());

        if ( str2.matches("")) {
            return 1;
        }
        else {
            int rand2 = Integer.parseInt(text2.getText().toString());
            return rand2;
        }
    }

    public TextView inResult (){
        TextView resTex = (TextView)findViewById(R.id.resulRand);
        return resTex;
    }

    private Button randBut;

    public void generNum (){

        randBut = (Button)findViewById(R.id.butRand);
        randBut.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int r1 = funcRandom1();
                        int r2 = funcRandom2();

                        TextView resRandom = inResult();
                        int randomNum = r1 + (int) (Math.random() * ((r2 - r1)+1));

                        resRandom.setText(Float.toString(randomNum));
                    }
                }
        );


    }


}
