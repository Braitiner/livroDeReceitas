package br.com.livroDereceitas.model;


import java.util.List;

public class Receita {

    private String titulo;
    private List<String> ingredientes;
    private String modoDePreparo;

    public Receita() {}

    public Receita(String titulo, List<String> ingredientes, String modoDePreparo) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.modoDePreparo = modoDePreparo;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public String getModoDePreparo() {
        return modoDePreparo;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", ingredientes=" + ingredientes +
                ", modoDePreparo='" + modoDePreparo + '\'';
    }
}
