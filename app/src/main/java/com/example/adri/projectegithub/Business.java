package com.example.adri.projectegithub;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Business extends Activity implements View.OnClickListener {
    Spinner spinnersectors = (Spinner)findViewById(R.id.spinnerfiltre);
    ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.sectors,android.R.layout.simple_spinner_item);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);
        spinnersectors.setAdapter(adapter);
        spinnersectors.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


}
