package com.example.intentebundle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button btnEnviar;
    private EditText editNome, editSobrenome, editIdade;
    private Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = findViewById(R.id.btn_enviar);
        editNome = findViewById(R.id.txt_nome);
        editSobrenome = findViewById(R.id.txt_sobrenome);
        editIdade = findViewById(R.id.txt_idade);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pegando dados do usuario
               String nome = editNome.getText().toString();
               String sobrenome = editSobrenome.getText().toString();
               String idade = editIdade.getText().toString();
               //checando se não é vazio
               if(nome.isEmpty() || sobrenome.isEmpty() || idade.isEmpty()){
                   Snackbar.make(btnEnviar, "Preencha corretamente os campos", Snackbar.LENGTH_SHORT).show();
               }else {
                  //criei meu carteiro
                   Intent intent = new Intent(activity, PerfilActivity.class);
                   //criei meu pacote / bundle
                   Bundle bundle = new Bundle();
                   //adicionei itens no pacote / bundle
                   bundle.putString("NOME", nome);
                   bundle.putString("SOBRENOME", sobrenome);
                   bundle.putString("IDADE", idade);
                   //dei o pacote ao meu carteiro / bundle
                   intent.putExtras(bundle);
                   //startando a proxima tela
                   startActivity(intent);
               }
            }
        });


    }
}
