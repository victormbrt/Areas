package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AreaTriangulo extends AppCompatActivity {

    private EditText ResulTriangulo,Altura,Base;
    private Button BtnCalcularT, regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_triangulo);


        ResulTriangulo = (EditText) findViewById(R.id.edt_ResultadoT);
        Altura = (EditText) findViewById(R.id.edt_altura);
        Base = (EditText) findViewById(R.id.edt_base);
        BtnCalcularT = (Button) findViewById(R.id.btn_calcularT);
        regresar = (Button) findViewById(R.id.btn_Regresar);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AreaTriangulo.this, MainActivity.class));
            }
        });
       BtnCalcularT.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              Double Al = Double.parseDouble(Altura.getText().toString());
              Double Ba = Double.parseDouble(Base.getText().toString());
              Double Res = (Al * Ba) / 2;
              ResulTriangulo.setText(""+Res);
           }
       });

    }
}