package com.example.aulafragintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {

    private TextView nome, email;
    private Button btnVoltar, btnNoticia;
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        nome = findViewById(R.id.id_nomeperfil);
        email = findViewById(R.id.id_emailperfil);
        btnVoltar = findViewById(R.id.btn_voltar);
        btnNoticia = findViewById(R.id.btn_noticia);

        if(getIntent() != null){
            Bundle bundle = getIntent().getExtras();
            nome.setText(bundle.getString("NOME"));
            email.setText(bundle.getString("EMAIL"));
        }

        btnNoticia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregaFragment(new NoticiaFragment());
            }
        });
    }
    public void carregaFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();
    }
}
