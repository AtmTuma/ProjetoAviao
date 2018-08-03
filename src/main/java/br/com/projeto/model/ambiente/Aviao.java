package br.com.projeto.model.ambiente;

import br.com.projeto.model.pessoa.Pessoa;

import java.util.List;

public class Aviao extends Ambiente {

    public Aviao(List<Pessoa> pessoas, String nome) {
        super(pessoas, nome);
    }

    @Override
    public void adicionarPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    @Override
    public Pessoa retirarPessoa(String nome) throws Exception {
        if (this.pessoas.isEmpty())
            throw new Exception("O Avião esta vazio.");

        Pessoa passageiro = this.pessoas.stream().filter(pessoa -> nome.equals(pessoa.getNome())).findAny().orElse(null);
        if (passageiro == null)
            throw new Exception("O passageiro " + nome + " não esta no Avião.");

        this.pessoas.remove(passageiro);
        return passageiro;
    }

    public Integer getNumeroPassageiros() {
        return pessoas.size();
    }
}
