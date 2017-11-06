package com.example.adri.projectegithub.Business;

import android.app.Activity;
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

    }
}
