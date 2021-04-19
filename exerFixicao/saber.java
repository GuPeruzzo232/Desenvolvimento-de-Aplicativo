package com.example.praticaprojeto;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class saber extends AppCompatActivity {
    private Button btnAcessar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saber);

        btnAcessar = findViewById(R.id.btnAcessar);

        btnAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirLobby();
            }
        });

    }
    public void AbrirLobby(){
        Intent janelaLobby = new Intent(this, entrar.class);
        startActivity(janelaLobby);

    }
}