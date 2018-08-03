package br.com.projeto.model.ambiente;

import br.com.projeto.model.pessoa.Pessoa;
import br.com.projeto.model.regra.Regra;

import java.util.List;

public class SmartFortwo extends Ambiente implements Regra {

    private Ambiente localizacao;

    public SmartFortwo(List<Pessoa> pessoas, String nome, Ambiente localizacao) {
        super(pessoas, nome);
        this.localizacao = localizacao;
    }

    @Override
    public void aplicarRegra(List<Pessoa> pessoas) throws Exception {
        if (pessoas.stream().anyMatch(Pessoa::getPodeDirigir))
            return;
        throw new Exception("Esta faltando um motorista no Smart For Two.");
    }

    public void adicionarPassageiro(String nome) throws Exception {
        Pessoa passageiro = this.localizacao.retirarPessoa(nome);
        this.adicionarPessoa(passageiro);
    }

    public void removerPassageiro(String nome) throws Exception {
        Pessoa passageiro = this.retirarPessoa(nome);
        this.localizacao.adicionarPessoa(passageiro);
    }

    @Override
    public void adicionarPessoa(Pessoa pessoa) throws Exception {
        if (this.pessoas.size() == 2)
            throw new Exception("O Smart For Two já esta cheio.");

        this.pessoas.add(pessoa);
    }

    @Override
    public Pessoa retirarPessoa(String nome) throws Exception {
        if (this.pessoas.isEmpty())
            throw new Exception("O Smart For Two esta vazio.");

        Pessoa passageiro = this.pessoas.stream().filter(pessoa -> nome.equals(pessoa.getNome())).findAny().orElse(null);
        if (passageiro == null)
            throw new Exception("O passageiro " + nome + " não esta no Smart For Two.");

        this.pessoas.remove(passageiro);
        return passageiro;
    }

    public void nomeLocalizacao() {
        System.out.println(localizacao.getNome());
    }

    public Ambiente getLocalizacao() {
        return localizacao;
    }

    public void irPara(Ambiente localizacao) {
        this.localizacao = localizacao;
    }
}
