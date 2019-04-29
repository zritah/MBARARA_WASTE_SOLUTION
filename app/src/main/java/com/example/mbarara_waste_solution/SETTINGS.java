package com.example.mbarara_waste_solution;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SETTINGS extends AppCompatActivity {

    ListView listView;
    ArrayList<String> array;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        listView = (ListView)findViewById(R.id.list1);
        array = new ArrayList();

        array.add("Account");
        array.add("Notifications");
        array.add("Invite s friend");
        array.add("Help");


        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,array);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(getApplicationContext()," "+array.get(position), Toast.LENGTH_SHORT).show();

            }
        });
    }
}