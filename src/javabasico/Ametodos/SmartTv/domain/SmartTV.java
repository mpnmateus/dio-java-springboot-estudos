package javabasico.Ametodos.SmartTv.domain;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligarTv(){ ligada = true; }
    public void desligarTv(){ ligada = false; }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){ canal ++; }
    public void diminuirCanal(){ canal --; }

    public void aumentarVolume(){
        volume ++;
        System.out.println("O novo volume é " + volume);
    }
    public void diminuirVolume(){
        volume --;
        System.out.println("O novo volume é " + volume);
    }

    public boolean isLigada() { return ligada; }
    public int getCanal() { return canal; }
    public int getVolume() { return volume; }

}
