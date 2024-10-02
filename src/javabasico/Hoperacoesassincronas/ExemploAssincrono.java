package javabasico.Hoperacoesassincronas;

import java.util.concurrent.CompletableFuture;

public class ExemploAssincrono {
    public static void main(String[] args) {
        // Forma correta -  processa o resultado assíncrono quando ele estiver disponível:
        ExemploAssincrono.calcularSomaAssincrona(5, 3).thenAccept(resultado -> System.out.println(resultado));



//        System.out.println(ExemploAssincrono.calcularSomaAssincrona(5, 3));
//        ExemploAssincrono.calcularSomaAssincrona(5, 3).exceptionally(ex -> { ex.printStackTrace(); return 0; });

    }
    public static CompletableFuture<Integer> calcularSomaAssincrona(int a, int b){
        return CompletableFuture.supplyAsync(() -> {
           try{
               Thread.sleep(1000);
           } catch (InterruptedException e){
                e.printStackTrace();
           }
           return a + b;
        });
    }
}
