package com.example.adri.projectegithub;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class Activity_Restaurant extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener{
    public LinearLayout rest_esp1,rest_esp2,rest_esp3;
    public LinearLayout rest_it1,rest_it2,rest_it3;
    public LinearLayout rest_jp1,rest_jp2,rest_jp3;
    public Spinner sp ;
    public ImageView web_1,web_2,web_3,web_4,web_5,web_6,web_7,web_8,web_9;
    public ImageView tlf_1,tlf_2,tlf_3,tlf_4,tlf_5,tlf_6,tlf_7,tlf_8,tlf_9;
    private final static String[] categorias={"Seleccione una Categoria","Comida Española","Comida Italiana","Comida Japonesa"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__restaurant);

        ArrayAdapter adapter= new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,categorias);
        sp=(Spinner)findViewById(R.id.spinner2);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(this);

        rest_esp1=(LinearLayout)findViewById(R.id.rest_esp1);
        rest_esp2=(LinearLayout)findViewById(R.id.rest_esp2);
        rest_esp3=(LinearLayout)findViewById(R.id.rest_esp3);

        rest_it1=(LinearLayout)findViewById(R.id.rest_it1);
        rest_it2=(LinearLayout)findViewById(R.id.rest_it2);
        rest_it3=(LinearLayout)findViewById(R.id.rest_it3);

        rest_jp1=(LinearLayout)findViewById(R.id.rest_japo1);
        rest_jp2=(LinearLayout)findViewById(R.id.rest_japo2);
        rest_jp3=(LinearLayout)findViewById(R.id.rest_japo3);

        tlf_1=(ImageView)findViewById(R.id.tlf_jabugo);
        tlf_2=(ImageView)findViewById(R.id.tlf_eltrull);
        tlf_3=(ImageView)findViewById(R.id.tlf_naguabo);
        tlf_4=(ImageView)findViewById(R.id.tlf_kaori);
        tlf_5=(ImageView)findViewById(R.id.tlf_kirinRonda);
        tlf_6=(ImageView)findViewById(R.id.tlf_sushiAki);
        tlf_7=(ImageView)findViewById(R.id.tlf_littleItaly);
        tlf_8=(ImageView)findViewById(R.id.tlf_Taglitella);
        tlf_9=(ImageView)findViewById(R.id.tlf_sankt_pauli);

        web_1=(ImageView)findViewById(R.id.web_jabugo);
        web_2=(ImageView)findViewById(R.id.web_eltrull);
        web_3=(ImageView)findViewById(R.id.web_naguabo);
        web_4=(ImageView)findViewById(R.id.web_kaori);
        web_5=(ImageView)findViewById(R.id.web_kirinRonda);
        web_6=(ImageView)findViewById(R.id.web_sushiAki);
        web_7=(ImageView)findViewById(R.id.web_littleItaly);
        web_8=(ImageView)findViewById(R.id.web_la_Taglitella);
        web_9=(ImageView)findViewById(R.id.web_sankt_pauli);

        tlf_1.setOnClickListener(this);
        tlf_2.setOnClickListener(this);
        tlf_3.setOnClickListener(this);
        tlf_4.setOnClickListener(this);
        tlf_5.setOnClickListener(this);
        tlf_6.setOnClickListener(this);
        tlf_7.setOnClickListener(this);
        tlf_8.setOnClickListener(this);
        tlf_9.setOnClickListener(this);

        web_1.setOnClickListener(this);
        web_2.setOnClickListener(this);
        web_3.setOnClickListener(this);
        web_4.setOnClickListener(this);
        web_5.setOnClickListener(this);
        web_6.setOnClickListener(this);
        web_7.setOnClickListener(this);
        web_8.setOnClickListener(this);
        web_9.setOnClickListener(this);
    }
    public void onClick(View v){
        Intent intent;
        Uri url;
        switch (v.getId()){
            case R.id.web_jabugo:
                url = Uri.parse("http://www.google.es");
                intent =new Intent (Intent.ACTION_VIEW,url);
                startActivity(intent);break;
            case R.id.tlf_jabugo:
                url=Uri.parse("tel:+(34)634076725");
                intent=new Intent(Intent.ACTION_DIAL,url);
                startActivity(intent);break;
            case R.id.web_eltrull:
                url = Uri.parse("http://www.google.es");
                intent =new Intent (Intent.ACTION_VIEW,url);
                startActivity(intent);break;
            case R.id.tlf_eltrull:
                url=Uri.parse("tel:+(34)634076725");
                intent=new Intent(Intent.ACTION_DIAL,url);
                startActivity(intent);break;
            case R.id.web_naguabo:
                url = Uri.parse("http://www.google.es");
                intent =new Intent (Intent.ACTION_VIEW,url);
                startActivity(intent);break;
            case R.id.tlf_naguabo:
                url=Uri.parse("tel:+(34)634076725");
                intent=new Intent(Intent.ACTION_DIAL,url);
                startActivity(intent);break;
            case R.id.web_kaori:
                url = Uri.parse("http://www.google.es");
                intent =new Intent (Intent.ACTION_VIEW,url);
                startActivity(intent);break;
            case R.id.tlf_kaori:
                url=Uri.parse("tel:+(34)634076725");
                intent=new Intent(Intent.ACTION_DIAL,url);
                startActivity(intent);break;
            case R.id.web_kirinRonda:
                url = Uri.parse("http://www.google.es");
                intent =new Intent (Intent.ACTION_VIEW,url);
                startActivity(intent);break;
            case R.id.tlf_kirinRonda:
                url=Uri.parse("tel:+(34)634076725");
                intent=new Intent(Intent.ACTION_DIAL,url);
                startActivity(intent);break;
            case R.id.web_sushiAki:
                url = Uri.parse("http://www.google.es");
                intent =new Intent (Intent.ACTION_VIEW,url);
                startActivity(intent);break;
            case R.id.tlf_sushiAki:
                url=Uri.parse("tel:+(34)634076725");
                intent=new Intent(Intent.ACTION_DIAL,url);
                startActivity(intent);break;
            case R.id.web_la_Taglitella:
                url = Uri.parse("http://www.google.es");
                intent =new Intent (Intent.ACTION_VIEW,url);
                startActivity(intent);break;
            case R.id.tlf_Taglitella:
                url=Uri.parse("tel:+(34)634076725");
                intent=new Intent(Intent.ACTION_DIAL,url);
                startActivity(intent);break;
            case R.id.web_littleItaly:
                url = Uri.parse("http://www.google.es");
                intent =new Intent (Intent.ACTION_VIEW,url);
                startActivity(intent);break;
            case R.id.tlf_littleItaly:
                url=Uri.parse("tel:+(34)634076725");
                intent=new Intent(Intent.ACTION_DIAL,url);
                startActivity(intent);break;
            case R.id.web_sankt_pauli:
                url = Uri.parse("http://www.google.es");
                intent =new Intent (Intent.ACTION_VIEW,url);
                startActivity(intent);break;
            case R.id.tlf_sankt_pauli:
                url=Uri.parse("tel:+(34)634076725");
                intent=new Intent(Intent.ACTION_DIAL,url);
                startActivity(intent);break;
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

        //Toast.makeText(this,"Selección actual: "+parent.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT).show();
        switch (parent.getItemAtPosition(i).toString()) {
            case "Comida Española":
                if(rest_esp1.getVisibility()==View.GONE){
                    rest_esp1.setVisibility(View.VISIBLE);
                    rest_esp2.setVisibility(View.VISIBLE);
                    rest_esp3.setVisibility(View.VISIBLE);

                }
                if(rest_jp1.getVisibility()==View.VISIBLE){
                    rest_jp1.setVisibility(View.GONE);
                    rest_jp2.setVisibility(View.GONE);
                    rest_jp3.setVisibility(View.GONE);
                }
                if(rest_it1.getVisibility()==View.VISIBLE){
                    rest_it1.setVisibility(View.GONE);
                    rest_it2.setVisibility(View.GONE);
                    rest_it3.setVisibility(View.GONE);
                }
                break;
            case "Comida Italiana":
                if(rest_it1.getVisibility()==View.GONE){
                    rest_it1.setVisibility(View.VISIBLE);
                    rest_it2.setVisibility(View.VISIBLE);
                    rest_it3.setVisibility(View.VISIBLE);
                }

                if(rest_jp1.getVisibility()==View.VISIBLE){
                    rest_jp1.setVisibility(View.GONE);
                    rest_jp2.setVisibility(View.GONE);
                    rest_jp3.setVisibility(View.GONE);
                }
                if(rest_esp1.getVisibility()==View.VISIBLE){
                    rest_esp1.setVisibility(View.GONE);
                    rest_esp2.setVisibility(View.GONE);
                    rest_esp3.setVisibility(View.GONE);
                }
                break;
            case "Comida Japonesa":
                if(rest_jp1.getVisibility()==View.GONE){
                    rest_jp1.setVisibility(View.VISIBLE);
                    rest_jp2.setVisibility(View.VISIBLE);
                    rest_jp3.setVisibility(View.VISIBLE);
                }

                if(rest_it1.getVisibility()==View.VISIBLE){
                    rest_it1.setVisibility(View.GONE);
                    rest_it2.setVisibility(View.GONE);
                    rest_it3.setVisibility(View.GONE);
                }
                if(rest_esp1.getVisibility()==View.VISIBLE){
                    rest_esp1.setVisibility(View.GONE);
                    rest_esp2.setVisibility(View.GONE);
                    rest_esp3.setVisibility(View.GONE);
                }
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
