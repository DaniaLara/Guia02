package com.example.g02lab.clase;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.g02lab.MainActivity.lstPersonas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.g02lab.R;
import com.example.g02lab.clase.Persona;

public class AgregarPersonaActivity extends AppCompatActivity {
    EditText EtexNombre, EtexApellido, EtexEdad, EtexCorreo;
    Button GOProcesar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_persona);

        EtexNombre = findViewById(R.id.EtexNombre);
        EtexApellido = findViewById(R.id.EtexApellido);
        EtexEdad = findViewById(R.id.EtexEdad);
        EtexCorreo = findViewById(R.id.EtexCorreo);
        GOProcesar = findViewById(R.id.GOProcesar);

        GOProcesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lstPersonas.add(new Persona(lstPersonas.size() + 1, EtexNombre.getText().toString(),
                        EtexApellido.getText().toString(), Integer.parseInt(EtexEdad.getText().toString()),
                        EtexCorreo.getText().toString()));

                Toast.makeText(AgregarPersonaActivity.this, "Inserción exitosa", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}