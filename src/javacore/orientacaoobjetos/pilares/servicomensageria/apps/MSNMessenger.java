package javacore.orientacaoobjetos.pilares.servicomensageria.apps;

public class MSNMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Recebendo mensagens pelo MSN.");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Enviando mensagens pelo MSN.");
    }
}
