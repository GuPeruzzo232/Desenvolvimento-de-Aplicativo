package com.example.praticaprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class links extends AppCompatActivity {
    private Button btnSom1,btnSom2,btnSom3,btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);

    btnSom1 = findViewById(R.id.btnSom1);
    btnSom2 = findViewById(R.id.btnSom2);
    btnSom3 = findViewById(R.id.btnSom3);
    btnVoltar = findViewById(R.id.btnVoltar);


    btnSom1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            abrirSom1();

        }
    });
    btnSom2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            abrirSom2();
        }
    });
    btnSom3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            abrirSom3();
        }
    });
    btnVoltar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            abrirVoltar();
        }
    });

    }

    public void abrirSom1(){
        Intent janela = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=5qm8PH4xAss"));
        startActivity(janela);
    }

    public void abrirSom2(){
        Intent janela2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eJO5HU_7_1w&list=RDmZA6vZU7gQ0&index=14"));
        startActivity(janela2);
    }

    public void abrirSom3(){
        Intent janela3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=_CL6n0FJZpk"));
        startActivity(janela3);
    }
    public void abrirVoltar(){
        Intent janelav = new Intent(this, entrar.class);
        startActivity(janelav);
    }
}