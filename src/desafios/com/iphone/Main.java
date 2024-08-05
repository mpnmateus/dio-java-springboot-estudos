package desafios.com.iphone;

import desafios.com.iphone.model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("--------- Funções de reprodutor de mídia ----------");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Sinfonia No. 9 - Beethoven");

        System.out.println("\n--------- Funções de telefone ----------");
        iphone.ligar("3232-4040");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\n--------- Funções de internet ----------");
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
