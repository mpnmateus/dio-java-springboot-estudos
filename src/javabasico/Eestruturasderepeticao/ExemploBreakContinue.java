package javabasico.Eestruturasderepeticao;
public class ExemploBreakContinue {
    public static void main(String[] args) {
        //O  comando interrompe o laço
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            System.out.println(numero);
        }
        System.out.println("-------------");
        //O comando continue interrompe somente a iteração atual
        for (int x = 1; x <= 5; x++){
            if (x == 3)
                continue;
            System.out.println(x);
        }
    }
}
