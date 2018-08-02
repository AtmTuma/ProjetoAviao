package br.com.projeto.model.pessoa.tripulacao.cabine;

import br.com.projeto.model.pessoa.tripulacao.Tripulacao;

public abstract class Cabine extends Tripulacao {
    public Cabine(String nome, Boolean podeDirigir) {
        super(nome, podeDirigir);
    }
}
