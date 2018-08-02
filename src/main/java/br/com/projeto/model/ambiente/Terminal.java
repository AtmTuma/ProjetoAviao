package br.com.projeto.model.ambiente;

import br.com.projeto.model.pessoa.Pessoa;

import java.util.List;

public class Terminal extends Ambiente {

    public Terminal(List<Pessoa> pessoas, String nome) {
        super(pessoas, nome);
    }

    @Override
    public void adicionarPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    @Override
    public Pessoa retirarPessoa(String nome) throws Exception {
        if (this.pessoas.isEmpty())
            throw new Exception("O Terminal esta vazio.");

        Pessoa passageiro = this.pessoas.stream().filter(pessoa -> nome.equals(pessoa.getNome())).findAny().orElse(null);
        this.pessoas.remove(passageiro);

        return passageiro;
    }
}
