package com.example.g02lab;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import com.example.g02lab.clase.AcercaDeActivity;
import com.example.g02lab.clase.AgregarPersonaActivity;
import com.example.g02lab.clase.MostrarPersonaActivity;
import com.example.g02lab.clase.Persona;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Persona> lstPersonas = new ArrayList<>();
    private ListView lsvPersona;
    private Button btnAniadir, btnverLista,btnAcercaDE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAniadir = findViewById(R.id.btnAniadir);

        btnverLista = findViewById(R.id.btnverLista);

        btnAcercaDE = findViewById(R.id.btnAcercaDE);

        btnAniadir.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AgregarPersonaActivity.class));
        });

        btnverLista.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MostrarPersonaActivity.class));

        });
        btnAcercaDE.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AcercaDeActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

    }
    @Override
    protected void onResume() {
        super.onResume();

    }
    @Override
    protected void onPause() {
        super.onPause();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
    @Override
    protected void onRestart() {
        super.onRestart();

    }
}