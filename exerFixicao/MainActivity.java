package com.example.praticaprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button btnSaber, btnEntrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSaber = findViewById(R.id.btnSaber);
        btnEntrar = findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirEntrar();
            }
        });

        btnSaber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirSaber();
            }
        });

    }
    public void AbrirEntrar(){
        Intent janelaLobb = new Intent(this, entrar.class);
        startActivity(janelaLobb);

    }
    public void AbrirSaber(){
        Intent janelaSaber = new Intent(this, saber.class);
        startActivity(janelaSaber);

    }

}