package com.example.viewpageproject.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.viewpageproject.R;
import com.example.viewpageproject.adapters.AdapterRecycler;
import com.example.viewpageproject.model.Musica;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MusicasFrag extends Fragment {

    private RecyclerView recyclerView;
    private AdapterRecycler adapterRecycler;

    public MusicasFrag() {
        // Required empty public constructor
    }

    public static MusicasFrag newInstance(String text){

        MusicasFrag fragment = new MusicasFrag();

        Bundle bundle = new Bundle();

        bundle.putString("MUSICAS", text);

        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_musicas, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        recyclerView = view.findViewById(R.id.recycler_musica);
        adapterRecycler = new AdapterRecycler(createList());
        recyclerView.setAdapter(adapterRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private List<Musica> createList (){
        List<Musica> list = new ArrayList<>();
        list.add(new Musica("CHEI DE SAL", "MC GORILA", R.drawable.bandimage));
        list.add(new Musica("HEY BROTHER", "MC GORILA", R.drawable.bandimage));
        list.add(new Musica("NOVINHO SENSACIONAL", "MC GORILA", R.drawable.bandimage));
        return list;
    }
}
