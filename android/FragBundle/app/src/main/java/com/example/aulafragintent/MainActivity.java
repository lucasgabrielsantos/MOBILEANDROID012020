package com.example.aulafragintent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private EditText nome, email, senha;

    private Button btnCadastrar;

    private Activity activity = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.id_nome);
        email = findViewById(R.id.id_email);
        senha = findViewById(R.id.id_senha);
        btnCadastrar = findViewById(R.id.btn_cadastro);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeUsuario = nome.getText().toString();
                String emailUsuario = email.getText().toString();
                String senhaUsuario = senha.getText().toString();

                if(nomeUsuario.isEmpty() || emailUsuario.isEmpty() || senhaUsuario.isEmpty()){
                    Toast.makeText(activity, "Preencheu errado burro", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, PerfilActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("NOME", nomeUsuario);
                    bundle.putString("SENHA", senhaUsuario);
                    bundle.putString("EMAIL", emailUsuario);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });
    }
}
