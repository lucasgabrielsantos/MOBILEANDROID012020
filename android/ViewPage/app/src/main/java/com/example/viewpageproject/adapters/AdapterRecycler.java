package com.example.viewpageproject.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpageproject.R;
import com.example.viewpageproject.model.Musica;

import java.util.List;

public class AdapterRecycler extends RecyclerView.Adapter<ViewHolderMusica> {

    private List<Musica> musicaList;

    public AdapterRecycler(List<Musica> musicaList) {
        this.musicaList = musicaList;
    }

    @NonNull
    @Override
    public ViewHolderMusica onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.musica_item, parent,false);
        return new ViewHolderMusica(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMusica holder, int position) {
        Musica musica = musicaList.get(position);
        holder.nomeMusica.setText(musica.getNome());
        holder.nomeBanda.setText(musica.getBanda());
        holder.imgBanda.setImageResource(musica.getImage());
    }

    @Override
    public int getItemCount() {
        return musicaList.size();
    }
}
