package com.example.recyclerviewcomentado.view;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewcomentado.R;
import com.example.recyclerviewcomentado.model.Aluno;

import static com.example.recyclerviewcomentado.adapter.AdapterAlunos.aluno_key;

public class SegundaActivity extends AppCompatActivity {

    private ImageView imgRes;
    private TextView name, horario;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        imgRes = findViewById(R.id.image_aluno);
        name = findViewById(R.id.txt_name_res);
        horario = findViewById(R.id.txt_horario_res);

        if(getIntent() != null){
            Aluno aluno = getIntent().getExtras().getParcelable(aluno_key);
            if (aluno != null) {
                name.setText(aluno.getNome());
                horario.setText(aluno.getCurso());
            }
        }
    }
}
