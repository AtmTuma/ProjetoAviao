package br.com.projeto.model.pessoa.tripulacao.tecnica;

import br.com.projeto.model.pessoa.tripulacao.Tripulacao;

public abstract class Tecnica extends Tripulacao {
    public Tecnica(String nome, Boolean podeDirigir) {
        super(nome, podeDirigir);
    }
}
