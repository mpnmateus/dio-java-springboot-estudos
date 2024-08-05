package desafios.com.iphone.model;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    //Métodos relacionados ao aparelho telefônico
    @Override
    public void ligar(String numero){
        System.out.println("Ligando para o número "+ numero + " através do iphone..");
    }
    @Override
    public void atender(){
        System.out.println("Atendendo a partir do iphone..");
    }
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz a partir do iphone..");
    }

    //Métodos relacionados ao reprodutor musical
    @Override
    public void tocar(){
        System.out.println("Tocando mídia a partir do iphone.");
    }
    @Override
    public void pausar(){
        System.out.println("Pausando mídia a partir do iphone.");
    }
    @Override
    public void selecionarMusica(String musica){
        System.out.println("Reproduzindo a música: '" + musica + "' através do iphone.");
    }

    //Métodos relacionados ao navegador de internet
    @Override
    public void exibirPagina(String url){
        System.out.println("Exibindo a página '"+ url + "'");
    }
    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba.");
    }
    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando página.");
    }

}

