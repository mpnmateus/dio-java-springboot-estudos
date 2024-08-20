package javacore.orientacaoobjetos.pilares.servicomensageria.user;

import javacore.orientacaoobjetos.pilares.servicomensageria.apps.FacebookMessenger;
import javacore.orientacaoobjetos.pilares.servicomensageria.apps.MSNMessenger;
import javacore.orientacaoobjetos.pilares.servicomensageria.apps.ServicoMensagemInstantanea;
import javacore.orientacaoobjetos.pilares.servicomensageria.apps.Telegram;

import java.util.Locale;
import java.util.Scanner;


public class ComputadorPedrinho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ServicoMensagemInstantanea smi = null;
		/*
		    NÃO SE SABE QUAL APP
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
        System.out.println("---- Escolha qual serviço de mensageria você quer usar ----");
        System.out.println("---- Opções: msn, fbm ou tlg ----");
        String appEscolhido = scanner.next();
        try {
            if(appEscolhido.equals("msn"))
                smi = new MSNMessenger();
            else if(appEscolhido.equals("fbm"))
                smi = new FacebookMessenger();
            else if(appEscolhido.equals("tlg"))
                smi = new Telegram();

            smi.enviarMensagem();
            smi.receberMensagem();
        } catch (NullPointerException e) {
            System.out.println("As opções devem ser: msn, fbm ou tlg");
        }
    }
}

