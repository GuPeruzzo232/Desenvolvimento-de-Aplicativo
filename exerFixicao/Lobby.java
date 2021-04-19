package com.example.praticaprojeto;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

public class Lobby extends AppCompatActivity {
    private VideoView video;
    private Button btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);
        btnVoltar = findViewById(R.id.btnVoltar);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        video.setVideoURI(caminho);
        video.start();

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltar();
            }
        });

    }

    public void abrirVoltar(){
        Intent janelav = new Intent(this, entrar.class);
        startActivity(janelav);
    }
}