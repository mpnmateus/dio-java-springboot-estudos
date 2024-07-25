package javabasico.Ametodos.SmartTv.test;

import javabasico.Ametodos.SmartTv.domain.SmartTV;

public class User {

    public static void main(String[] args) {
        SmartTV smartTv= new SmartTV();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        //Mostra status de canal, muda canal, mostra status novamente
        System.out.println("O canal atual da TV é: " + smartTv.getCanal());

        smartTv.mudarCanal(13);

        System.out.println("O canal atual da TV é: " + smartTv.getCanal());

        System.out.println("O volume atual da TV é: " + smartTv.getVolume());

        System.out.println("A TV está ligada? " + smartTv.isLigada());
        smartTv.ligarTv();
        System.out.println("O novo status da TV é: " + smartTv.isLigada());

    }
}
