package javacore.orientacaoobjetos.pilares.servicomensageria.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente filhos e classes do mesmo pacote conhecem esses métodos (protected)
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico de mensagens no servidor cloud");
    }

    protected void validarConectadoInternet(){
        System.out.println("Validando conexão com a internet.");
    }
}
