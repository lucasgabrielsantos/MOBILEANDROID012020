package com.example.recyclerviewcomentado.model;

import android.os.Parcel;
import android.os.Parcelable;

//Classe toda passo 2
public class Aluno implements Parcelable {
    private int image;
    private String nome;
    private String curso;

    public Aluno(int image, String nome, String curso) {
        this.image = image;
        this.nome = nome;
        this.curso = curso;
    }

    protected Aluno(Parcel in) {
        image = in.readInt();
        nome = in.readString();
        curso = in.readString();
    }

    public static final Creator<Aluno> CREATOR = new Creator<Aluno>() {
        @Override
        public Aluno createFromParcel(Parcel in) {
            return new Aluno(in);
        }

        @Override
        public Aluno[] newArray(int size) {
            return new Aluno[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
        dest.writeString(nome);
        dest.writeString(curso);
    }
}
