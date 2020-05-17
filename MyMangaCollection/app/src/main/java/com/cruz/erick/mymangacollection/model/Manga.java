package com.cruz.erick.mymangacollection.model;

public class Manga {
    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private int numVol;
    private int volAtual;
    private int ativo;

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumVol() {
        return numVol;
    }

    public void setNumVol(int numVol) {
        this.numVol = numVol;
    }

    public int getVolAtual() {
        return volAtual;
    }

    public void setVolAtual(int volAtual) {
        this.volAtual = volAtual;
    }
}
