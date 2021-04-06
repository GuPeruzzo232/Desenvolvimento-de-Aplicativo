package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView btnPlayJogoVelha, btnPlayQuebra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlayJogoVelha.findViewById(R.id.btnPlayJogoVelha);
        btnPlayQuebra.findViewById(R.id.btnPlayQuebra);

        btnPlayJogoVelha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirJogoVelha();
            }
        });

        btnPlayQuebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirJogoQuebra();
            }
        });
    }

    private void abrirJogoVelha(){
        Intent janelaJogoVelha = new Intent(this, JogoVelha.class);
        startActivity(janelaJogoVelha);
    }

    private void abrirJogoQuebra(){
        Intent janelaJogoQuebra = new Intent(this, QuebraCabeca.class);
        startActivity(janelaJogoQuebra);
    }

}