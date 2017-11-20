package com.example.adri.projectegithub;

import android.app.Activity;
import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.adri.projectegithub.Business.Business;
import com.example.adri.projectegithub.Business.Business_Perruqueries;

public class MainActivity extends Activity implements View.OnClickListener {
    ImageView restaurant;
    ImageView business;
    ImageView hotels;
    ImageView movies;
    ImageView weather;
    ImageView events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restaurant =findViewById(R.id.imageView1);
        restaurant.setOnClickListener(this);
        business =findViewById(R.id.imageView2);
        business.setOnClickListener(this);
        movies =findViewById(R.id.imageView3);
        movies.setOnClickListener(this);
        weather =findViewById(R.id.imageView4);
        weather.setOnClickListener(this);
        events =findViewById(R.id.imageView5);
        events.setOnClickListener(this);
        hotels =findViewById(R.id.imageView6);
        hotels.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==restaurant)
        {
            //Intent intent = new Intent(this,$$$$.class); // $$$$ =nom del java dels restaurants
            //startActivity(intent);
        }
        else if (v==business)
        {
            Intent intent = new Intent(this,Business.class);
            startActivity(intent);
        }
        else if (v==movies)
        {
            Intent intent = new Intent(this,Movies.class);
            startActivity(intent);
        }
        else if (v==weather)
        {
            //Intent intent = new Intent(this,$$$$.class); // $$$$ =nom del java del temps
            //startActivity(intent);
        }
        else if (v==events)
        {
            //Intent intent = new Intent(this,$$$$.class); // $$$$ =nom del java dels events
            //startActivity(intent);
        }
        else if (v==hotels)
        {
            Intent intent = new Intent(this,Hotel.class);
            startActivity(intent);
        }

    }
}
