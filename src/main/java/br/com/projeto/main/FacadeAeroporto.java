package br.com.projeto.main;

import br.com.projeto.model.ambiente.Aviao;
import br.com.projeto.model.ambiente.SmartFortwo;
import br.com.projeto.model.ambiente.Terminal;
import br.com.projeto.model.pessoa.Pessoa;
import br.com.projeto.model.pessoa.Policial;
import br.com.projeto.model.pessoa.Presidiario;
import br.com.projeto.model.pessoa.tripulacao.cabine.ChefeServico;
import br.com.projeto.model.pessoa.tripulacao.cabine.Comissaria;
import br.com.projeto.model.pessoa.tripulacao.tecnica.Oficial;
import br.com.projeto.model.pessoa.tripulacao.tecnica.Piloto;

import java.util.ArrayList;
import java.util.List;

public class FacadeAeroporto {

    private Terminal terminal;
    private Aviao aviao;
    private SmartFortwo smartFortwo;
    private Piloto piloto;
    private Oficial oficial1;
    private Oficial oficial2;
    private ChefeServico chefeServico;
    private Comissaria comissaria1;
    private Comissaria comissaria2;
    private Policial policial;
    private Presidiario presidiario;

    public FacadeAeroporto(Terminal terminal, Aviao aviao, SmartFortwo smartFortwo, Piloto piloto, Oficial oficial1,
                           Oficial oficial2, ChefeServico chefeServico, Comissaria comissaria1, Comissaria comissaria2,
                           Policial policial, Presidiario presidiario) {
        this.terminal = terminal;
        this.aviao = aviao;
        this.smartFortwo = smartFortwo;
        this.piloto = piloto;
        this.oficial1 = oficial1;
        this.oficial2 = oficial2;
        this.chefeServico = chefeServico;
        this.comissaria1 = comissaria1;
        this.comissaria2 = comissaria2;
        this.policial = policial;
        this.presidiario = presidiario;
    }

    public FacadeAeroporto() {
        List<Pessoa> lista = new ArrayList<>();
        this.piloto = new Piloto("piloto", true);
        lista.add(this.piloto);
        this.oficial1 = new Oficial("oficial 1", false);
        lista.add(this.oficial1);
        this.oficial2 = new Oficial("oficial 2", false);
        lista.add(this.oficial2);
        this.chefeServico = new ChefeServico("chefe", true);
        lista.add(this.chefeServico);
        this.comissaria1 = new Comissaria("comissaria 1", false);
        lista.add(this.comissaria1);
        this.comissaria2 = new Comissaria("comissaria", false);
        lista.add(this.comissaria2);
        this.policial = new Policial("policial", true);
        lista.add(this.policial);
        this.presidiario = new Presidiario("presidiario", false);
        lista.add(this.presidiario);
        this.terminal = new Terminal(lista, "terminal");
        this.aviao = new Aviao(new ArrayList<>(), "aviao");
        this.smartFortwo = new SmartFortwo(new ArrayList<>(), "smart", terminal);
    }

    public void irParaTerminal() {
        if (this.smartFortwo.getLocalizacao() instanceof Terminal)
            System.out.println("O Smart For Two já esta no terminal.");
        else {
            this.smartFortwo.irPara(this.terminal);
            System.out.println("O Smart For Two moveu-se para o terminal.");
        }
    }

    public void irParaAviao() {
        if (this.smartFortwo.getLocalizacao() instanceof Aviao)
            System.out.println("O Smart For Two já esta no avião.");
        else {
            this.smartFortwo.irPara(this.aviao);
            System.out.println("O Smart For Two moveu-se para o avião.");
        }
    }

    public void listarPassageiros() {
        this.smartFortwo.printPessoas();
    }

    public void adicionarPassageiro(String nome) {
        
    }
}
