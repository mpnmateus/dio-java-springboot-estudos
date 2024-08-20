package javacore.orientacaoobjetos.pilares.servicomensageria.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Recebendo mensagens pelo Facebook.");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Enviando mensagens pelo Facebook.");
    }

}
