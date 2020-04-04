package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnNavegar;
    private EditText nome;
    private Activity context = this;
    public static final String NOME_USU = "NOME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNavegar = findViewById(R.id.btn_navegar);
        nome = findViewById(R.id.nome_usuario);
        btnNavegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pegar oq o usuario escreveu
                String nomeDoUsuario = nome.getText().toString();
                if(nomeDoUsuario.isEmpty()){
                    Toast.makeText(context, "TA ERRADO", Toast.LENGTH_LONG).show();
                } else {
                    //criar a intençao (carteiro)
                    Intent intent = new Intent(context, SegundaActivity.class);
                    //criar o pacote
                    Bundle bundle = new Bundle();
                    //add itens no pacote
                    bundle.putString(NOME_USU, nomeDoUsuario);
                    //passar o pacote para a intent (carteiro)
                    intent.putExtras(bundle);
                    //envio para o endereço
                    startActivity(intent);
                }

            }
        });
    }
}
