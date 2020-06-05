package com.example.viewpageproject.adapters;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpageproject.R;

public class ViewHolderMusica extends RecyclerView.ViewHolder {

     TextView nomeMusica;
     TextView nomeBanda;
     ImageView imgBanda;

    public ViewHolderMusica(@NonNull View itemView) {
        super(itemView);
        nomeBanda = itemView.findViewById(R.id.texto_nome_banda);
        nomeMusica = itemView.findViewById(R.id.texto_nome_musica);
        imgBanda = itemView.findViewById(R.id.img_banda);
    }
}
