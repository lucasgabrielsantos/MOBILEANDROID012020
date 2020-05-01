package com.example.recyclerviewcomentado.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.recyclerviewcomentado.R;

//Passo 3.B                         Passo 3.B.I abaixo
public class ViewHolderAlunos extends RecyclerView.ViewHolder {

    //Passo 3.B.III
    TextView nome;
    TextView curso;
    CardView cardView;

    //Passo 3.B.II
    public ViewHolderAlunos(@NonNull View itemView) {
        super(itemView);
        //Passo 3.B.IV
        nome = itemView.findViewById(R.id.text_name);
        curso = itemView.findViewById(R.id.text_curso);
        cardView = itemView.findViewById(R.id.card_view);
        //Ignorar o passo 3.B.V
    }
}
