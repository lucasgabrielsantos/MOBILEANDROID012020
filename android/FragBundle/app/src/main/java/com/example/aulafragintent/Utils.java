package com.example.aulafragintent;

import android.widget.EditText;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Utils {


    public static boolean editTextIsEmpty(EditText... editTexts){
        for (EditText editText : editTexts) {
            if(editText.getText().toString().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static void carregaFragment(@IdRes int idContainer, Fragment fragment, FragmentManager fragmentManager){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(idContainer, fragment);
        fragmentTransaction.commit();
    }


}
