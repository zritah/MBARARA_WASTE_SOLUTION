package com.example.mbarara_waste_solution;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SIGNUP extends AppCompatActivity {
    Button mybton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mybton=findViewById(R.id.btn3);
        mybton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 =new Intent(SIGNUP.this,SIGNIN.class);
                startActivity(myintent1);
            }
        });

    }
}
