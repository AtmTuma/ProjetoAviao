package br.com.projeto.model.pessoa;

import br.com.projeto.model.regra.Regra;

import java.util.List;

public class Presidiario extends Pessoa implements Regra {

    public Presidiario(String nome, Boolean podeDirigir) {
        super(nome, podeDirigir);
    }

    public void aplicarRegra(List<Pessoa> pessoas) throws Exception {
        if (pessoas.size() == 1)
            return;
        for (Pessoa pessoa: pessoas) {
            if (pessoa instanceof Policial)
                return;
        }
        throw new Exception("Esta faltando o policial junto ao presidiario.");
    }
}
