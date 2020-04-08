package com.example.intentebundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {
    private Button btnVoltar;
    private TextView nomePerfil, sobrenomePerfil, idadePerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        nomePerfil = findViewById(R.id.txt_nome_perfil);
        sobrenomePerfil = findViewById(R.id.txt_sobrenome_perfil);
        idadePerfil = findViewById(R.id.tct_idade_perfil);
        btnVoltar = findViewById(R.id.btn_voltar);

        if(getIntent() != null) {
            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                nomePerfil.setText(bundle.getString("NOME"));
                sobrenomePerfil.setText(bundle.getString("SOBRENOME"));
                idadePerfil.setText(bundle.getString("IDADE"));
            }
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
