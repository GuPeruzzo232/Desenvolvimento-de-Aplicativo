package com.example.praticaprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class entrar extends AppCompatActivity {


    private WebView imagem;
    private Button btnMapa, btnLink, btnSensor, btnVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);

        btnLink = findViewById(R.id.btnLink);
        btnMapa = findViewById(R.id.btnMapa);
        btnSensor = findViewById(R.id.btnSensor);
        btnVideo = findViewById(R.id.btnVideo);

        imagem = findViewById(R.id.imagem);
        WebSettings gif = imagem.getSettings();
        gif.setJavaScriptEnabled(true);

        String caminho = "file:android_asset/mario.gif";
        imagem.loadUrl(caminho);

        btnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirLink();

            }
        });

        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirVideo();

            }
        });

        btnSensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirSensor();

            }
        });

        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirMapa();

            }
        });
    }

    public void AbrirLink(){
        Intent janelaLink = new Intent(this,links.class);
        startActivity(janelaLink);
    }
    public void AbrirMapa(){
        Intent mapaabrir = new Intent(this,MyMaps.class);
        startActivity(mapaabrir);
    }
    public void AbrirSensor(){
        Intent janelaSensor = new Intent(this, SensorProximidade.class);
        startActivity(janelaSensor);
    }
    public void AbrirVideo(){
        Intent janelaVideo = new Intent(this,Lobby.class);
        startActivity(janelaVideo);
    }
}