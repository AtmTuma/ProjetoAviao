package br.com.projeto.model.pessoa.tripulacao.tecnica;

import br.com.projeto.model.pessoa.Pessoa;
import br.com.projeto.model.pessoa.tripulacao.cabine.ChefeServico;
import br.com.projeto.model.regra.Regra;

import java.util.List;
import java.util.stream.Collectors;

public class Oficial extends Tecnica implements Regra {
    public Oficial(String nome, Boolean podeDirigir) {
        super(nome, podeDirigir);
    }

    public void aplicarRegra(List<Pessoa> pessoas) throws Exception {
        List<Pessoa> chefeServico = pessoas.stream().filter(pessoa -> pessoa instanceof ChefeServico).collect(Collectors.toList());

        if (!chefeServico.isEmpty()) {
            for (Pessoa pessoa : pessoas) {
                if (!(pessoa instanceof ChefeServico) && !(pessoa instanceof Oficial))
                    return;
            }
        } else return;

        throw new Exception("O Oficial não pode ficar sozinho com o Chefe de Serviço.");
    }
}
