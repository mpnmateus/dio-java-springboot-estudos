package javacore.orientacaoobjetos.pilares.servicomensageria.apps;

public class Telegram extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Recebendo mensagens pelo Telegram.");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Enviando mensagens pelo Telegram.");
    }
}
