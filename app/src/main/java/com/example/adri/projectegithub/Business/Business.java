package com.example.adri.projectegithub.Business;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.adri.projectegithub.R;

public class Business extends AppCompatActivity {
    Spinner spinnersectors;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);
        adapter = ArrayAdapter.createFromResource(this, R.array.sectors,android.R.layout.simple_spinner_item);
        spinnersectors = (Spinner)findViewById(R.id.spinnerfiltre);
        spinnersectors.setAdapter(adapter);
        spinnersectors.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View v, int i, long l)
            {
                Object item = adapterView.getItemAtPosition(i);
                if(i==1)
                {
                    Intent intent =new Intent(getApplicationContext(),Business_Inmobiliaries.class);
                    startActivity(intent);
                }
                else if (i==2)
                {
                    Intent intent =new Intent(getApplicationContext(),Business_Perruqueries.class);
                    startActivity(intent);
                }
                else if(i==3)
                {
                    Intent intent =new Intent(getApplicationContext(),Business_Botigues.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


}
