package br.com.projeto.main;

public class Main {

    private static FacadeAeroporto controller;

    public static void main(String args[]) {
        controller = new FacadeAeroporto();

        controller.listarPassageirosTerminal();
        controller.adicionarPassageiroNoSmart("policial");
        controller.adicionarPassageiroNoSmart("presidiario");
        controller.irParaAviao();
        controller.removerPassageiroDoSmart("presidiario");
        controller.irParaTerminal();
        controller.adicionarPassageiroNoSmart("oficial 1");
        controller.irParaAviao();
        controller.removerPassageiroDoSmart("oficial 1");
        controller.adicionarPassageiroNoSmart("presidiario");
        controller.irParaTerminal();
        controller.removerPassageiroDoSmart("presidiario");
        controller.removerPassageiroDoSmart("policial");
        controller.adicionarPassageiroNoSmart("piloto");
        controller.adicionarPassageiroNoSmart("oficial 2");
        controller.irParaAviao();
        controller.removerPassageiroDoSmart("oficial 2");
        controller.irParaTerminal();
        controller.removerPassageiroDoSmart("piloto");
        controller.adicionarPassageiroNoSmart("chefe");
        controller.adicionarPassageiroNoSmart("comissaria 1");
        controller.irParaAviao();
        controller.removerPassageiroDoSmart("comissaria 1");
        controller.irParaTerminal();
        controller.adicionarPassageiroNoSmart("comissaria 2");
        controller.irParaAviao();
        controller.removerPassageiroDoSmart("comissaria 2");
        controller.irParaTerminal();
        controller.adicionarPassageiroNoSmart("piloto");
        controller.irParaAviao();
        controller.removerPassageiroDoSmart("chefe");
        controller.irParaTerminal();
        controller.adicionarPassageiroNoSmart("policial");
        controller.irParaAviao();
        controller.removerPassageiroDoSmart("piloto");
        controller.irParaTerminal();
        controller.adicionarPassageiroNoSmart("presidiario");
        controller.irParaAviao();
        controller.removerPassageiroDoSmart("policial");
        controller.removerPassageiroDoSmart("presidiario");


        controller.listarPassageirosSmartForTwo();
        controller.listarPassageirosTerminal();
        controller.listarPassageirosAviao();
    }
}
