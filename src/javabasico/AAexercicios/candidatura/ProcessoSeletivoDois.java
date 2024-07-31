package javabasico.AAexercicios.candidatura;
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
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
