package com.example.mbarara_waste_solution;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SIGNIN extends AppCompatActivity {

    Button mybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        mybutton=findViewById(R.id.button6);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 =new Intent(SIGNIN.this,THIRD.class);
                startActivity(myintent1);
            }
        });
    }

}