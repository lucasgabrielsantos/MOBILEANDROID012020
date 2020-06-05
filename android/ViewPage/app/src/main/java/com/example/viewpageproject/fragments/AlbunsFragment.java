package com.example.viewpageproject.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpageproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlbunsFragment extends Fragment {

    public AlbunsFragment() {
        // Required empty public constructor
    }

    public static AlbunsFragment newInstance(String text){

        AlbunsFragment fragment = new AlbunsFragment();

        Bundle bundle = new Bundle();

        bundle.putString("ALBUNS", text);

        fragment.setArguments(bundle);
        return fragment;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_albuns, container, false);
    }
}
