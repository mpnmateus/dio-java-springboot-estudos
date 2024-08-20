package javacore.orientacaoobjetos.pilares.autodromo.heranca;


public class Carro extends Veiculo {
    public void ligar(){
        conferirCambio();
        conferirCombustivel();
        System.out.println("Carro ligado!");
    }
    private void conferirCambio(){
        System.out.println("Conferindo câmbio em P.");
    }
    private void conferirCombustivel(){
        System.out.println("Conferindo combustivel.");
    }
}
