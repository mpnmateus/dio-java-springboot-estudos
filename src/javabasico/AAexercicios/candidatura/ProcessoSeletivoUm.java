package javabasico.AAexercicios.candidatura;

import java.util.Scanner;

public class ProcessoSeletivoUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorBaseSalarial = 2000;
        System.out.println("Digite o salário pretendido pelo candidato");
        double salarioPretendido = scan.nextDouble();

        analisarCandidato(valorBaseSalarial, salarioPretendido);
    }
    static void analisarCandidato(double valorBaseSalarial, double salarioPretendido){
        if (valorBaseSalarial > salarioPretendido)
            System.out.println("Ligar para o candidato.");
        else if (valorBaseSalarial == salarioPretendido)
            System.out.println("Ligar para o candidato c/ contraproposta");
        else
            System.out.println("Aguardando resultado dos demais candidatos");
    }
}
