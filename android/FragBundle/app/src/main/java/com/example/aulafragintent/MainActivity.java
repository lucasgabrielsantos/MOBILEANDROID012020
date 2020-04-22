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

import static com.example.aulafragintent.Utils.editTextIsEmpty;

public class MainActivity extends AppCompatActivity {

    private EditText nome, email, senha;
    private Button btnCadastrar;
    private Activity activity = this;
    public static final String NOME_KEY = "nome";
    public static final String EMAIL_KEY = "email";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextIsEmpty(nome, email, senha)){
                    Toast.makeText(activity, "Preencheu errado burro", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, PerfilActivity.class);
                    intent.putExtra(NOME_KEY, nome.getText().toString()).putExtra(EMAIL_KEY, email.getText().toString());
                    startActivity(intent);
                }
            }
        });

    }

    private void initView(){
        nome = findViewById(R.id.id_nome);
        email = findViewById(R.id.id_email);
        senha = findViewById(R.id.id_senha);
        btnCadastrar = findViewById(R.id.btn_cadastro);
    }
}
