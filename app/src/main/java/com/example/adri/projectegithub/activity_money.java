package com.example.adri.projectegithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_money extends AppCompatActivity implements  AdapterView.OnItemSelectedListener  {
    public Spinner sp_ori,sp_desti;

    public EditText numero;
    public TextView cifra_desti;
    double valor_divisa,resultado,n_ori;
    public String muestra_res;
    private final static String[] moneda_ori={"€"};//,"$","£"};
    private final static String[] moneda_desti={"Seleccione Divisa Destino","$","£"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);

        ArrayAdapter adp_ori=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,moneda_ori);
        ArrayAdapter adp_desti=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,moneda_desti );

        sp_ori=(Spinner)findViewById(R.id.sp_ori);
        sp_desti=(Spinner)findViewById(R.id.sp_desti);

        sp_ori.setAdapter(adp_ori);
        sp_desti.setAdapter(adp_desti);

        // sp_ori.setOnItemSelectedListener(this);
        sp_desti.setOnItemSelectedListener(this);
    }

    public void Convertir(View v){
        //PASAR DE EDIT TEXT A VALUE TIPO INTEGER
        numero=(EditText)findViewById(R.id.n);
        n_ori=Double.parseDouble(numero.getText().toString());

        cifra_desti=(TextView)findViewById(R.id.result);
        //cifra_desti.setText(numero.getText().toString());
        resultado=n_ori*valor_divisa;
        muestra_res=new Double(resultado).toString();
        cifra_desti.setText(muestra_res);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
        switch (parent.getItemAtPosition(i).toString()){
            case"$":valor_divisa=1.18199;break;
            case"£":valor_divisa=0.89624;break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
