package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.net.URI;

public class ActivityFinal extends AppCompatActivity {

    Button btnSair, btnReiniciar;
    TextView txtPontosFinal;
    VideoView vdvFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        btnSair.findViewById(R.id.btnSair);
        btnReiniciar.findViewById(R.id.btnReiniciar);
        txtPontosFinal.findViewById(R.id.txtPontosFinal);
        vdvFinal.findViewById(R.id.vdvFinal);


        GameChapolin.mp.stop();

        if(GameChapolin.acertos == 3){
            Uri caminho = Uri.parse("android.resource:// " + getPackageName() + "/" + R.raw.bonus);
            vdvFinal.setVideoURI(caminho);
            vdvFinal.start();
        }

        txtPontosFinal.setText("Pontos Atuais: " + GameChapolin.acertos++);

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GameChapolin.acertos = 0;
                abrirMain();
            }
        });

    }

    private void abrirMain(){
        Intent janelaMain = new Intent(this, GameChapolin.class);
        startActivity(janelaMain);
        finish();
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Você não pode voltar atrás nesse jogo!", Toast.LENGTH_LONG).show();
    }

}