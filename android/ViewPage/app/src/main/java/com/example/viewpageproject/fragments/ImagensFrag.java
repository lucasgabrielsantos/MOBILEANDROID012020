package com.example.viewpageproject.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.viewpageproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImagensFrag extends Fragment {

    public ImagensFrag() {
        // Required empty public constructor
    }

    public static ImagensFrag newInstance(String text){

        ImagensFrag fragment = new ImagensFrag();

        Bundle bundle = new Bundle();

        bundle.putString("IMAGENS", text);

        fragment.setArguments(bundle);
        return fragment;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_imagens, container, false);
    }
}
