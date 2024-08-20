package javacore.orientacaoobjetos.enums;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() +" - "+ e.getNome());
        }
        //selecionando um estado a partir das opções disponíveis
        EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;

        System.out.println("O estado selecionado foi: " + eb.getNome());
    }
}


