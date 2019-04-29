package com.example.mbarara_waste_solution;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class THIRD extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int x=item.getItemId();
        switch (x){

            case R.id.settings:
                Intent myintent =new Intent(THIRD.this,SETTINGS.class);
                startActivity(myintent);
                break;
            case R.id.report:
                Intent myintent1 =new Intent(THIRD.this,REPORT.class);
                startActivity(myintent1);
                break;
            case R.id.about:
                Intent myintent2 =new Intent(THIRD.this,ABOUT.class);
                startActivity(myintent2);
                break;
            case R.id.logout:
                Intent myintent3 =new Intent(THIRD.this,HomeActivity.class);
                startActivity(myintent3);
                break;
            default:
                return false;

        }

        return super.onOptionsItemSelected(item);
    }
}

