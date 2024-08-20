package javabasico.Eestruturasderepeticao;
import java.util.concurrent.ThreadLocalRandom;

public class MesadaDoces {
    public static void main(String[] args) {
        double mesada = 50;
        int quantidadeDoces = 0;

        while (mesada > 0){
            double valorDoce = valorAleatorio();

            //verificação para evitar que, dependendo da regra de negócios, se possa comprar ao menos um doce
            if (valorDoce > mesada)
                valorDoce = mesada;


            System.out.println("Doce de valor R$" + valorDoce + " adicionado ao carrinho. ");
            mesada = mesada - valorDoce;
            quantidadeDoces++;

        }
        System.out.println("Saldo da mesada: R$ " + mesada);
        System.out.println("Foi possível comprar " + quantidadeDoces + " doces.");
    }
    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8); //range (intervalo) do valor dos doces
    }
}
