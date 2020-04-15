package com.example.aulafragintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {

    private TextView nome, email;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        nome = findViewById(R.id.id_nomeperfil);
        email = findViewById(R.id.id_emailperfil);
        btnVoltar = findViewById(R.id.btn_voltar);

        if(getIntent() != null){
            Bundle bundle = getIntent().getExtras();
            nome.setText(bundle.getString("NOME"));
        }
    }
}
