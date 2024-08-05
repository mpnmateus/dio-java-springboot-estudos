package desafios.com.iphone.model;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical{

    //Métodos relacionados ao aparelho telefônico
    @Override
    public void ligar(String numero){
        System.out.println("Ligando através do iphone..");
    }
    @Override
    public void atender(){
        System.out.println("Atendendo a partir do iphone..");
    }
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz a partir do iphone..");
    }

    @Override
    public void tocar(){
        System.out.println("Tocando mídia a partir do iphone.");
    }
    @Override
    public void pausar(){
        System.out.println("Pausando mídia a partir do iphone.");
    }
}
