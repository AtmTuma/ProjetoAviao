package br.com.projeto.model.ambiente;

import br.com.projeto.model.pessoa.Pessoa;
import br.com.projeto.model.regra.Regra;

import java.util.List;

public abstract class Ambiente {

    protected List<Pessoa>  pessoas;
    protected String nome;

    public Ambiente(List<Pessoa> pessoas, String nome) {
        this.pessoas = pessoas;
        this.nome = nome;
    }

    public void validaLista() throws Exception {
        for (Pessoa pessoa: this.pessoas) {
            if (pessoa instanceof Regra) {
                ((Regra) pessoa).aplicarRegra(this.pessoas);
            }
        }
    }

    public void printPessoas() {
        if (this.pessoas.isEmpty()) {
            System.out.println("Não tem ninguem aqui no " + this.nome);
            return;
        }
        this.pessoas.forEach(pessoa -> System.out.println(pessoas.indexOf(pessoa) + "--" +pessoa.getNome()));
    }

    public abstract void adicionarPessoa(Pessoa pessoa) throws Exception;

    public abstract Pessoa retirarPessoa(String nome) throws Exception;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
