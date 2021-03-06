package com.example.adri.projectegithub.Business;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.adri.projectegithub.R;

public class Business_Perruqueries extends Activity implements View.OnClickListener {
    Button Back;

    ImageView Link1;
    ImageView Link2;
    ImageView Link3;
    ImageView Link4;
    ImageView Link5;
    ImageView Tlf1;
    ImageView Tlf2;
    ImageView Tlf3;
    ImageView Tlf4;
    ImageView Tlf5;
    ImageView Ubi1;
    ImageView Ubi2;
    ImageView Ubi3;
    ImageView Ubi4;
    ImageView Ubi5;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business__perruqueries);
        Back = findViewById(R.id.Back);
        Back.setOnClickListener(this);
        Link1 = findViewById(R.id.LinkPrimeraPerruqueria);
        Link1.setOnClickListener(this);
        Link2 = findViewById(R.id.LinkSegonaPerruqueria);
        Link2.setOnClickListener(this);
        Link3 = findViewById(R.id.LinkTerceraPerruqueria);
        Link3.setOnClickListener(this);
        Link4 = findViewById(R.id.LinkQuartaPerruqueria);
        Link4.setOnClickListener(this);
        Link5 = findViewById(R.id.LinkCinquenaPerruqueria);
        Link5.setOnClickListener(this);
        Tlf1 = findViewById(R.id.TlfPerruqueria1);
        Tlf1.setOnClickListener(this);
        Tlf2 = findViewById(R.id.TlfPerruqueria2);
        Tlf2.setOnClickListener(this);
        Tlf3 = findViewById(R.id.TlfPerruqueria3);
        Tlf3.setOnClickListener(this);
        Tlf4 = findViewById(R.id.TlfPerruqueria4);
        Tlf4.setOnClickListener(this);
        Tlf5 = findViewById(R.id.TlfPerruqueria5);
        Tlf5.setOnClickListener(this);
        Ubi1 = findViewById(R.id.pubi1);
        Ubi1.setOnClickListener(this);
        Ubi2 = findViewById(R.id.pubi2);
        Ubi2.setOnClickListener(this);
        Ubi3 = findViewById(R.id.pubi3);
        Ubi3.setOnClickListener(this);
        Ubi4 = findViewById(R.id.pubi4);
        Ubi4.setOnClickListener(this);
        Ubi5 = findViewById(R.id.pubi5);
        Ubi5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==Link1)
        {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("www.salomogas.com")));

        }
        else if (v==Link2)
        {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("www.grupganzo.com")));

        }
        else if (v==Link3)
        {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https//:www.margaretperruquers.com")));

        }
        else if (v==Link4)
        {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("www.mesquesol.com")));

        }
        else if (v==Link5)
        {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https//:www.raffelpages.com/centro/raffel-pages")));

        }
        else if (v==Tlf1)
        {
            startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+34900000001")));
        }
        else if (v==Tlf2)
        {
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+34900000002"))) ;

        }
        else if (v==Tlf3)
        {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+34900000003"));
            startActivity(intent);
        }
        else if (v==Tlf4)
        {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+34900000004"));
            startActivity(intent);
        }
        else if (v==Tlf5) {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+34900000005"));
            startActivity(intent);
        }
        else if(v==Ubi1)
        {
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:22.3,33.2"));
            startActivity(intent);
        }
        else if (v==Ubi2)
        {
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:22.3,33.2"));
            startActivity(intent);
        }
        else if (v==Ubi3)
        {
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:22.3,33.2"));
            startActivity(intent);
        }
        else if (v==Ubi4)
        {
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:22.3,33.2"));
            startActivity(intent);
        }
        else if (v==Ubi5)
        {
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:22.3,33.2"));
            startActivity(intent);
        }
        else if(v==Back)
        {
            Intent intent =new Intent(getApplicationContext(),Business.class);
            startActivity(intent);
        }


    }
}
