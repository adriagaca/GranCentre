package com.example.adri.projectegithub;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Hotel extends AppCompatActivity implements View.OnClickListener
{
    private RatingBar ratingBar;
    private TextView txtRatingValue;
    public ImageView web1, telefon1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        listenerForRatingBar();

        web1 = (ImageView) findViewById(R.id.imageView10);
        web1.setOnClickListener(this);
        telefon1 = (ImageView) findViewById(R.id.imageView9);
        telefon1.setOnClickListener(this);

    }

    public RatingBar listenerForRatingBar()
    {
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        txtRatingValue = (TextView) findViewById(R.id.textView);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener()
        {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b)
            {
                txtRatingValue.setText(String.valueOf(v));
            }
        });
        return ratingBar;
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.imageView10: Uri uriUrl = Uri.parse("www.fondaeuropa.eu");
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);//aixo no funciona demanar a la eva com coñ es fa
                startActivity(intent);
                break;
            /*case R.id.imageView9: Uri uriUrl = Uri.parse("www.fondaeuropa.eu");
                break;*/

        }
    }
}
