package br.com.projeto.model.pessoa.tripulacao.cabine;

import br.com.projeto.model.pessoa.Pessoa;
import br.com.projeto.model.pessoa.tripulacao.tecnica.Piloto;
import br.com.projeto.model.regra.Regra;

import java.util.List;
import java.util.stream.Collectors;

public class Comissaria extends Cabine implements Regra {
    public Comissaria(String nome, Boolean podeDirigir) {
        super(nome, podeDirigir);
    }

    public void aplicarRegra(List<Pessoa> pessoas) throws Exception {
        List<Pessoa> chefeServico = pessoas.stream().filter(pessoa -> pessoa instanceof Piloto).collect(Collectors.toList());

        if (!chefeServico.isEmpty()) {
            for (Pessoa pessoa : pessoas) {
                if (!(pessoa instanceof Piloto) && !(pessoa instanceof Comissaria))
                    return;
            }
        } else return;

        throw new Exception("A Comissaria não pode ficar sozinha com o Piloto.");
    }
}
