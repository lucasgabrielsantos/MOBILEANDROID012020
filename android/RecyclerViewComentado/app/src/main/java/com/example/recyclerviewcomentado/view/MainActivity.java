package com.example.recyclerviewcomentado.view;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerviewcomentado.adapter.AdapterAlunos;
import com.example.recyclerviewcomentado.model.Aluno;
import com.example.recyclerviewcomentado.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Passo 9
    private RecyclerView recyclerView;
    private AdapterAlunos adapterAlunos;
    private List<Aluno> alunoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Passo 10
        recyclerView = findViewById(R.id.recycler_main);
        //Passo 11
        adapterAlunos = new AdapterAlunos(listaDeAlunos());
        //Passo 12 e 14 simplificado em uma linha
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //utilizando grid para uma lista com duas colunas
        //recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        //Passo 13
        recyclerView.setAdapter(adapterAlunos);
    }

    //Não está no arquivo, mas precisa de uma lista para poder exibir no recycler view por isso criei uma statica
    private List<Aluno> listaDeAlunos(){
        List<Aluno> alunos = new ArrayList<>();

        int imageResource = R.drawable.restaurante;//isso se torna um id

        alunos.add(new Aluno(imageResource,"Yuri", "FullStack"));
        alunos.add(new Aluno(imageResource, "João","Mobile Android"));
        alunos.add(new Aluno(imageResource, "Eduardo","UX/UI"));
        alunos.add(new Aluno(imageResource, "Alexandre", "IOS"));
        alunos.add(new Aluno(imageResource, "Pedro", "Data"));
        alunos.add(new Aluno(imageResource, "Sandro", "Marketing Digital"));
        alunos.add(new Aluno(imageResource, "Giulia", "Executivo"));
        alunos.add(new Aluno(imageResource, "Felipe", "DIP"));

        return alunos;
    }
}
