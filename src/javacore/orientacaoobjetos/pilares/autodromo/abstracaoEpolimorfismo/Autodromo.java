package javacore.orientacaoobjetos.pilares.autodromo.abstracaoEpolimorfismo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("08080465");

        Moto z400 = new Moto();
        z400.setChassi("0498498498");

        Veiculo coringa = jeep;
        coringa.ligar();

        coringa = z400;
        coringa.ligar();


    }
}
