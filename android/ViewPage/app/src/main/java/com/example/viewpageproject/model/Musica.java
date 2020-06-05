package com.example.viewpageproject.model;


public class Musica {

    private String nome;
    private String banda;
    private int image;

    public Musica(String nome, String banda, int image) {
        this.nome = nome;
        this.banda = banda;
        this.image = image;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
