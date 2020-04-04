package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.intentexample.MainActivity.NOME_USU;

public class SegundaActivity extends AppCompatActivity {

    private Button btnVoltar;
    private Activity activity = this;
    private TextView nomeUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        btnVoltar = findViewById(R.id.btn_voltar);
        nomeUsuario = findViewById(R.id.txt_nome);

        if(getIntent() != null){
            Intent intent = getIntent();
            //pego meu pacote
            Bundle bundle = intent.getExtras();
            //acho o nome do usuario
            String nome = bundle.getString(NOME_USU);
            //setar o nome no text
            nomeUsuario.setText(nome);
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
