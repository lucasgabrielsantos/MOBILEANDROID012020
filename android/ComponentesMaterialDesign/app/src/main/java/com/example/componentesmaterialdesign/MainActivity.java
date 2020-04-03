package com.example.componentesmaterialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton floatingActionButton;
    private EditText nome, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.floatingActionButton);
        nome = findViewById(R.id.name_id);
        email = findViewById(R.id.email_id);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeUsuario = nome.getText().toString();
                String emailUsario = email.getText().toString();

                if(nomeUsuario.isEmpty() || emailUsario.isEmpty()){
                    //onde sera exibido, o que sera exibido e quanto tempo demora
                    Snackbar.make(floatingActionButton, "Preencha corretamente seu burro", BaseTransientBottomBar.LENGTH_LONG).show();
                } else {
                    Snackbar.make(floatingActionButton, "Preencheu corretamente seu burro", BaseTransientBottomBar.LENGTH_LONG).show();
                }
            }
        });
    }
}
