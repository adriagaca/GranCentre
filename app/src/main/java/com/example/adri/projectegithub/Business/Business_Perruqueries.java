package com.example.adri.projectegithub.Business;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.adri.projectegithub.R;

public class Business_Perruqueries extends Activity implements View.OnClickListener {
    Button Back = (Button)findViewById(R.id.Back);
    TextView Link1 = (TextView)findViewById(R.id.LinkPrimeraPerruqueria);
    TextView Link2 = (TextView)findViewById(R.id.LinkSegonaPerruqueria);
    TextView Link3 = (TextView)findViewById(R.id.LinkTerceraPerruqueria);
    TextView Link4 = (TextView)findViewById(R.id.LinkQuartaPerruqueria);
    TextView Link5 = (TextView)findViewById(R.id.LinkCinquenaPerruqueria);
    TextView Tlf1 = (TextView)findViewById(R.id.TlfPerruqueria1);
    TextView Tlf2 = (TextView)findViewById(R.id.TlfPerruqueria2);
    TextView Tlf3 = (TextView)findViewById(R.id.TlfPerruqueria3);
    TextView Tlf4 = (TextView)findViewById(R.id.TlfPerruqueria4);
    TextView Tlf5 = (TextView)findViewById(R.id.TlfPerruqueria5);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business__perruqueries);
    }

    @Override
    public void onClick(View view) {
        if(view==Link1)
        {
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https//:www.google.es"));
            startActivity(intent);
        }
        else if (view==Link2)
        {
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https//:www.google.es"));
            startActivity(intent);
        }
        else if (view==Link3)
        {
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https//:www.google.es"));
            startActivity(intent);
        }
        else if (view==Link4)
        {
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https//:www.google.es"));
            startActivity(intent);
        }
        else if (view==Link5)
        {
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https//:www.google.es"));
            startActivity(intent);
        }
        else if (view==Tlf1)
        {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tlf:+34900000000"));
            startActivity(intent);
        }
        else if (view==Tlf2)
        {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tlf:+34900000000"));
            startActivity(intent);
        }
        else if (view==Tlf3)
        {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tlf:+34900000000"));
            startActivity(intent);
        }
        else if (view==Tlf4)
        {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tlf:+34900000000"));
            startActivity(intent);
        }
        else if (view==Tlf5)
        {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tlf:+34900000000"));
            startActivity(intent);
        }
        else if (view==Back)
        {
            Intent intent =new Intent(getApplicationContext(),Business.class);
            startActivity(intent);
        }

    }
}
