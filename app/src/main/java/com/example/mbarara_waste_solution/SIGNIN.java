package com.example.mbarara_waste_solution;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mbarara_waste_solution.R;

public class SIGNIN extends AppCompatActivity{

    Button mybutton;
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputUsername;
    private TextInputLayout textInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        mybutton=findViewById(R.id.btn6);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 =new Intent(SIGNIN.this,THIRD.class);
                startActivity(myintent1);
            }
        });

        textInputEmail = findViewById(R.id.text_input_email);
        textInputUsername= findViewById(R.id.text_input_username);
        textInputPassword=findViewById(R.id.text_input_password);
    }
    private boolean validateEmail(){
        String emailInput= textInputEmail.getEditText().getText().toString().trim();
        if(emailInput.isEmpty()){
            textInputEmail.setError("Field can't  be empty");
            return false;
        }else {
            textInputEmail.setError(null);
            return true;
        }
    }

    private boolean validateUsername(){
        String usernameInput= textInputUsername.getEditText().getText().toString().trim();
        if(usernameInput.isEmpty()){
            textInputUsername.setError("Field can't  be empty");
            return false;
        }else if(usernameInput.length()>15) {
            textInputUsername.setError("Username too long");
            return false;
        }else {
            textInputPassword.setError(null);
            return true;
        }
    }
    private boolean validatePawssword(){
        String passwordInput= textInputPassword.getEditText().getText().toString().trim();
        if(passwordInput.isEmpty()){
            textInputPassword.setError("Field can't  be empty");
            return false;
        }else {
            textInputPassword.setError(null);
            return true;
        }
    }
    public void confirmInput(View v){
        if (!validateEmail()|!validateUsername()|validatePawssword()){
            return;
        }
        String input="Email"+ textInputEmail.getEditText().getText().toString();
        input+="\n";
        input+="Username"+ textInputUsername.getEditText().getText().toString();
        input+="\n";
        input+="Password"+ textInputPassword.getEditText().getText().toString();
        Toast.makeText(this, "input", Toast.LENGTH_SHORT).show();
    }
}
