package javacore.orientacaoobjetos.pilares.autodromo.encapsulamento;

public class Carro {
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
