package desafios.DesafioControleFluxo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o parâmetro 1: ");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o parâmetro 2: ");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e) {
            System.out.println("O valor digitado deve ser inteiro.");
        }
    }
    static void contar (int parametroUm, int ParametroDois) throws ParametrosInvalidosException {

    }
}
