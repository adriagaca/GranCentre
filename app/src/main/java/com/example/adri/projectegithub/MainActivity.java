package com.example.adri.projectegithub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.adri.projectegithub.Business.Business;
import com.example.adri.projectegithub.Business.Business_Perruqueries;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener{

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


        @Override
        public void onClick(View v)
        {
            switch (v.getId())
            {
                case R.id.imageView6: startActivity(new Intent(this,Hotel.class));
                    break;
                case R.id.imageView1: startActivity(new Intent(this,Activity_Restaurant.class));
                    break;
            }

        }
    }