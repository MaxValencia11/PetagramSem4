package com.matscode.miscontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Contacto extends AppCompatActivity {
    
    EditText etNombre, etCorreo, etMensaje;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        androidx.appcompat.widget.Toolbar miActionbar = findViewById(R.id.miActionbar2);
        setSupportActionBar(miActionbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        
        etNombre = findViewById(R.id.etContactosNombre);
        etCorreo = findViewById(R.id.etContactosCorreo);
        etMensaje = findViewById(R.id.etContactosMensaje);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarMail();
                Toast.makeText(Contacto.this, "Gracias por tus comentarios!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Contacto.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void enviarMail(){
        String email = etMensaje.getText().toString();
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.putExtra(Intent.EXTRA_EMAIL, email);
        emailIntent.setType("message/rfc822");
        startActivity(Intent.createChooser(emailIntent, etNombre.getText() + " envió sus comentarios"));
    }
}