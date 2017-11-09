package com.example.adri.projectegithub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.adri.projectegithub.Business.Business;
import com.example.adri.projectegithub.Business.Business_Perruqueries;

public class MainActivity extends AppCompatActivity {


    public ImageView hotel,restaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hotel = (ImageView) findViewById(R.id.imageView6);
        hotel.setOnClickListener(this);
        restaurants = (ImageView) findViewById(R.id.imageView1);
        restaurants.setOnClickListener(this);
    }
    public  void gotoresta(View v){
        startActivity(new Intent(this,Activity_Restaurant.class));
    }
    public void hotels (View v)
    {
        startActivity(new Intent(this,Business_Perruqueries.class));
    }

    public  void gotobusiness(View v){

        Intent hola = new Intent(this,Business.class);
        startActivity(hola);

        switch (v.getId())
        {
            case R.id.imageView6: startActivity(new Intent(this,Hotel.class));
                break;
            case R.id.imageView1: startActivity(new Intent(this,Activity_Restaurant.class));
                break;
        }

    }
}
