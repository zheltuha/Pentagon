package com.example.pentagon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class enterPenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_penta);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        loginPenta();
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    private Button pentaButEnter;
    private EditText pentaLogin, pentaPass;

    private static final String checkLoginPenta = "admin";
    private static final String checkPassPenta = "admin";

    public void loginPenta(){

        pentaButEnter = (Button)findViewById(R.id.butPentaEnter);
        pentaLogin = findViewById(R.id.textPentaLog);
        pentaPass = findViewById(R.id.textPentaPass);

        pentaButEnter.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (checkLoginPenta.equals(String.valueOf(pentaLogin.getText())) && checkPassPenta.equals(String.valueOf(pentaPass.getText()))){
                            TextView enterTru =findViewById(R.id.textAuto);
                            enterTru.setText("Вход выполнен!");

//                            Intent mainWin = new Intent(".MainActivity");
//                            startActivity(mainWin);
                        }
                    }
                }
        );
    }
}
