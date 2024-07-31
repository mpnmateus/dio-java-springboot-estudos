package javabasico.AAexercicios.candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivoDois {
    public static void main(String[] args) {
        selecionarCandidatos();
    }
    static void selecionarCandidatos(){
        double valorBaseSalarial = 2000;
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        String [] candidatosSelecionados = new String[candidatos.length];

        double salarioPretendido = 0;
        int quantidadeCandidatos = 0;
        while(quantidadeCandidatos <= 5) {
            for (int i = 0; i < candidatos.length; i++) {
                salarioPretendido = valorPretendido();
                if (salarioPretendido <= valorBaseSalarial) {
                    //System.out.println(candidatos[i]);
                    candidatosSelecionados[i] = candidatos [i];
                }
                quantidadeCandidatos++;
            }
        }
        imprimirCandidatos(candidatosSelecionados);
    }
    static void imprimirCandidatos(String [] candidatosSelecionados){
        System.out.println("\nA lista de candidatos selecionados é: ");
        for (int i = 0; i < candidatosSelecionados.length; i++) {
            if (candidatosSelecionados[i] != null) {
                System.out.println(candidatosSelecionados[i]);
            }
        }
        //Forma alternativa usando for each
        System.out.println("\nA lista de candidatos selecionados é: ");
        for (String candidato : candidatosSelecionados) {
            if (candidato != null) {
                System.out.println(candidato);
            }
        }
        System.out.println("\nTentativas de contato por parte do RH: ");
        for(String candidato: candidatosSelecionados) {
            ligacaoRh(candidato);
        }
    }

    static void ligacaoRh(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");


    }
    //Método auxiliar que simula, através de uma expressão randômica que, se o valor entre 1 e 3 for 1,
    //quer dizer que atendeu
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
