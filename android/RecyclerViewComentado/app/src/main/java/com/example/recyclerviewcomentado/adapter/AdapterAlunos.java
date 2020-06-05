package com.example.recyclerviewcomentado.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerviewcomentado.model.Aluno;
import com.example.recyclerviewcomentado.R;
import com.example.recyclerviewcomentado.view.MainActivity;
import com.example.recyclerviewcomentado.view.SegundaActivity;

import java.util.List;

//Passo 3.A - Passo 3.B é a outra classe ViewHolder
public class AdapterAlunos extends RecyclerView.Adapter<ViewHolderAlunos> {

    //Passo 5
    private List<Aluno> alunoList;
    public static final String aluno_key = "ALUNO";

    //Passo 6
    public AdapterAlunos(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    //Passo 7.A
    @NonNull
    @Override
    public ViewHolderAlunos onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycler, viewGroup, false);
        return new ViewHolderAlunos(view);
    }

    //Passo 7.B
    @Override
    public void onBindViewHolder(@NonNull final ViewHolderAlunos viewHolderAlunos, int position) {
        final Aluno aluno = alunoList.get(position);
        viewHolderAlunos.nome.setText(aluno.getNome());
        viewHolderAlunos.curso.setText(aluno.getCurso());
        viewHolderAlunos.imageView.setImageResource(aluno.getImage());
        viewHolderAlunos.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SegundaActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable(aluno_key, aluno);
                intent.putExtras(bundle);
                v.getContext().startActivity(intent);
            }
        });
    }

    //Passo 7.C
    @Override
    public int getItemCount() {
        return alunoList.size();
    }
}
