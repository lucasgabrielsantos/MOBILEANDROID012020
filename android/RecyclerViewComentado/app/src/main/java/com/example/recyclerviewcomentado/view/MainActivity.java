package com.example.recyclerviewcomentado.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        //Passo 13
        recyclerView.setAdapter(adapterAlunos);
    }

    //Não está no arquivo, mas precisa de uma lista para poder exibir no recycler view por isso criei uma statica
    private List<Aluno> listaDeAlunos(){
        List<Aluno> alunos = new ArrayList<>();


        alunos.add(new Aluno("Yuri", "FullStack"));
        alunos.add(new Aluno("João","Mobile Android"));
        alunos.add(new Aluno("Eduardo","UX/UI"));
        alunos.add(new Aluno("Alexandre", "IOS"));
        alunos.add(new Aluno("Pedro", "Data"));
        alunos.add(new Aluno("Sandro", "Marketing Digital"));
        alunos.add(new Aluno("Giulia", "Executivo"));
        alunos.add(new Aluno("Felipe", "DIP"));

        return alunos;
    }

}
