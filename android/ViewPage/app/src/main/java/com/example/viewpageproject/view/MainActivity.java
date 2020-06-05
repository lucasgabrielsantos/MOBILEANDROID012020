package com.example.viewpageproject.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.viewpageproject.R;
import com.example.viewpageproject.adapters.PageAdapter;
import com.example.viewpageproject.fragments.AlbunsFragment;
import com.example.viewpageproject.fragments.ImagensFrag;
import com.example.viewpageproject.fragments.MusicasFrag;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewpager_id);
        PageAdapter adapter = new PageAdapter(getSupportFragmentManager(), getListFragments());
        viewPager.setAdapter(adapter);
    }

    private List<Fragment> getListFragments() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(ImagensFrag.newInstance("Imagens"));
        fragments.add(AlbunsFragment.newInstance("Albuns"));
        fragments.add(MusicasFrag.newInstance("Musicas"));
        return fragments;
    }

}
