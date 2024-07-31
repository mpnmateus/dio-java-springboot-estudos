package javabasico.AAexercicios.candidatura;

import java.util.Scanner;

public class ProcessoSeletivoUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário pretendido pelo candidato");
        double salarioPretendido = scan.nextDouble();
        analisarCandidato(salarioPretendido);

        //Para testar as três condições
        analisarCandidato(1900);
        analisarCandidato(2000);
        analisarCandidato(5000);
    }
    static void analisarCandidato(double salarioPretendido){
        double valorBaseSalarial = 2000;
        if (valorBaseSalarial > salarioPretendido)
            System.out.println("Ligar para o candidato.");
        else if (valorBaseSalarial == salarioPretendido)
            System.out.println("Ligar para o candidato c/ contraproposta");
        else
            System.out.println("Aguardando resultado dos demais candidatos");
    }
}
