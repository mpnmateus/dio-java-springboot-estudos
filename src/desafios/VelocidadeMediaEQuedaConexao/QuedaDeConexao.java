package desafios.VelocidadeMediaEQuedaConexao;

import java.util.Scanner;

public class QuedaDeConexao {
    public static String verificarQuedaConexao(String[] velocidades) {
        String analise = "Sem Quedas";
        for(String v : velocidades)
            if(Integer.parseInt(v) == 0){
                analise = "Queda de Conexao";
                break;
            }

        return analise;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}
