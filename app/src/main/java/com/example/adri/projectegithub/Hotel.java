package com.example.adri.projectegithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class Hotel extends AppCompatActivity
{
    private RatingBar ratingBar;
    private TextView txtRatingValue;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
    }
}
