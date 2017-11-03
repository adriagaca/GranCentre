package com.example.adri.projectegithub.Business;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.adri.projectegithub.R;

public class Business extends Activity {
    Spinner spinnersectors = (Spinner)findViewById(R.id.spinnerfiltre);
    ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.sectors,android.R.layout.simple_spinner_item);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);
        spinnersectors.setAdapter(adapter);
        spinnersectors.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View v, int i, long l)
            {
                Object item = adapterView.getItemAtPosition(i);
                if(item== "Restaurants")
                {
                    Intent intent =new Intent(getApplicationContext(),Business_Restaurants.class);
                    startActivity(intent);
                }
                else if (item=="Perruqueries")
                {
                    Intent intent =new Intent(getApplicationContext(),Business_Perruqueries.class);
                    startActivity(intent);
                }
                else if(item=="Botigues")
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
