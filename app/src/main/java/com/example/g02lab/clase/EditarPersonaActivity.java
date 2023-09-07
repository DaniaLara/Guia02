package com.example.g02lab.clase;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import com.example.g02lab.R;


public class EditarPersonaActivity extends AppCompatActivity {
    private EditText edtNombreEdit, edtApelEdit, edtEdadEdit, edtCorreoEdit;
    private Button btnGuardarEdit;
    private Persona personaAEditar; // Persona a editar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_persona);

        edtNombreEdit = findViewById(R.id.edtNombreEdit);
        edtApelEdit = findViewById(R.id.edtApelEdit);
        edtEdadEdit = findViewById(R.id.edtEdadEdit);
        edtCorreoEdit = findViewById(R.id.edtCorreoEdit);
        btnGuardarEdit = findViewById(R.id.btnGuardarEdit);


        personaAEditar = getIntent().getParcelableExtra("EdicionZona");

        if (personaAEditar != null) {

            edtNombreEdit.setText(personaAEditar.getNombrePersona());
            edtApelEdit.setText(personaAEditar.getApellidoPersona());
            edtEdadEdit.setText(String.valueOf(personaAEditar.getEdadPersona()));
            edtCorreoEdit.setText(personaAEditar.getCorreoPersona());
        }

        btnGuardarEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (personaAEditar != null) {
                    personaAEditar.setNombrePersona(edtNombreEdit.getText().toString());
                    personaAEditar.setApellidoPersona(edtApelEdit.getText().toString());
                    personaAEditar.setEdadPersona(Integer.parseInt(edtEdadEdit.getText().toString()));
                    personaAEditar.setCorreoPersona(edtCorreoEdit.getText().toString());

                    Toast.makeText(EditarPersonaActivity.this, "Cambios guardados", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent();
                    intent.putExtra("Edicion Completa", personaAEditar);
                    setResult(RESULT_OK, intent);

                    finish();
                }
            }
        });
    }
}