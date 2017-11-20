package com.example.adri.projectegithub;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity_Restaurant extends AppCompatActivity implements View.OnClickListener{

    public ImageView web,tlf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__restaurant);

        web=(ImageView)findViewById(R.id.web_jabugo);
        web.setOnClickListener(this);
        tlf=(ImageView)findViewById(R.id.tlf_jabugo);
        tlf.setOnClickListener(this);
    }
    public void onClick(View v){
        Intent intent ;
        Uri url;
        switch (v.getId()){
            case R.id.web_jabugo:
                url =Uri.parse("http://www.google.es");
                intent= new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);break;
            case (R.id.tlf_jabugo):
                url=Uri.parse("tel:+(34)634076725");
                intent= new Intent(Intent.ACTION_DIAL,url);//si queremos marcar el tlf es ACTION_DIAL per ACTION_CALL, pero tambien hay q añadir los permisos en el manifest
                startActivity(intent);break;
            case(R.id.img_jabugo_prueba_gps):
                url=Uri.parse("geo:<41.607074>,<2.289669>?z=<zoom>&q=<41.607074>,<2.289669>(Ubicacio Real)");
                intent=new Intent(Intent.ACTION_VIEW,url);
                startActivity(intent);break;
        }
    }
}
