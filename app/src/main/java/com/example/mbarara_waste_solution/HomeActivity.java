package com.example.mbarara_waste_solution;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button mybutton;


    public static final String my_tag="the custom message ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        mybutton=findViewById(R.id.button);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 =new Intent(HomeActivity.this,SIGNIN.class);
                startActivity(myintent1);
            }
        });
        mybutton=findViewById(R.id.button2);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent =new Intent(HomeActivity.this,SIGNUP.class);
                startActivity(myintent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(my_tag,"onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(my_tag,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(my_tag,"onStop");
    }

}
