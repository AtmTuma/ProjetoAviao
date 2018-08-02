package br.com.projeto.model.regra;

import br.com.projeto.model.pessoa.Pessoa;

import java.util.List;

public interface Regra {

    void aplicarRegra(List<Pessoa> pessoas) throws Exception;
}
