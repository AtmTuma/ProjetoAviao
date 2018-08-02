package br.com.projeto.model.pessoa.tripulacao;

import br.com.projeto.model.pessoa.Pessoa;

public abstract class Tripulacao extends Pessoa {
    public Tripulacao(String nome, Boolean podeDirigir) {
        super(nome, podeDirigir);
    }
}
