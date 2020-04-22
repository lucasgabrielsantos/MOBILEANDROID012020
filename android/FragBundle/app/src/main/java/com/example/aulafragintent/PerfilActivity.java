package com.example.aulafragintent;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.IDN;

import static com.example.aulafragintent.MainActivity.EMAIL_KEY;
import static com.example.aulafragintent.MainActivity.NOME_KEY;
import static com.example.aulafragintent.Utils.carregaFragment;

public class PerfilActivity extends AppCompatActivity {

    private TextView nome, email;
    private Button btnVoltar, btnNoticia;
    private FragmentManager  fragmentManager = getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        initView();

        if(getIntent() != null){
            Bundle bundle = getIntent().getExtras();
            nome.setText(bundle.getString(NOME_KEY));
            email.setText(bundle.getString(EMAIL_KEY));
        }

        btnNoticia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregaFragment(R.id.container, new NoticiaFragment(), fragmentManager);
            }
        });
    }

    private void initView() {
        nome = findViewById(R.id.id_nomeperfil);
        email = findViewById(R.id.id_emailperfil);
        btnVoltar = findViewById(R.id.btn_voltar);
        btnNoticia = findViewById(R.id.btn_noticia);
    }


}
