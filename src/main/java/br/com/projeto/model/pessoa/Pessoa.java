package br.com.projeto.model.pessoa;

public abstract class Pessoa {

    protected String nome;
    protected Boolean podeDirigir;

    public Pessoa(String nome, Boolean podeDirigir) {
        this.nome = nome;
        this.podeDirigir = podeDirigir;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getPodeDirigir() {
        return podeDirigir;
    }

    public void setPodeDirigir(Boolean podeDirigir) {
        this.podeDirigir = podeDirigir;
    }
}
