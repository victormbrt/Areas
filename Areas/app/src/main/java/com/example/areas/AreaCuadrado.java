package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AreaCuadrado extends AppCompatActivity {

    private EditText Resulado,Lado1,Lado2;
    private Button BtnCalcular,regresar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_cuadrado);

        regresar = (Button) findViewById(R.id.btn_Regresar);
        Resulado = (EditText) findViewById(R.id.edt_ResultadoC);
        Lado1 = (EditText) findViewById(R.id.edt_ladouno);
        Lado2 = (EditText) findViewById(R.id.edt_ladodos);

        BtnCalcular = (Button) findViewById(R.id.btn_calcular);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AreaCuadrado.this, MainActivity.class));
            }
        });
        BtnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double ladouno = Double.parseDouble(Lado1.getText().toString());
                Double Ladodos = Double.parseDouble(Lado2.getText().toString());
                Double Resc = ladouno * Ladodos;

                 Resulado.setText(""+Resc);

            }




        });



    }
}